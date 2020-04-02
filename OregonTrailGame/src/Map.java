import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Map {
	private static final String COMMA_DELIMITER = ",";

	/**
	 * Used to load the map from a file
	 *
	 * @param csvfile the file storing the map
	 * @return true if successfully loaded, false otherwise
	 */

	ArrayList<ArrayList<String>> dataFromFile = new ArrayList<ArrayList<String>>();
	public ArrayList<ArrayList<String>> parseDataFromCsvFile(File csvfile) {
		try {
			Scanner scanner = new Scanner(new FileReader(csvfile));
			scanner.useDelimiter(",");

			while (scanner.hasNext()) {
				String dataInRow = scanner.nextLine();
				String[] dataInRowArray = dataInRow.split(",");
				ArrayList<String> rowDataFromFile = new ArrayList<String>(Arrays.asList(dataInRowArray));
				dataFromFile.add(rowDataFromFile);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return dataFromFile;
	}

	/**
	 * Used to add an additional environments to the map
	 *
	 * @param environment the environment to be added
	 */
	public void addEnvironment(ArrayList<String> environment) {
		dataFromFile.add(environment);
	}

	/**
	 * Used to remove environments from the map
	 *
	 * @param index the environment to be removed
	 * @return true if the environment was removed, false otherwise
	 */
	public void removeEnvironment(int index) {
		try {
			dataFromFile.remove(index);
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}


	public void getEnvironment(int index) {
		try {
			dataFromFile.get(index);
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
