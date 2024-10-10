public class SumOfASeriesWithLong{

  public static void main(String [] args){

	System.out.print("Numbers\tCorresponding Sum\n");

	long n = 100;
	long sum = 0;

	for(long count = 1; count <= n; count++){
		
		sum += count;

	System.out.println(count + "\t" + sum);
	}
   }


	/*public static void main(String [] args){

	System.out.print("Numbers\tCorresponding multiple\n");

	long n = 100;
	long multiple = 1;

	for(long count = 1; count <= n; count++){
		
		multiple *= count;

	System.out.println(count + "\t" + multiple);
	}
   }*/




}