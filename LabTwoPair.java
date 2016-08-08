
import java.util.Scanner;

public class LabTwoPair {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);

		int state = 1;
		boolean play = true;

		while (play == true) {

			switch (state) {
			case 1:
				System.out.println("Welcome! What is your name?");
				String name = scan1.next();
				System.out.println("Hello " + name + ".");
				System.out.println("Would you like to play the game? (Enter yes or no)"); // first
																							// y/n

				String choice = scan1.next();
				if (choice.equalsIgnoreCase("yes"))
					state = 2;
				else {
					System.out.println("Okay!  Have a great day!");

					play = false;
					break;
				}

			case 2:

				System.out
						.println("Excellent! Do you want to face the beast or run away? (Enter face the beast or run)");
				String choice2 = scan1.nextLine(); //scan1.nextLine(); needed for strings
				scan1.nextLine();

				if (choice2.equalsIgnoreCase("face")) { //multiple lines requires braces
					state = 3;
					
				} else {
					play = false;
					System.out.println("Okay! Have a great day!");
					break;
				}
			case 3:
				System.out.println("You approach the dragon.  You see that he has ___ heads.  (Enter one, two or three)");
				String choice3 = scan1.nextLine();
				if (choice3.equalsIgnoreCase("three") || choice3.equalsIgnoreCase("two")) {
					state = 4;
				}

				else {
					System.out.println("No one wants to fight a one headed dragon.  You end your quest.");
					play = false;
					scan1.nextLine();
					break;
				}

			case 4:
				System.out.println(
						"No one has ever face a dragon with two or more heads! Choose your weapon (enter slingshot, sword, or bow and arrow");
				String choice4 = scan1.nextLine();
				scan1.nextLine();
				if (choice4.equalsIgnoreCase("sword") || choice4.equalsIgnoreCase("slingshot")
						|| choice4.equalsIgnoreCase("bow")) {
					state = 5;
				} else {
					System.out.println("Your fists wont' kill a dragon, you're done.");
					play = false;
					break;
				}
			case 5:
				System.out.println("Armed with your weapon of choice, you approach the dragon!  You can feel its fiery breath as you get closer.  It stares at you with its __ eyes.  (enter red or blue)");
				String choice5 = scan1.nextLine();
				if (choice5.equalsIgnoreCase("red")) {
					state = 6;

				} else {
					System.out.println("Blue-eyed dragons are the worst, run!");
					break;
				}

			case 6:
				if (play = true) {
					System.out.println("Thank goodness! Red-eyed dragons are friendly! You name the dragon ___");
					String choice6 = scan1.nextLine();
					System.out.println("You and " + choice6 + " live happily ever after.");
					play = false; // cleaner than system.exit; play = false will save your program
				}

			}

		}

	}

}