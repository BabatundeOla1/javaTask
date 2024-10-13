public class ConvertionFromCToFAndFToC{

   public static void main(String [] args){

	System.out.println("Celsius\tFahrenheit");
	

	double Fahrenheit = 0;
	double toCelsius = 0;

	for(int count = 0; count <= 20; count += 2){
			Fahrenheit = count * 9 / 5 + 32;
	
		System.out.println(count + "\t" + "  " + Fahrenheit + "\t");
		
	}

	System.out.print(" ");
	

	System.out.println("Fahrenheit\tCelsius");
	for(int counts = 20; counts <= 100; counts += 5){
		
			toCelsius = (counts - 32) * 5 / 9;
		
		System.out.println("\t" + counts + "\t\t" + "  " + toCelsius);
		
	}

	
   }

}
