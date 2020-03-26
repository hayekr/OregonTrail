import java.util.ArrayList;

public class Plains extends Environment {
	ArrayList<Animal> animals = new ArrayList<Animal>();

	Plains(String description) {
		super(description);
	}

	Plains() {
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
