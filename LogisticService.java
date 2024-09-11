import java.util.Scanner;

public class LogisticService{

   public static void main(String [] args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter number of successful delivery for the day: ");
	double delivery = sc.nextDouble();
	System.out.println(LogisticServiceClass.successfulDelivery(delivery));
  }

}

