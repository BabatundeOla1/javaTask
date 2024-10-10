public class CallingOfFunction{

   public static void main(String [] args){
	int x = 34;
	int y = 2;
	getAdd(x, y);
	
	int xy = getMultiplication(x, y);
	
	System.out.println("Sum:" + getAdd(x, y));

	System.out.print("Multiple:" + xy);
   }

   public static int getAdd(int a, int b){

	int sum = a + b;
	
	return sum;
   }


    public static int getMultiplication(int n, int c){
	
	int ans = getAdd(n, c) * 2;

	return ans;
   }

}