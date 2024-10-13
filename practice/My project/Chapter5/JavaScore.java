public class JavaScore{

   public static void main(String [] args){

	java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.print("Enter a java score(enter -1 to end): ");
	int score = sc.nextInt();
		
	while(score != -1){

		if(score >= 60){
			System.out.println("You pass");
		}
		else if(score <= 59){
			System.out.println("You fail");	
		}

		
		System.out.print("Enter a java score(enter -1 to end): ");
		score = sc.nextInt();		
	}	
   }

}