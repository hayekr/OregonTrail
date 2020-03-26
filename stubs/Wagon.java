import java.util.ArrayList;

public class Wagon {
	int quality;
	ArrayList<Item> contents = new ArrayList<Item>();
	ArrayList<Person> people = new ArrayList<Person>();
	int capability;

	Wagon(int quality, int capability) {
		this.quality = quality;
		this.capability = capability;
	}

	Wagon() {
		this(0, 0);
	}

	public void addItem(Item item) {
		contents.add(item);
	}

	public boolean removeItem(int index) {
		if (index >= contents.size()) return false;
		contents.remove(index);
		return true;
	}


}
