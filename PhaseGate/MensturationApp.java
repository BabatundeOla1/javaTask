import java.time.LocalDate;
import java.util.Scanner;

public class MensturationApp{

   public static void main(String [] args){

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the first day of your last period in this format (yyyy-mm-dd): ");
	String FirstDayOflastPeriod = sc.nextLine();

	System.out.print("How Long did flow period last? ");
	int periodDays = sc.nextInt();

	System.out.print("Enter previous cycle length: ");
	int lastPeriodLength = sc.nextInt();

	LocalDate theDateOfPreviousPeriod = LocalDate.parse(FirstDayOflastPeriod);

	LocalDate nextPeriodDate = getNextPeriodDate(theDateOfPreviousPeriod, lastPeriodLength);
	LocalDate OvulationDate = getOvulationDate(nextPeriodDate, lastPeriodLength);
	LocalDate DaysOfBleeding = getDaysOfBleeding(nextPeriodDate, periodDays);

	
	System.out.println("Your next period is: " + nextPeriodDate);
	System.out.println("Your next period Days: " + nextPeriodDate + " - " + DaysOfBleeding);
	System.out.println("Your next Ovulation Date: " + OvulationDate);	
	   
   }

   public static LocalDate getNextPeriodDate(LocalDate theDateOfPreviousPeriod, int lastPeriodLength){
	return theDateOfPreviousPeriod.plusDays(lastPeriodLength);

   }

   public static LocalDate getOvulationDate(LocalDate nextPeriodDate, int lastPeriodLength){
	return nextPeriodDate.plusDays(lastPeriodLength/2);

   }

   public static LocalDate getDaysOfBleeding(LocalDate nextDay, int periodDays){
	return nextDay.plusDays(periodDays);

   }

}