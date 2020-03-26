import java.util.ArrayList;

public class Plains extends Environment {
	ArrayList<Animal> animals = new ArrayList<Animal>();

	/**
	 * Constructor for plains
	 * @param description the description of the environment
	 */
	Plains(String description) {
		super(description);
	}

	/**
	 * Default constructor
	 */
	Plains() {
		super("");
	}

	/**
	 * Get the list of animals
	 * @return an ArrayList containing the animals
	 */
	public ArrayList<Animal> getAnimals() {
		return animals;
	}

	/**
	 * Get a specific animal
	 * @param index the index of the desired animal
	 * @return the animal requested
	 */
	public Animal getAnimal(int index) {
		return animals.get(index);
	}

	/**
	 * Add an animal to the environment
	 * @param animal the animal to be added
	 */
	public void addAnimal(Animal animal) {

	}

	/**
	 * Remove an animal from the environment
	 * @param index the index of the animal to be removed
	 * @return true if the animal was removed, false otherwise
	 */
	public boolean removeAnimal(int index) {
		return false;
	}
}
