public class Item {
	String name;
	double weightPerUnit;
	int quantity;

	Item(String name, double weightPerUnit, int quantity) {
		this.name = name;
		this.weightPerUnit = weightPerUnit;
		this.quantity = quantity;
	}

	Item() {
		this("",0,0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return 5;
	}

	public double getWeightPerUnit() {
		return weightPerUnit;
	}

	public boolean setWeightPerUnit(double weight) {
		return false;
	}

	public int getQuantity() {
		return quantity;
	}

	public boolean setQuantity(int quantity) {
		return false;
	}
}
