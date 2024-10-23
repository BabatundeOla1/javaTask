import java.util.Scanner; 
public class MibtTest{

   public static void main(String [] args){

	Scanner sc = new Scanner(System.in);

	System.out.print("What is your name? ");
	String name = sc.nextLine();

	//System.out.println(name + " You Selected:");

	personalityQuestionsExtrovertIntrovert(name);
	personalityQuestionsSensingAndIntuitive();

   }

   public static void personalityQuestionsExtrovertIntrovert(String name){

	String [][] extrovertAndIntrovert = {{"A: Expend energy, enjoy groups", "B: conservative energy, enjoy one on one", " "}, 
						{"A: more outgoing, thinking loud", "B: more reserved, thinking to yourself", " "}, 
						{"A: seek many tasks, public activities, interaction with others", "B: seek private, solitary activities with quiet to concentrate", " "}, 
						{"A: external, communicative, express yourself", "B: internal, reticient, keep to yourself", " "}, 
						{"A: active, initiate", "B: reflective, delibrate", " "}};

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
			extrovertAndIntrovert[index][2] = "A";
			totalAnswerA++;
		}

		else if(userInput.equals("B")){
			extrovertAndIntrovert[index][2] = "B";
			totalAnswerB++;
		}

		else{
			System.out.println("Expected A or B as response\n I know this is an error please try again");
			index--;
		}		
	}

	System.out.println("Hello " + name + " You Selected:");

	
	for(int answer = 0; answer < extrovertAndIntrovert.length; answer++){
		System.out.println(extrovertAndIntrovert[answer][2]);
	}
	
	System.out.println("Number of A selected: " + totalAnswerA);
	System.out.println("Number of B selected: " + totalAnswerB);


   }

 public static void personalityQuestionsSensingAndIntuitive(){

	String [][] sensingAndIntuitive = {{"A: Interpret literally", "B: look for meaning and possibilities", " "}, 
						{"A: practical, realistic, experimental", "B: imaginative, innovative, theoretical", " "}, 
						{"A: Standard, usual, conventional", "B: different, novel, unique", " "}, 
						{"A: focus on here and now", "B: look to the future, global perspective, big picture", " "}, 
						{"A: facts, things, what is", "B: ideas, dreams, what could be, philosophical", " "}};

	
	Scanner sc = new Scanner(System.in);

	int totalAnswerA = 0;
	int totalAnswerB = 0;

	for(int index = 0; index < sensingAndIntuitive.length; index++){

		System.out.println("Question" + (index + 1) + ": ");
		System.out.print(sensingAndIntuitive[index][0] + " ");
		System.out.print(sensingAndIntuitive[index][1] + ": ");
		String userInput = sc.nextLine().toUpperCase();

		if(userInput.equals("A")){
			sensingAndIntuitive[index][2] = "A";
			totalAnswerA++;	
		}

		else if(userInput.equals("B")){
			sensingAndIntuitive[index][2] = "B";
			totalAnswerB++;
		}

		else{
			System.out.println("Expected A or B as response\n I know this is an error please try again");
			index--;
		}		
	}
	
	System.out.println("Number of A selected: " + totalAnswerA);
	System.out.println("Number of B selected: " + totalAnswerB);

   }
}
