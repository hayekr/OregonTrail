import java.util.ArrayList;

public class Environment {
	String type;
	String description;
	int depth;
	int speed;
	ArrayList<Animal> animals = new ArrayList<>();

	/**
	 * Constructor for Environment
	 *
	 * @param description the description of the environment
	 */
	Environment(String type, String description) {
		setDescription(description);
	}

	/**
	 * Default constructor
	 */
	Environment() {
		this.description = "";
		this.type = "";
		this.depth = 0;
		this.speed = 0;
	}

	Environment(String type, String description, int depth, int speed) {
		this.type = type;
		setDescription(description);
		this.depth = depth;
		this.speed = speed;
	}

	/**
	 * Used to get the description of an environment
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Used to set the description of an environment
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Get the list of animals
	 *
	 * @return an ArrayList containing the animals
	 */
	public ArrayList<Animal> getAnimals() {
		return animals;
	}

	/**
	 * Get a specific animal
	 *
	 * @param index the index of the desired animal
	 * @return the animal requested
	 */
	public Animal getAnimal(int index) {
		return animals.get(index);
	}

	/**
	 * Add an animal to the environment
	 *
	 * @param animal the animal to be added
	 */
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}

	/**
	 * Remove an animal from the environment
	 *
	 * @param index the index of the animal to be removed
	 * @return true if the animal was removed, false otherwise
	 */
	public boolean removeAnimal(int index) {
		if (index > animals.size()) {
			return false;
		}
		animals.remove(index);
		return true;
	}

	/**
	 * Get the speed of the river
	 *
	 * @return the speed of the river
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed the desired speed of the river
	 * @return true if the speed was changed, false otherwise
	 */
	public boolean setSpeed(int speed) {
		if (speed < 0) {
			return false;
		}
		this.speed = speed;
		return true;
	}

	/**
	 * Get the depth of the river
	 *
	 * @return the depth
	 */
	public int getDepth() {
		return depth;
	}

	/**
	 * Set the depth of the river
	 *
	 * @param depth the desired depth of the river
	 * @return true if the depth was changed, false otherwise
	 */
	public boolean setDepth(int depth) {
		if (depth < 0) {
			return false;
		}
		this.depth = depth;
		return true;
	}
}
