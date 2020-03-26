import java.util.ArrayList;

public class Wagon {
	int quality;
	ArrayList<Item> contents = new ArrayList<Item>();
	ArrayList<Person> people = new ArrayList<Person>();
	int capability;

	/**
	 * Constructor for Wagon
	 * @param quality the quality of the wagon (carrying capacity)
	 * @param capability the capability of the wagon (river crossing depth)
	 */
	Wagon(int quality, int capability) {
		this.quality = quality;
		this.capability = capability;
	}

	/**
	 * Default Constructor
	 */
	Wagon() {
		this(0, 0);
	}

	/**
	 * Add an item to the wagon
	 * @param item the item to be added
	 */
	public void addItem(Item item) {
		contents.add(item);
	}

	/**
	 * Remove an item from the wagon
	 * @param index the item to be removed
	 * @return true if removed, false otherwise
	 */
	public boolean removeItem(int index) {
		if (index >= contents.size()) return false;
		contents.remove(index);
		return true;
	}

	/**
	 * Get the quality of the wagon
	 * @return the quality of the wagon
	 */
	public int getQuality() {
		return quality;
	}

	/**
	 * Set the quality of the wagon
	 * @param quality the desired quality
	 * @return true if set, false otherwise
	 */
	public boolean setQuality(int quality) {
		if (quality >= 100 || quality <= 0) {
			return false;
		}
		this.quality = quality;
		return true;
	}

	/**
	 * Add a person to the wagon
	 * @param person the person to be added
	 */
	public void addPerson(Person person) {
		people.add(person);
	}

	/**
	 * Remove a person from the wagon
	 * @param index the person to be removed
	 * @return true if removed, false otherwise
	 */
	public boolean removePerson(int index) {
		return false;
	}

	/**
	 * Get the capability of the wagon
	 * @return the capability of the wagon
	 */
	public int getCapability() {
		return capability;
	}

	/**
	 * Set the capability of the wagon
	 * @param capability the desired capability of the wagon
	 * @return true if set, false otherwise
	 */
	public boolean setCapability(int capability) {
		return false;
	}
}
