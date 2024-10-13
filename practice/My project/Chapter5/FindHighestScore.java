public class FindHighestScore{

   public static void main(String [] args){

	java.util.Scanner sc = new java.util.Scanner(System.in);
	
	System.out.print("Enter number of student: ");
	int userinput = sc.nextInt();
	
	for(int count = 0; count < userinput; count++){

		System.out.print("Enter score: ");
		int studentScore = sc.nextInt();	
	
		System.out.println("Enter Student's name: ");
		String studentName = sc.next();

		int maximum = studentScore;

		System.out.print(maximum);

	}

   }

}