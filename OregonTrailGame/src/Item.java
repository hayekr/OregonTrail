public class Item {
	protected String name;
	protected double weightPerUnit;
	protected int quantity;

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

	/**getName
	 * Get the name of the item
	 * @return the name of the item
	 */
	public String getName() {
		return this.name;
	}

	/**setName
	 * Set the name of the item
	 * @param name the desired name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**getWeight
	 * Get the weight of the items of one kind altogether
	 * @return the weight of the items
	 */
	public double getWeight() {
		return this.quantity * this.weightPerUnit;
	}

	/**getWeightPerUnit
	 * Get the weight per unit of the item
	 * @return the weight per unit of the item
	 */
	public double getWeightPerUnit() {
		return this.weightPerUnit;
	}

	/**setWeightPerUnit
	 * Set the weight of the item per unit
	 * @param weight the desired weight per unit of the item
	 * @return true if changed, false otherwise
	 */
	public boolean setWeightPerUnit(double weight) {
		if (weight >= 100 || weight <= 0) {
			return false;
		}
		this.weightPerUnit = weight;
		return true;
	}

	/**getQuantity
	 * Get the quantity of the item
	 * @return the number of items of this type
	 */
	public int getQuantity() {
		return this.quantity;
	}

	/**setQuantity
	 * Set the number of items
	 * @param quantity the number of items
	 * @return true if set, false otherwise
	 */
	public boolean setQuantity(int quantity) {
		if (quantity >= 100 || quantity <= 0) {
			return false;
		}
		this.weightPerUnit = quantity;
		return true;
	}
}
