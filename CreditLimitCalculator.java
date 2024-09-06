import java.util.Scanner;

public class CreditLimitCalculator{

   public static void main(String...args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter account number: ");
    int AccountNumber = sc.nextInt();

    System.out.print("Enter Balance at the beginning of the month: ");
    int BeginningBalance = sc.nextInt();

    System.out.print("Enter Total of all items charged by the customer this month: ");
    int Charges = sc.nextInt();

    System.out.print("Enter Total of all credits applied to the customer's account this month: ");
    int Credits = sc.nextInt();

    System.out.print("Enter Allowed credit limit: ");
    int CreditLimit = sc.nextInt();

	int NewBalance = BeginningBalance + Charges - Credits;

	System.out.println(NewBalance);

	if(NewBalance > CreditLimit){
	   System.out.println("Credit limit exceeded!");
	}

   }

}