public class ArraySmallestNumberOfScores{

   public static void main(String [] args){

java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.print("How many scores are you entering? ");
	int scores = sc.nextInt();
	
	int [] NumbersOfScores = new int[scores];


	for (int count = 0; count < scores; count++){

	System.out.print("Enter numbers of score: ");
	 NumbersOfScores[count] = sc.nextInt();
	
	}

	int smallestNum = NumbersOfScores[0];

	for(int counter = 0; counter < scores; counter++){

	if(NumbersOfScores[counter] < smallestNum)
		smallestNum = NumbersOfScores[counter];

        } System.out.println(smallestNum);
        
}
}
	

























