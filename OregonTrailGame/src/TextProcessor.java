import java.awt.*;
import java.util.Scanner;

// Might want to make static? Since it will always be used, no point in constant instantiation of it
// Replace all system.out with calls to Action class
public class TextProcessor {
	Scanner sc = new Scanner(System.in);

	String[] userInputArray;

	/**
	 * Default Constructor
	 */
	TextProcessor() {

	}

	public String processText() {
		String userInput = sc.nextLine();
		// Modify user input to be easily parsed
		userInputArray = userInput.toUpperCase().trim().split(" ");

		// Initial Verb Parsing
		switch(userInputArray[0]) {
			case "LOOK": return lookHandler();
			case "INVENTORY": return inventoryHandler();
			case "GO":
			case "MOVE": return movementHandler();
		}
	return "x";
	}

	public String lookHandler() {
		System.out.println("lookHandler");
		return "x";
	}

	public String inventoryHandler() {
		System.out.println("inventoryHandler");
		return "x";
	}

	public String movementHandler() {
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
		return "x";
	}

	public String moveHandler() {
		System.out.println("moveHandler");
		return "x";
	}

	public String error() {
		System.out.println("Sorry, I didn't understand that");
		//return processText();
		return "x";
	}
}
