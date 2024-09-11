public class LeapYear{


   public static void isLeapYear(int Year) {

	if(Year % 4 == 0 && Year % 100 != 0){
	   System.out.println(Year + " " +  "It is a Leap year.");
	}
 
	else {
	   System.out.println(Year + " " + "It is not a Leap year.");
	}


   }

}