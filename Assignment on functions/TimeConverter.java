  public class TimeConverter{

public static void main(String...args){

	java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.print("Enter milliseconds: ");
	long milliseconds = sc.nextLong();
	
	convertMillis(milliseconds);

	System.out.print(convertMillis(milliseconds));
}



	public static String convertMillis(long millis){

		long  milliseconds = (millis / 1000) % 60;

		long  milliMinutes = (millis / (1000*60)) % 60;

		long  milliHour = (millis / (1000 * 60 * 60)) % 24;
	
		return String.format("%d:%d:%d.", milliHour, milliMinutes, milliseconds);
	} 
}