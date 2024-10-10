public class FourEvenNumbers{

   public static void main(String [] args){

	for(int number = 1000; number <= 3000; number++){
		
		int firstnumber = number / 1000;

		int secondnumber = number / 100 % 10;

		int thirdnumber = number / 10 % 10;

		int fourthnumber = number % 10;

	if(firstnumber % 2 == 0 && secondnumber % 2 == 0 && thirdnumber % 2 == 0 && fourthnumber % 2 == 0) System.out.print(number + ", "); 

	}
   }

}	