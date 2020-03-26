public class River extends Environment {
	int depth;
	int speed;

	/**
	 * Constructor for river
	 * @param description the description of the environment
	 * @param depth
	 * @param speed
	 */
	River(String description, int depth, int speed) {
		super(description);
		this.depth = depth;
		this.speed = speed;
	}

	/**
	 * Default constructor
	 */
	River() {
		this("",0,0);
	}

	/**
	 * Get the speed of the river
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
		return false;
	}

	/**
	 * Get the depth of the river
	 * @return the depth
	 */
	public int getDepth() {
		return depth;
	}

	/**
	 * Set the depth of the river
	 * @param depth the desired depth of the river
	 * @return true if the depth was changed, false otherwise
	 */
	public boolean setDepth(int depth) {
		return false;
	}
}
