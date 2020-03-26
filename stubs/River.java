public class River extends Environment {
	int depth;
	int speed;

	River(String description, int depth, int speed) {
		super(description);
		this.depth = depth;
		this.speed = speed;
	}

	River() {
		this("",0,0);
	}

	public int getSpeed() {
		return speed;
	}

	public boolean setSpeed(int speed) {
		return false;
	}

	public int getDepth() {
		return depth;
	}

	public boolean setDepth(int depth) {
		return false;
	}
}
