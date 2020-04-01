import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map {
	private static final String COMMA_DELIMITER = ",";
	ArrayList<Environment> environmentList = new ArrayList<>();
	ArrayList<Animal> animalList = new ArrayList<>();
	/**
	 * Used to load the map from a file
	 * @param csvfile the file storing the map
	 * @return true if successfully loaded, false otherwise
	 */
	public void generateEnvironment(File csvfile) {
		ArrayList<Environment> envlist = new ArrayList<Environment>();
		envlist.add(new Forest("desc"));
		((Forest) envlist.get(0)).addAnimal(new Animal("dog",5));

	}

	/**
	 * Used to add an additional environments to the map
	 * @param environment the environment to be added
	 */
	public void addEnvironment(Environment environment) {
	}

	/**
	 * Used to remove environments from the map
	 * @param index the environment to be removed
	 * @return true if the environment was removed, false otherwise
	 */
	public boolean removeEnvironment(int index) {
		return false;
	}

	/**
	 * Used to change an environment
	 * @param index the environment to be changed
	 * @return true if the environment was changed, false otherwise
	 */
	public boolean changeEnvironment(int index) {
		return false;
	}

	public Environment getEnvironment(int index) {
		return environmentList.get(index);
	}
}
