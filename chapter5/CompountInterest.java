public class CompountInterest {
   public static void main(String[] args) {
 
	double principal = 1000.0; 

	double rate = 0.05;
 
	System.out.printf("%s %n", "Year", "Amount on deposit");

	for (int year = 1; year <= 10; ++year) { 

	     
 		double amount = principal * Math.pow(1.0 + rate, year);
 
 	 	System.out.printf("%4d%,20.2f%n", year, amount);
	    
 	}
 } 

}