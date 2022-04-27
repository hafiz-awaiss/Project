package USC_Booking;

import static USC_Booking.LessonExercise.grp;
import static USC_Booking.UpdateBooking.modify;
import static USC_Booking.Mon_Report.mr;
import static USC_Booking.Feedback.rc;

import java.util.Scanner;


public class USC {

	public static void USC() {
		System.out.println(
				 "1. Book a Lesson exercise class\r\n"
	            +"2. Change a booking\r\n"
				+ "3. Attend a class\r\n"
				+ "4. Monthly class report\r\n"
				+ "5. Monthly Winner class report\r\n6. Exit"
				+ "\nEnter Your Choice: ");
		int ch = 0;  //integer variable for choice
		Scanner s = new Scanner(System.in); //Scanner object for user input
		ch = s.nextInt();
		
		switch(ch) {
		
		case 1: 
			grp = new LessonExercise();
			System.out.println("Wanna Select the an other option\n");
			USC();
			break;
	
		case 2:
			grp.bookingList();
			modify=new UpdateBooking();
			System.out.println("Wanna Select the an other option\n");
			USC();
			break;
			
		case 3:
			rc=new Feedback();
			System.out.println("Wanna Select the an other option\n");
			USC();
			break;
		case 4:
			mr=new Mon_Report();
			mr.ratinglist();
			System.out.println("Thank You\n");
			USC();
			break;
			
		case 5:
			Winner cc =new Winner();
			System.out.println("Thank You\n");
			USC();
			break;
			
		case 6:
			break;
		}
		
		
	}
	public static void main(String[] args) {
		USC();

	}

}
