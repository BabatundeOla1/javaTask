public class ConvertionOfInchToCentimeter{

   public static void main(String [] args){

	System.out.println("Inches\tCentimeters");

	double tCentimeters = 0;

	for(int Inches = 1; Inches <= 10; Inches ++){

		tCentimeters = Inches * 2.54;
		
		System.out.println(Inches + "\t" + tCentimeters);
	}


   }

}