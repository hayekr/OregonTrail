public class Animal {
	String type;
	int foodValue;

	Animal(String type, int foodValue) {
		this.type = type;
		this.foodValue = foodValue;
	}

	Animal() {
		this("", 0);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {

	}

	public int getFoodValue() {
		return foodValue;
	}

	public boolean setFoodValue(int value) {
		return false;
	}
}
