public class Environment {
	String description;

	/**
	 * Constructor for Environment
	 * @param description the description of the environment
	 */
	Environment(String description) {
		setDescription(description);
	}

	/**
	 * Default constructor
	 */
	Environment() {
		this("");
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
}
