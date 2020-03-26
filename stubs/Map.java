import java.io.File;
import java.util.ArrayList;

public class Map {
	ArrayList<Environment> environmentList = new ArrayList<Environment>();

	/**
	 * Used to load the map from a file
	 * @param csvfile the file storing the map
	 * @return true if successfully loaded, false otherwise
	 */
	public boolean generateEnvironment(File csvfile) {
		return false;
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
}
