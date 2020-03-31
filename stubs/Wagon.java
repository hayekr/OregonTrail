import java.util.ArrayList;

public class Wagon {
	protected int quality;
	protected int capability;
	ArrayList<Item> contents = new ArrayList<Item>();
	ArrayList<Person> people = new ArrayList<Person>();

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

	/**addItem
	 * Adds an item to the wagon
	 * @param item the item to be added
	 */
	public void addItem(Item item) {
		contents.add(item);
	}

	/**removeItem
	 * Removes an item from the wagon
	 * @param index the item to be removed
	 * @return true if removed, false otherwise
	 */
	public boolean removeItem(int index) {
		if (index >= contents.size()) return false;
		contents.remove(index);
		return true;
	}

	/**getQuality
	 * Get the quality of the wagon
	 * @return the quality of the wagon
	 */
	public int getQuality() {
		return quality;
	}

	/**setQuality
	 * Set the quality of the wagon
	 * @param quality the desired quality
	 * @return true if set, false otherwise
	 */
	public boolean setQuality(int quality) {
		if (quality >= 1500 || quality <= 0) {
			return false;
		}
		this.quality = quality;
		return true;
	}

	/**addPerson
	 * Add a person to the wagon
	 * @param person the person to be added
	 */
	public void addPerson(Person person) {
		people.add(person);
	}

	/**removePerson
	 * Remove a person from the wagon
	 * @param index the person to be removed
	 * @return true if removed, false otherwise
	 */
	public boolean removePerson(int index) {
		if (index >= people.size()) return false;
		people.remove(index);
		return true;
	}

	/**getCapability
	 * Get the capability of the wagon
	 * @return the capability of the wagon
	 */
	public int getCapability() {
		return capability;
	}

	/**setCapability
	 * Set the capability of the wagon
	 * @param capability the desired capability of the wagon
	 * @return true if set, false otherwise
	 */
	public boolean setCapability(int capability) {
		if (capability >= 100 || capability <= 0) {
			return false;
		}
		this.capability = capability;
		return true;
	}

	/**getTotalWeight
	 * Get the total weight of the items in the wagon combined
	 * @return the total weight of the items in the wagon combined
	 */
	public double getTotalWeight(){
		double total = 0;
		for (int i = 0; i < contents.size(); i++){
			total += contents.get(i).getWeight();
		}
		return total;
	}

	/**isOverweight
	 * check to see if the wagon can hold the load
	 * @return true if the wagon is too heavy, false otherwise
	 */
	public boolean isOverweight(){
		return quality > getTotalWeight();
	}
}
