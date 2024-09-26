public class MyBankApp{

	private double balance;
	

   public void makeDeposit(double amount){
	if(amount < 0){
		System.out.print("Invalid deposit");
	}

	balance = balance + amount;

   }

    

   public void makewithdrawal(double amount){

	if(amount <= balance){
		balance = balance - amount;
	}
	else{
		System.out.print("Insufficient funds!");
	}
	
   } 


   public double checkBalance(){

	return balance;
   }




}