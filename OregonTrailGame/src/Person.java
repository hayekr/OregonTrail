public class Person {
	String name;
	int age;
	int health;

	/**
	 * Constuctor for person
	 * @param name the name of the person
	 * @param age the age of the person
	 * @param health the health of the person
	 */
	Person(String name, int age, int health) {
		this.name = name;
		this.age = age;
		this.health = health;
	}

	/**
	 * Default Constructor
	 */
	Person() {
		this("",0,0);
	}

	/**
	 * Get the name of the person
	 * @return the name of the person
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the person
	 * @param name the desired name of the person
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the age of a person
	 * @return the age of the person
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Set the age of the person
	 * @param age the desired age of the person
	 * @return true if changed, false otherwise
	 */
	public boolean setAge(int age) {
		if (age < 0) return false;
		this.age = age;
		return true;
	}

	/**
	 * Get the health of a person on a 0-100 scale
	 * @return the health of the person
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * Set the health level of a person
	 * @param health the desired health level
	 * @return true if changed, false otherwise
	 */
	public boolean setHealth(int health) {
		if (health < 0 || health > 100) {
			return false;
		}
		this.health = health;
		return true;
	}
}
