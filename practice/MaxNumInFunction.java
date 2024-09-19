public class MaxNumInFunction{

  public static void main(String [] args){

	int num1 = 10;

	int num2 = 7;

	int maximum = max(num1, num2);
	System.out.println("Maximum number between " + num1 + " and " + num2 + " = " + maximum);
}

   public static int max(int num, int numx){

	int result = 0;

	if (num > numx)
		result = num;

	else
		result = numx;

	return result;
   }


}