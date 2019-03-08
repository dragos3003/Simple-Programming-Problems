import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class App {

	private static Scanner scan;

	public static void main(String[] args) {
		int randomNumber = ThreadLocalRandom.current().nextInt(/* min value */1, /* max value + 1 */10 + 1);
		System.out.println("Guess a number between 1 and 10");
		
		scan = new Scanner(System.in);
		boolean user = false;
		int numOfGuesses = 0;
		int oldGuess=0;

		while (user == false) {
			int userGuess = scan.nextInt();
			if (userGuess == randomNumber) {
				numOfGuesses++;
				user = true;
				System.out.println("you won in: " + numOfGuesses + " tries");
				break; // Game stops - the user found the right number
			}
			
			if(oldGuess != userGuess) {
				numOfGuesses++;				//Number of tries rises only if the user input is different then the previous try.
				oldGuess = userGuess;
			}
			
			if (userGuess < randomNumber) {
				System.out.println("Try a higher number");
			} else {
				System.out.println("Try a lower number");
				
			}
		}
	}
}
