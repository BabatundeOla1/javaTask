public class ConvertionOfCelsiusToFahrenheit{

   public static void main(String [] args){

	System.out.println("Celsius\tFahrenheit");

	double Fahrenheit = 0;

	for(int Celsius = 0; Celsius <= 100; Celsius += 2){

		Fahrenheit = Celsius * 9 / 5 + 32;
		
		System.out.println(Celsius + "\t" + "  " + Fahrenheit);
	}


   }

}