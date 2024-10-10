public class PentagonalNumbers{

   public static void main(String [] args){

	int number = 10;
	int x = getPentagonalNumber(number);

	System.out.print(x);

   }



   public static int getPentagonalNumber(int n){

	int pentagonal = 0;
	for(int count = 1; count <= 10; count++){
		pentagonal = count((3 * count) -1) / 2;
	}

		return pentagonal;
   }
}