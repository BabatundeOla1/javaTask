import java.time.LocalDate;
import java.util.Scanner;

public class MensturationApp{

   public static void main(String [] args){

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the first day of your last period in this format (yyyy-mm-dd): ");
	String FirstDayOflastPeriod = sc.nextLine();

	System.out.print("Enter previous period length: ");
	long lastPeriodLength = sc.nextLong();

	LocalDate theDateOfPreviousPeriod = LocalDate.parse(FirstDayOflastPeriod);
	LocalDate nextPeriodDate = theDate.plusDays(lastPeriodLength);
	LocalDate OvulationDate = getOvulationDate(nextPeriodDate, lastPeriodLength);
	
	System.out.println("Your next period is" + nextPeriodDate);
	System.out.print("Your next Ovulation Date " + OvulationDate);
	   
   }

   public static LocalDate getOvulationDate(LocalDate nextDay, long lastPeriodLength){
	return nextDay.plusDays(lastPeriodLength/2);

   }



}