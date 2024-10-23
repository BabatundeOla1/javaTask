import java.util.Scanner; 
public class MibtTest{

   public static void main(String [] args){

	Scanner sc = new Scanner(System.in);

	System.out.print("What is your name? ");
	String name = sc.nextLine();

	System.out.println(name + " You Selected:");

	String [][] extrovertIntrovert = new String[5][2];
	//String [][] sensingIntuitive = new String[5][2];

	personalityQuestionsExtrovertIntrovert(extrovertIntrovert);
	//personalityQuestionsSensingAndIntuitive(sensingIntuitive);

   }

   public static void personalityQuestionsExtrovertIntrovert(String [][] extrovertIntrovert){

	String [][] extrovertAndIntrovert = {{"A: Expend energy, enjoy groups", "B: conservative energy, enjoy one on one"}, {"A: more outgoing, thinking loud", "B: more reserved, thinking to yourself"}, {"A: seek many tasks, public activities, interaction with others", "B: seek private, solitary activities with quiet to concentrate"}, {"A: external, communicative, express yourself", "internal, reticient, keep to yourself"}, {"A: active, initiate", "B: reflective, delibrate"}};

	Scanner sc = new Scanner(System.in);

	int totalAnswerA = 0;
	int totalAnswerB = 0;

	for(int index = 0; index < extrovertAndIntrovert.length; index++){

		System.out.println("Question" + (index + 1) + ": ");
		System.out.print(extrovertAndIntrovert[index][0] + " ");
		System.out.print(extrovertAndIntrovert[index][1] + ": ");
		String userInput = sc.nextLine().toUpperCase();

		System.out.println(userInput);

		if(userInput.equals("A")){
			totalAnswerA++;	
		}

		else if(userInput.equals("B")){
			totalAnswerB++;
		}

		else{
			System.out.println("Invalid Answer Please choose A or B");
			index--;
		}



		
		System.out.println("You selected: " + extrovertAndIntrovert[index][0]);

		System.out.println("You selected: " + extrovertAndIntrovert[index][1]);
				
	}
	
	System.out.println("Number of A selected: " + totalAnswerA);
	System.out.println("Number of B selected: " + totalAnswerB);

   }
}