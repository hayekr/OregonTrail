import java.beans.EventHandler;
import java.security.cert.CertificateNotYetValidException;
import java.util.ArrayList;

public class GamePlay {
	private int westProgress = 0;
	TextProcessor tp = new TextProcessor();
	Wagon wagon;
	Map map;

	/**
	 * Constructor for gameplay
	 */
	GamePlay(Map map, Wagon wagon) {

		this.wagon = wagon;
		this.map = map;


		while (true) {
			// Print out description of current environment
			System.out.println(map.getEnvironment(westProgress));

			if (westProgress > 1) {
				break;
			}


			userInput();

			// if river stuff
			// test to see if wagon can make it
			// if fast river possibly have stuff fall off wagon

			// if plains stuff

			// if forest stuff
			//break;
		}

		System.out.println("Congratulations! You made it!");
	}


	private void userInput() {
		switch(tp.processText()) {
			case "goWest": westProgress++; break;
			case "inventory": System.out.println(wagon.getInventory()); break;
			case "lookaround": System.out.println(map.createEnvironment(westProgress).getDescription()); break;
			case "error": break;
			default: System.out.println("You can't do that");
		}
	}
}
