public class RandomQuestions{

   public static void main(String [] args){

	java.util.Scanner sc = new java.util.Scanner(System.in);

	long startTime = System.currentTimeMillis()/1000;
	
	long totalTestTime = 0;	

	int correctAnswer = 0;

	int failedAnswer = 0;
	
	System.out.print("How many questions do you want to answer? ");
	int QUESTION_TO_ASK = sc.nextInt();

	for(int question = 1; question <= QUESTION_TO_ASK; question++){

		int questionNumber1 = (int)(Math.random() * 100);
		int questionNumber2 = (int)(Math.random() * 100);

		if(questionNumber1 > questionNumber2){
			int swap = questionNumber1;
			questionNumber1 = questionNumber2;
			questionNumber2 = swap;

			System.out.print("Answer This question" + ">>> " + questionNumber2 + " + " + questionNumber1 + " : ");
			int userinput = sc.nextInt();

			int answer = questionNumber2 + questionNumber1;

			long endTime = System.currentTimeMillis()/1000;
			long testTime = endTime - startTime;

				totalTestTime += testTime;
			
			if(userinput == answer){
				correctAnswer++;
				System.out.println("You are correct.");
			}

			if(userinput != answer){
				failedAnswer++;
				System.out.println("You are wrong. The answer is = " + answer);
			}

			System.out.println("Time used on test: " + testTime + "seconds");
			System.out.println();
		}	
	}

	System.out.println("Total time used on all test: " + totalTestTime + "seconds");

	System.out.println("Correct answers: " + correctAnswer);
	System.out.print("Failed Answers: " + failedAnswer);
   }

}