import java.beans.EventHandler;
import java.security.cert.CertificateNotYetValidException;
import java.util.ArrayList;

public class GamePlay {
	private int westProgress = 0;
	TextProcessor tp = new TextProcessor();

	/**
	 * Constructor for gameplay
	 */
	GamePlay(Map map, Wagon wagon) {



		while (true) {
			// Print out description of current environment
			System.out.println(map.getEnvironment(westProgress).getDescription());
			// Allow user to make a choice

			switch(tp.processText()) {
				case "goWest": westProgress++; break;
				case "inventory": System.out.println(wagon.getInventory());
				default: System.out.println("You can't do that");
			}

			//}

			// if river stuff
			// test to see if wagon can make it
			// if fast river possibly have stuff fall off wagon

			// if plains stuff

			// if forest stuff
			//break;
		}
	}


}
