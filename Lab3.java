import java.util.Scanner;

public class Lab3 {

	public static int getPower(int x, int y) { // why did I have a double here before?
												
		int powerResult = 1;

		for (int i = 1; i <= y; i++) {
			powerResult = powerResult * x;

		}

		return powerResult;
	}

	public static void main(String[] args) {

		System.out.println("Enter an integer:");
		int number = 0;

		Scanner scan1 = new Scanner(System.in);

		number = scan1.nextInt();
		scan1.nextLine();
			System.out.print("Number");
			System.out.print("\t");   // \t is for tab
			System.out.print("Squared");
			System.out.print("\t");			//
			System.out.println("Cubed");
		
		for (int i = 1; i <= number; i++) {
			System.out.print(i);
			System.out.print("\t");
			System.out.print(getPower(i, 2));
			System.out.print("\t");
			System.out.println(getPower(i, 3));

			
		}
 scan1.close();
	}
}
