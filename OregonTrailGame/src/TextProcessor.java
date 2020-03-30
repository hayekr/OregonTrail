import java.util.Scanner;

// Might want to make static? Since it will always be used, no point in constant instantiation of it
// Replace all system.out with calls to Action class
public class TextProcessor {
	Scanner sc = new Scanner(System.in);

	String[] userInputArray;

	public void processText() {
		String userInput = sc.nextLine();
		// Modify user input to be easily parsed
		userInputArray = userInput.toUpperCase().trim().split(" ");

		// Initial Verb Parsing
		switch(userInputArray[0]) {
			case "LOOK": lookHandler(); break;
			case "INVENTORY": inventoryHandler(); break;
			case "GO":
			case "MOVE": movementHandler(); break;
			case "drop": dropHandler(); break;
			case "move": moveHandler(); break;
		}
	}

	public void lookHandler() {
		System.out.println("lookHandler");
	}

	public void inventoryHandler() {
		System.out.println("inventoryHandler");
	}

	public void movementHandler() {
		System.out.println("movementHandler");
		switch(userInputArray[1]) {
			case "UP":
			case "NORTH": System.out.println("north"); break;
			case "DOWN":
			case "SOUTH": System.out.println("south"); break;
			case "RIGHT":
			case "EAST": System.out.println("east"); break;
			case "LEFT":
			case "WEST": System.out.println("west"); break;
		}
	}

	public void dropHandler() {
		System.out.println("dropHandler");
	}

	public void moveHandler() {
		System.out.println("moveHandler");
	}

	public void error() {
		System.out.println("error");
	}
}
