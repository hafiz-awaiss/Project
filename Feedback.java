package USC_Booking;

import java.util.Scanner;


public class Feedback {
	static Feedback rc;
	public String feedback = null;

	public Feedback() {
		System.out.println("Excercise Class Attended");
		System.out.println("Give Your Valuable Feedback about the class :");

		Scanner s = new Scanner(System.in);
		feedback = s.nextLine();

		int rating = 0; // Integer variable for storing rating
		System.out.println("\nNumerical rating of the class ranging from 1 to 5");
		System.out.println("1: Very dissatisfied\n2: Dissatisfied\n3: Ok\n4: Satisfied\n5: Very Satisfied");
		rating = s.nextInt();
		// Switch expression
		switch (rating) { // Switch case for checking user feedback
		case 1:
			System.out
					.println("Students Review:\n" + "Rating: " + rating + " Very dissatisfied\n" + "Review: " + feedback);
			break;
		case 2:
			System.out.println("Students Review:\n" + "Rating: " + rating + " Dissatisfied\n" + "Review: " + feedback);
			break;
		case 3:
			System.out.println("Students Review:\n" + "Rating: " + rating + "Ok\n" + "Review: " + feedback);
			break;
		case 4:
			System.out.println("Students Review:\n" + "Rating: " + rating + " Satisfied\n" + "Review: " + feedback);
			break;
		case 5:
			System.out.println("Students Review:\n" + "Rating: " + rating + " Very Satisfied\n" + "Review: " + feedback);
			break;
		default:
			System.out.println("Enter Rating from 1 to 5 \n");

		}

	}

}
