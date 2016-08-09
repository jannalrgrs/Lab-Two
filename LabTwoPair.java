
import java.util.Scanner;

public class LabTwoPair {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		
		String input = "";
		String choice = "Yes";
		int state = 1;

		System.out.println("Welcome! What is your name? (enter your name)");
		input = scan1.nextLine();

		System.out.println("Welcome " + input + "! Would you like to play a game? (enter yes or no)");
		choice = scan1.nextLine();

		while (choice.equalsIgnoreCase("yes")) {
			switch (state) {
			
			case 1:
				System.out.println("You are walking across a field and you encounter a dragon");
				System.out.println("What do you do? Enter 'Face the beast' or 'run away'");
				input = scan1.nextLine();
				if (input.equalsIgnoreCase("face the beast")) {
					state = 2;
				} else {
					System.out.println("goodbye!");
					break;
				}
			case 2:
				System.out.println("You approach the dragon, you see that he has _____ heads. (Enter 1, 2, or 3)");
				input = scan1.nextLine();
				if (input.equalsIgnoreCase("3")) {
					state = 3;
				} else if (input.equalsIgnoreCase("2") || input.equalsIgnoreCase("1")) {
					System.out.println("1 and 2 - headed dragons are friendly, you end your quest.");
					break;
				}
			case 3:
				System.out.println(
						"No one has ever faced a 3-headed dragon before! Choose your weapon (enter 'slingshot', 'sword' or 'bow and arrow'");
				input = scan1.nextLine();
				if ((input.equalsIgnoreCase("bow and arrow") || input.equalsIgnoreCase("slingshot")
						|| input.equalsIgnoreCase("sword"))) {
					System.out.println("Armed with your " + input + " you approach the beast.");
					state = 4;
				} else {
					System.out.println("That is not a good weapon choice.");
					break;
				}
			case 4:
				System.out.println("It stares at you with it's fiery ______ eyes (enter 'red' or 'blue'");
				input = scan1.nextLine();
				if (input.equalsIgnoreCase("Red")) {
					System.out.println(
							"Whew! Red-eyed dragons are friendly! You become best friends. You name the dragon ____(enter a name)");
					input = scan1.nextLine();
					System.out.println("You and " + input + " live happily ever after");
					break;
				} else {
					System.out.println("You're dead.");
					break;
				}
			
			}
			System.out.println("Do you wish to play again?");
			choice = scan1.nextLine();
		}
		
	}

}
