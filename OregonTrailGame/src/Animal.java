public class Animal {
	String type;
	int foodValue;

	/**
	 * Constructor for Animal
	 * @param type the type of animal
	 * @param foodValue the value of the food the animal can produce
	 */
	Animal(String type, int foodValue) {
		this.type = type;
		this.foodValue = foodValue;
	}

	/**
	 * Default Constructor
	 */
	Animal() {
		this("", 0);
	}

	/**
	 * Get the type of animal
	 * @return the type of animal
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set the type of animal
	 * @param type the type of animal
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Get the value of food the animal can produce
	 * @return the value of the food from the animal
	 */
	public int getFoodValue() {
		return foodValue;
	}

	/**
	 * @param value The value of food the animal can produce
	 * @return true if it was set, false otherwise
	 */
	public boolean setFoodValue(int value) {
		if (value < 0) return false;
		this.foodValue = value;
		return true;
	}
}
