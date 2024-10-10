public class BarChartWithArray{

   public static void main(String [] args){

	int [] numberOfGrades = {7, 8, 2, 0, 6, 3, 1, 5, 4, 2, 1};

	gradeChart(numberOfGrades);
   }

   public static void gradeChart(int [] arrays){

	// for each array element, output a bar of the chart
 	for (int counter = 0; counter < arrays.length; counter++) {


 // output bar label ("00-09: ", ..., "90-99: ", "100: ")
 		if (counter == 10) {
 			System.out.printf("%5d: ", 100);
		 } 
 		else {
 			System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9); 
 		}

		for(int stars = 0; stars < arrays[counter]; stars++){

			System.out.print("*");
   		}
		
		System.out.println();
	}
   
   }

}



