import java.util.ArrayList;

public class Forest extends Environment {
	ArrayList<Animal> animals = new ArrayList<Animal>();

	/**
	 * Constructor for forest
	 * @param description the description of the environment
	 */
	Forest(String description) {
		super(description);
	}

	/**
	 * Default constructor
	 */
	Forest() {
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
		animals.add(animal);
	}

	/**
	 * Remove an animal from the environment
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
}
