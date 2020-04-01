import java.util.ArrayList;

public class Environment {
	String type;
	String description;
	ArrayList<Animal> animals = new ArrayList<Animal>();

	/**
	 * Constructor for Environment
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
	}

	/**
	 * Used to get the description of an environment
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

	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
}
