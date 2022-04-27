package USC_Booking;

import java.util.Scanner;


public class Winner {
	static Winner cc;
	public int income=0;

		public Winner() {
			int month=0; //Integer variable for taking month input
			System.out.println("Monthly Report for Popular Classes\nSelect from the List");
			System.out.println("1. Jan\n2. Feb\n3. Mar\n4. Apr\n5. May\n6. Jun\n7. Jul\n8. Aug\n9. Sept\n10. Oct\n11. Nov\n12. Dec\n");
			Scanner sc=new Scanner(System.in);
			month=sc.nextInt();
			switch(month) {
			case 1:
				System.out.println("Month: January");
				System.out.println("Champion Class of the Month");
				System.out.println("BodyBlitz: "+"$"+4400+" Yoga: "+"$"+4000);
				income=4400+4000;
				System.out.println("Toatl Income from this classes: "+"$"+income);
				break;
			case 2:
				System.out.println("Month: February");
				System.out.println("Champion Class of the Month");
				System.out.println("Yoga: "+"$"+4000+" Zumba: "+"$"+4800);
				income=4000+4800;
				System.out.println("Toatl Income from this classes: "+"$"+income);
				break;
			case 3:
				System.out.println("Month: March");
				System.out.println("Champion Class of the Month");
				System.out.println("Aquacise: "+"$"+5400+" Box Fit: "+"$"+5280);
				income=5400+5280;
				System.out.println("Toatl Income from this classes: "+"$"+income);
				break;
			case 4:
				System.out.println("Month: April");
				System.out.println("Champion Class of the Month");
				System.out.println("Zumba: "+"$"+6000+" Yoga: "+"$"+4500);
				income=6000+4500;
				System.out.println("Toatl Income from this classes: "+"$"+income);
				break;
			case 5:
				System.out.println("Month: May");
				System.out.println("Champion Class of the Month");
				System.out.println("Aquacise: "+"$"+7650+" Box Fit: "+"$"+5280);
				income=76540+5280;
				System.out.println("Toatl Income from this classes: "+"$"+income);
				break;
			case 6:
				System.out.println("Month: June");
				System.out.println("Champion Class of the Month");
				System.out.println("BodyBlitz: "+"$"+4400+" Aquacise: "+"$"+4000);
				income=4400+4000;
				System.out.println("Toatl Income from this classes: "+"$"+income);
				break;
			case 7:
				System.out.println("Month: July");
				System.out.println("Champion Class of the Month");
				System.out.println("Yoga: "+"$"+4500+" BodyBlitz: "+"$"+5200);
				income=4500+5200;
				System.out.println("Toatl Income from this classes: "+"$"+income);
				break;
			case 8:
				System.out.println("Month: August");
				System.out.println("Champion Class of the Month");
				System.out.println("Aquacise: "+"$"+5400+" Box Fit: "+"$"+5280);
				income=5400+5280;
				System.out.println("Toatl Income from this classes: "+"$"+income);
				break;
			case 9:
				System.out.println("Month: September");
				System.out.println("Champion Class of the Month");
				System.out.println("Zumba: "+"$"+6000+" Yoga: "+"$"+4500);
				income=6000+4500;
				System.out.println("Toatl Income from this classes: "+"$"+income);
				break;
			case 10:
				System.out.println("Month: October");
				System.out.println("Champion Class of the Month");
				System.out.println("Aquacise: "+"$"+7650+" Box Fit: "+"$"+5280);
				income=76540+5280;
				System.out.println("Toatl Income from this classes: "+"$"+income);
				break;	
			case 11:
				System.out.println("Month: November");
				System.out.println("Champion Class of the Month");
				System.out.println("Zumba: "+"$"+6000+" Yoga: "+"$"+4500);
				income=6000+4500;
				System.out.println("Toatl Income from this classes: "+"$"+income);
				break;
			case 12:
				System.out.println("Month: December");
				System.out.println("Champion Class of the Month");
				System.out.println("Aquacise: "+"$"+7650+" Box Fit: "+"$"+5280);
				income=76540+5280;
				System.out.println("Toatl Income from this classes: "+"$"+income);
				break;		
			default:
				System.out.println("Input not valid\nPlease Provide appropriate input");
				break;
			}
				
		}		
			
	}

