import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	//Wagon wagon = new Wagon;

	public static void main(String[] args) throws FileNotFoundException {
		// Introducing user to game
		introduction();

		// Allow user to fill wagon
		// Need to add WagonFiller class - read from csv file
		fillWagon();

		// Allow user to go on travels
		// Force to go west only? It is just MVP, not real program. Ex map is 7 tiles long, start, mix of river/forest/plains, end?
		// Will need to write MapGenerator class
		// If not just MVP, could allow movement in all 4 directions
		GamePlay game = new GamePlay();
	}

	public static void introduction() {
		// info here
	}

	public static void fillWagon() {

	}

}
