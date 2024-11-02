import java.util.Scanner; 
public class MbtiTest{

   public static void main(String [] args){

	Scanner sc = new Scanner(System.in);

	System.out.print("What is your name? ");
	String name = sc.nextLine();

	String a = personalityQuestionsExtrovertIntrovert(name);
	String b = personalityQuestionsSensingAndIntuitive(name);
	String c = personalityQuestionsThinkingAndFeeling(name);
	String d = personalityQuestionsJudgingAndPerceptive(name);
	
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

		System.out.println();

	System.out.println("Hello " + name + " You Selected:");

	
	for(int answer = 0; answer < extrovertAndIntrovert.length; answer++){

		if(extrovertAndIntrovert[answer][2] == "A")
		System.out.println(extrovertAndIntrovert[answer][0]);

		if(extrovertAndIntrovert[answer][2] == "B")
		System.out.println(extrovertAndIntrovert[answer][1]);
	}
		System.out.println();
	System.out.println("Number of A selected: " + totalAnswerA);
	System.out.println("Number of B selected: " + totalAnswerB);

	if(totalAnswerA > 2){
		System.out.println("E");
	}
	else{
		System.out.println("I");
	}
   }

  public static void personalityQuestionsSensingAndIntuitive(String name){

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


		System.out.println();

	System.out.println("Hello " + name + " You Selected:");

	
	for(int answer = 0; answer < sensingAndIntuitive.length; answer++){

		if(sensingAndIntuitive[answer][2] == "A")
		System.out.println(sensingAndIntuitive[answer][0]);

		if(sensingAndIntuitive[answer][2] == "B")
		System.out.println(sensingAndIntuitive[answer][1]);
	}
	
	System.out.println("Number of A selected: " + totalAnswerA);
	System.out.println("Number of B selected: " + totalAnswerB);

	if(totalAnswerA > 2){
		System.out.println("S");
	}
	else{
		System.out.println("N");
	}

      }


    public static void personalityQuestionsThinkingAndFeeling(String name){
	
	String [][] ThinkingAndFeeling = {{"A: logical, thinking, questioning", "B: empathetic, feeling, accommodating", " "}, 
						{"A: candid, straight forward, frank", "B: tactful, kind, encouraging", " "}, 
						{"A: firm, tend to criticize, hold the line", "B: gentle, tend to appreciate, conciliate", " "}, 
						{"A: tough-minded, just", "B: tender-hearted, merciful", " "}, 
						{"A: matter of fact, issue-oriented", "B: senstive, people-oriented, compassionate", " "}};


	Scanner sc = new Scanner(System.in);

	int totalAnswerA = 0;
	int totalAnswerB = 0;

	for(int index = 0; index < ThinkingAndFeeling.length; index++){

		System.out.println("Question" + (index + 1) + ": ");
		System.out.print(ThinkingAndFeeling[index][0] + " ");
		System.out.print(ThinkingAndFeeling[index][1] + ": ");
		String userInput = sc.nextLine().toUpperCase();

		if(userInput.equals("A")){
			ThinkingAndFeeling[index][2] = "A";
			totalAnswerA++;	
		}

		else if(userInput.equals("B")){
			ThinkingAndFeeling[index][2] = "B";
			totalAnswerB++;
		}

		else{
			System.out.println("Expected A or B as response\n I know this is an error please try again");
			index--;
		}		
	}


		System.out.println();

	System.out.println("Hello " + name + " You Selected:");

	
	for(int answer = 0; answer < ThinkingAndFeeling.length; answer++){

		if(ThinkingAndFeeling[answer][2] == "A")
		System.out.println(ThinkingAndFeeling[answer][0]);

		if(ThinkingAndFeeling[answer][2] == "B")
		System.out.println(ThinkingAndFeeling[answer][1]);
	}
	
	System.out.println("Number of A selected: " + totalAnswerA);
	System.out.println("Number of B selected: " + totalAnswerB);

	if(totalAnswerA > 2){
		System.out.println("T");
	}
	else{
		System.out.println("F");
	}

   }


   public static void personalityQuestionsJudgingAndPerceptive(String name){
		
		String [][] JudgingAndPerceptive = {{"A: organized, orderly", "B: flexible, adaptable", " "}, 
						{"A: candid, straight forward, frank", "B: tactful, kind, encouraging", " "}, 
						{"A: firm, tend to criticize, hold the line", "B: gentle, tend to appreciate, conciliate", " "}, 
						{"A: tough-minded, just", "B: tender-hearted, merciful", " "}, 
						{"A: matter of fact, issue-oriented", "B: senstive, people-oriented, compassionate", " "}};

		
	Scanner sc = new Scanner(System.in);

	int totalAnswerA = 0;
	int totalAnswerB = 0;

	for(int index = 0; index < JudgingAndPerceptive.length; index++){

		System.out.println("Question" + (index + 1) + ": ");
		System.out.print(JudgingAndPerceptive[index][0] + " ");
		System.out.print(JudgingAndPerceptive[index][1] + ": ");
		String userInput = sc.nextLine().toUpperCase();

		if(userInput.equals("A")){
			JudgingAndPerceptive[index][2] = "A";
			totalAnswerA++;	
		}

		else if(userInput.equals("B")){
			JudgingAndPerceptive[index][2] = "B";
			totalAnswerB++;
		}

		else{
			System.out.println("Expected A or B as response\n I know this is an error please try again");
			index--;
		}		
	}

		System.out.println();

	System.out.println("Hello " + name + " You Selected:");

	
	for(int answer = 0; answer < JudgingAndPerceptive.length; answer++){

		if(JudgingAndPerceptive[answer][2] == "A")
		System.out.println(JudgingAndPerceptive[answer][0]);

		if(JudgingAndPerceptive[answer][2] == "B")
		System.out.println(JudgingAndPerceptive[answer][1]);
	}
	
	System.out.println("Number of A selected: " + totalAnswerA);
	System.out.println("Number of B selected: " + totalAnswerB);

	if(totalAnswerA > 2){
		System.out.println("J");
	}
	else{
		System.out.println("P");
	}
   }

}
