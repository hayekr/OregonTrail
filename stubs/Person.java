public class Person {
	String name;
	int age;
	int health;

	Person(String name, int age, int health) {
		this.name = name;
		this.age = age;
		this.health = health;
	}

	Person() {
		this("",0,0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public boolean setAge(int age) {
		return false;
	}

	public int getHealth() {
		return health;
	}

	public boolean setHealth(int health) {
		return false;
	}
}
