import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVReader {
	boolean fileHasBeenSet = false;
	File file;
	Scanner readFile;

	String fileReadError = "File read error";
	String outOfBoundsError = "Out of bounds error";

	// Rows are outer ArrayList, Columns are inner ArrayList
	ArrayList<ArrayList<String>> csvContents = new ArrayList<ArrayList<String>>();

	/**
	 * Constructor for CSVReader
	 * @param file the file to be read
	 * @throws FileNotFoundException
	 */
	CSVReader(File file) throws FileNotFoundException {
		this.file = file;
		if (file.exists()) {
			setFile(this.file);
			readFile();
			fileHasBeenSet = true;
		}
	}

	/**
	 * Default Constructor
	 */
	CSVReader() {

	}

	/**
	 * Read in a CSV file
	 * @return true if read properly, false otherwise
	 */
	public boolean readFile() {
		if (fileHasBeenSet) {
			int rowIndex = 0;
			while (readFile.hasNext()) {
				String rowTemp = readFile.nextLine();
				String[] rowTempArray = rowTemp.split(",");
				csvContents.add(new ArrayList<String>());
				for (int i = 0; i < rowTempArray.length; i++) {
					csvContents.get(rowIndex).add(rowTempArray[i]);
				}
				rowIndex++;
			}
			return true;
		}
		return false;
	}

	/**
	 * Set the file to be read
	 * @param file The file desired
	 * @return true if set, false otherwise
	 * @throws FileNotFoundException
	 */
	public boolean setFile(File file) throws FileNotFoundException {
		if (file.exists()) {
			this.file = file;
			readFile = new Scanner(this.file);
			fileHasBeenSet = true;
			return true;
		}
		fileHasBeenSet = false;
		return false;
	}

	/**
	 * Get a specific word
	 * @param rowIndex the row desired
	 * @param columnIndex the column desired
	 * @return the word in the row and column desired
	 */
	public String getWord(int rowIndex, int columnIndex) {
		if (!fileHasBeenSet) return fileReadError;
		if (rowIndex >= csvContents.size() || columnIndex >= csvContents.get(rowIndex).size()) return outOfBoundsError;
		return csvContents.get(rowIndex).get(columnIndex);
	}

	/**
	 * Get a row
	 * @param index the row to be returned
	 * @return an ArrayList containing the desired row
	 */
	public ArrayList<String> getRow(int index) {
		ArrayList<String> temp = new ArrayList<String>();
		if (!fileHasBeenSet) {
			temp.add(outOfBoundsError);
			return temp;
		}
		return csvContents.get(index);
	}

	/**
	 * Get a column
	 * @param index the column to be returned
	 * @return an ArrayList containing the desired column
	 */
	public ArrayList<String> getColumn(int index) {
		ArrayList<String> temp = new ArrayList<String>();
		if (!fileHasBeenSet) {
			temp.add(fileReadError);
			return temp;
		}
		for (int i = 0; i < csvContents.size(); i++) {
			if (csvContents.get(index).size() < index) {
				temp.add("");
				continue;
			}
			if (csvContents.get(i).get(index).equals(fileReadError)) {
				temp.add("");
				continue;
			}
			if (csvContents.get(i).get(index).equals(outOfBoundsError)) {
				temp.add("");
				continue;
			}
			temp.add(csvContents.get(i).get(index));
		}
		return temp;
	}
}
