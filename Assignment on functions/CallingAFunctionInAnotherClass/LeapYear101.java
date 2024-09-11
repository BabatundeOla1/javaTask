public class LeapYear101{

   public static void main(String...args){

	java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.print("Enter year: ");
	int year = sc.nextInt();

	LeapYear.isLeapYear(year);	
}

}