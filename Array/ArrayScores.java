public class ArrayScores{

  public static void main(String [] args){
	
	int [] score = new int [10];
	
	java.util.Scanner sc= new java.util.Scanner(System.in);

	for(int count = 0; count < 10; count++){
		
		System.out.print("Enter scores of student: ");
		int scores[score] = sc.nextInt();
	
	}

	for(int count = 0; count < 10; count++){
		
		System.out.print(scores[count]);
	}

}


}