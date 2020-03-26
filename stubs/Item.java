public class Item {
	String name;
	double weightPerUnit;
	int quantity;

	/**
	 * Constructor for Item
	 * @param name the name of the item
	 * @param weightPerUnit the weight of the unit per item
	 * @param quantity the number of the item
	 */
	Item(String name, double weightPerUnit, int quantity) {
		this.name = name;
		this.weightPerUnit = weightPerUnit;
		this.quantity = quantity;
	}

	/**
	 * Default Constructor
	 */
	Item() {
		this("",0,0);
	}

	/**
	 * Get the name of the item
	 * @return the name of the item
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the item
	 * @param name the desired name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the weight of the items altogether
	 * @return the weight of the items
	 */
	public int getWeight() {
		return 5;
	}

	/**
	 * Get the weight per unit of the item
	 * @return the weight per unit of the item
	 */
	public double getWeightPerUnit() {
		return weightPerUnit;
	}

	/**
	 * Set the weight of the item per unit
	 * @param weight the desired weight per unit of the item
	 * @return true if changed, false otherwise
	 */
	public boolean setWeightPerUnit(double weight) {
		return false;
	}

	/**
	 * Get the quantity of the item
	 * @return the number of items of this type
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Set the number of items
	 * @param quantity the number of items
	 * @return true if set, false otherwise
	 */
	public boolean setQuantity(int quantity) {
		return false;
	}
}
