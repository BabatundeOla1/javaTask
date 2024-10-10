public class BarChartWithArray1{

   public static void main(String [] args){

	int [] numberOfGrades = {5, 12, 6, 1, 8, 4, 2, 10, 12, 4, 7, 1, 23, 5, 6, 0, 13};
		barChart(numberOfGrades);
   }


   public static void barChart(int [] array){

	for(int count = 0; count < array.length; count++){

		for(int star = 0; star < array[count]; star++){

			System.out.print("*");
		}
		
		System.out.println();

	}


   }
 

}