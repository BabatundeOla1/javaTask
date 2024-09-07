import java.util.Scanner;

public class LogisticService1{

   public static void main(String [] args){
	Scanner sc = new Scanner(System.in);

      System.out.print("Enter number of successful delivery for the day: ");
      double delivery = sc.nextDouble();
      calculateDelivery(delivery);
      System.out.println(calculateDelivery(delivery));
	
  }

	public static double calculateDelivery(double successful_delivery){
			double wages = 0;
			double basePay = 5000;
		
		if(successful_delivery <= 50){
			double amountPerParcel = 160;
		  	wages = successful_delivery * amountPerParcel + basePay;
			return wages;
		}
	
		if(successful_delivery >= 50 && successful_delivery <= 59){
			double amountPerParcel = 200;
			wages = successful_delivery * amountPerParcel + basePay;
			return wages;
		}

		if(successful_delivery >= 60 && successful_delivery <= 69){	
			double amountPerParcel = 250;
			wages = successful_delivery * amountPerParcel + basePay;
			return wages;
		}

		if(successful_delivery >= 70){
			double amountPerParcel = 500;
			wages = successful_delivery * amountPerParcel + basePay;
			return wages;

		} return wages;

	} 

}
