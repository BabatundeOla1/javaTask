public class AdditionOfRandomNumbersWithLoop{

   public static void main(String...args){

	java.util.Scanner sc = new java.util.Scanner(System.in);
	
	int randomNumber1 = (int) (Math.random() * 100);

	int randomNumber2 = (int) (Math.random() * 100);

	System.out.print("What is the sum of" + randomNumber1 + "+" + randomNumber2 + "?:  ");
	int answer = sc.nextInt();

	while(randomNumber1 + randomNumber2 != answer){
		
		System.out.println("Wrong answer. Try Again. What is " + randomNumber1 + "+" + randomNumber2 + "?:  ");
		answer = sc.nextInt();
	}

	System.out.print("You got it!");

    }
}
