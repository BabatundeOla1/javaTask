public class ArrayNumberOfScores{

   public static void main(String [] args){

java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.print("How many scores are you entering? ");
	int scores = sc.nextInt();
	
	int [] NumbersOfScores = new int[scores];


	for (int count = 0; count < scores; count++){

	System.out.print("Enter numbers of score: ");
	 NumbersOfScores[count] = sc.nextInt();
	
	}

	int sum = 0;
	int countincrement = 0;
	int average = 0;
	for(int scorecounter = 0; scorecounter < scores; scorecounter++){

		sum = sum + NumbersOfScores[scorecounter];
		countincrement++;
  	 }

		average = sum / countincrement;

	System.out.print(average);

}
}