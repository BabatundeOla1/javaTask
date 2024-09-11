public class LeapYear{

   public static void main(String...args){

	java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.print("Enter year: ");
	int year = sc.nextInt();

	isLeapYear(year);	
}


   public static void isLeapYear(int Year) {

	if(Year % 4 == 0 && Year % 100 != 0){
	   System.out.println(Year + " " +  "It is a Leap year.");
	}
 
	else {
	   System.out.println(Year + " " + "It is not a Leap year.");
	}


   }

}