import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Hashtable;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// Introducing user to game
		introduction();

		// Allow user to fill wagon
		// Need to add WagonFiller class - read from csv file
		Wagon wagon = new Wagon();
		fillWagon(wagon);

		// Allow user to go on travels
		// Force to go west only? It is just MVP, not real program. Ex map is 7 tiles long, start, mix of river/forest/plains, end?
		// Will need to write MapGenerator class
		// If not just MVP, could allow movement in all 4 directions
		//GamePlay game = new GamePlay(wagon);

		File csvFile = new File("OregonTrailGame/src/Map_Oregon_Trail.csv");
		Map newMap = new Map();
		ArrayList<ArrayList<String>> csvFileData = newMap.parseDataFromCsvFile(csvFile);
		System.out.println("\n You are in" + csvFileData.get(0).get(0));

		new GamePlay(newMap, wagon);
	}

	public static void introduction() {
		// info here
		System.out.println("Welcome to the Oregon Trail Simulation!");
		System.out.println("In this simulation you will choose what items to pack in your wagon ");
		System.out.println("and make your journey west on the Oregon Trail. Throughout the simulation,");
		System.out.println("you will encounter different habitats, animals, and obstacles, so make sure");
		System.out.println("that you are well prepared! You will now begin to load your wagon. Good luck!");
	}

	public static void fillWagon(Wagon wagon) {
		System.out.println("Here are the items you can add to your wagon, please pick what you want: ");
		Hashtable<String, String> items_weight = new Hashtable<String, String>();

	}

}
