import java.util.ArrayList;

public class Forest extends Environment {
	ArrayList<Animal> animals = new ArrayList<Animal>();

	Forest(String description) {
		super(description);
	}

	Forest() {
		super("");
	}

	public ArrayList<Animal> getAnimals() {
		return animals;
	}

	public Animal getAnimal(int index) {
		return animals.get(index);
	}

	public void addAnimal(Animal animal) {

	}

	public boolean removeAnimal(int index) {
		return false;
	}
}
