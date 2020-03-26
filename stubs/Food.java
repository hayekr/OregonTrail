public class Food extends Item {
	private int expirationTime;
	private boolean isExpired;

	/**
	 * @param name the name of the food item
	 * @param weightPerUnit the weight of the food item per unit
	 * @param quantity the number of food items of this type
	 * @param expirationTime the time until the food expires
	 * @param isExpired whether or not the food has already expired
	 */
	Food(String name, double weightPerUnit, int quantity, int expirationTime, boolean isExpired) {
		super(name, weightPerUnit, quantity);
		this.expirationTime = expirationTime;
		this.isExpired = isExpired;
	}

	/**
	 * Default Constructor
	 */
	Food() {
		this("",0,0,0,false);
	}

	/**
	 * Get the expiration time of the food item
	 * @return the time until the item expires
	 */
	public int getExpirationTime() {
		return expirationTime;
	}

	/**
	 * Set the time until the food item expires
	 * @return true if set, false otherwise
	 */
	public boolean setExpirationTime() {
		return false;
	}

	/**
	 * Get the status of whether or not the food is expired
	 * @return true if the food is expired, false otherwise
	 */
	public boolean getExpiredStatus() {
		// check if it is expired first
		return isExpired;
	}

	/**
	 * Set the status of whether or not a food item is expired
	 * @param status true of the food is expired, false otherwise
	 */
	public void setExpiredStatus(boolean status) {

	}
}
