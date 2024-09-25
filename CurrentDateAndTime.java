import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateAndTime{

   public static void main(String [] args){

	LocalDateTime date = LocalDateTime.now();
	System.out.println(date);

	System.out.println();

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM/dd/YYYY   h:mm a");
	System.out.println(dtf.format(date));

}

}