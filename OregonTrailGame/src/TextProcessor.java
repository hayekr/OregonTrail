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
		return "";
	}

	public String lookHandler() {
		return "lookaround";
	}

	public String inventoryHandler() {
		return "inventory";
	}

	public String movementHandler() {
		switch(userInputArray[1]) {
			case "UP":
			case "NORTH": break;
			case "DOWN":
			case "SOUTH": break;
			case "RIGHT":
			case "EAST": break;
			case "LEFT":
			case "WEST": return "goWest";
		}
		return "";
	}

	public String error() {
		System.out.println("Sorry, I didn't understand that");
		//return processText();
		return "error";
	}
}
