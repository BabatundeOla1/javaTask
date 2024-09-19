public class TestVoidMethod{

   public static void main(String [] args){

	System.out.println("The Grade is: ");
	printGrade(90.5);

	System.out.println("The Grade is: ");
	printGrade(50);

   }


   public static void printGrade(double score){
	
	if (score >= 90.0){
		System.out.println("A");
	}

	if (score >= 80.0 && score <= 90.0){
		System.out.println("B");
	}

	if (score >= 70.0 && score <= 80.0){
		System.out.println("C");
	}

	if (score >= 60.0 && score <= 70.0){
		System.out.println("D");
	}

	if (score <= 50){
		System.out.println("F");
	}
   }

}