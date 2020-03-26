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

	public int getQuality() {
		return quality;
	}

	public boolean setQuality() {
		if (quality >= 100 || quality <= 0) {
			return false;
		}
		this.quality = quality;
		return true;
	}

	public void addPerson(Person person) {
		people.add(person);
	}

	public boolean removePerson(int index) {
		return false;
	}

	public int getCapability() {
		return capability;
	}

	public boolean setCapability() {
		return false;
	}
}
