public class Food extends Item {
	private int expirationTime;
	private boolean isExpired;

	Food(String name, double weightPerUnit, int quantity, int expirationTime, boolean isExpired) {
		super(name, weightPerUnit, quantity);
		this.expirationTime = expirationTime;
		this.isExpired = isExpired;
	}

	Food() {
		this("",0,0,0,false);
	}

	public int getExpirationTime() {
		return expirationTime;
	}

	public boolean setExpirationTime() {
		return false;
	}

	public boolean getExpiredStatus() {
		return isExpired;
	}

	public void setExpiredStatus() {

	}
}
