/***public class Practice{

   public static void main(String [] args){
	
	int num = 1;
	int num2 = 3;
	int themaximum = max(num, num2);

	System.out.println(themaximum);
	
   }

   public static int max(int n, int y){
	int maximum = 0;

	if (n < y)
		maximum = y;

	else
		maximum = n;

	return maximum;
   }

}***/




public class CalculatorTest{

   public static void main(String [] args){
	
	double money = 500;
	
	System.out.println("Total from USD to NGN= " +  Converter(500));

   }

   public static double Converter(double dollar){
	double exchangeRate = 1550;
	double dollarToNaira = 0;

	double inNaira = dollar * exchangeRate;

	return inNaira;
   }

}










