import java.util.Scanner;
import java.util.Arrays;

public class LagbajaSchool{

   public static void main(String [] args){

	Scanner sc = new Scanner(System.in);

	System.out.print("How many students do you have? ");
	int numberOfStudents = sc.nextInt();

	System.out.print("How many subjects do you offer? ");
	int numberOfSubjects = sc.nextInt();

	
	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("Saved Successfully");
	

	System.out.println();

	getStudentScoresAndGrade(numberOfStudents, numberOfSubjects);

  }



   public static void getStudentScoresAndGrade(int numberOfStudents, int numberOfSubjects){
	
	int [][] studentsGrades = new int[numberOfStudents][numberOfSubjects];

	Scanner sc = new Scanner(System.in);
	
	for(int students = 0; students < numberOfStudents; students++){
		
		for(int subjects = 0; subjects < numberOfSubjects; subjects++){

			System.out.println("Entering Score for student" + " " + (students + 1) + ".");
			System.out.println("Enter score for subject" + (subjects + 1) + ": ");
			int studentSubjects = sc.nextInt();

			studentsGrades[students][subjects] = studentSubjects;

			if(studentSubjects < 0 || studentSubjects > 100){
				System.out.println("Invalid Input, Enter score again");
				subjects--;
			}
		}
	}




	System.out.println("====================================================================");
	System.out.print("STUDENT" + "\t\t");

	for(int sub = 1; sub <= numberOfSubjects; sub++){
		System.out.print("SUB" + sub + "\t");
	}

	System.out.print("TOT\tAVE\tPOS");
	System.out.println();
	System.out.println("====================================================================");



	int[] classTotalScore = new int[numberOfStudents];
	
	for(int index = 0; index < studentsGrades.length; index++){

		int total = 0;	
		double average = 0;
		double roundOff = 0;
		System.out.print("Student" + " " + (index + 1));

		for(int elements = 0; elements < studentsGrades[index].length; elements++){

			total += studentsGrades[index][elements];

			classTotalScore[index] = total;
			
			average =  (double)total / numberOfSubjects;

			roundOff = Math.round(average*100)/100.00;			

			System.out.print(" \t " + studentsGrades[index][elements]);
		}
			System.out.print("\t" + total);
			System.out.print("\t" + roundOff);
			System.out.println();
	}
	System.out.println("====================================================================");
	System.out.println("====================================================================");

		System.out.println();



		System.out.println("STUDENT SUMMARY\n");

	int studentScores = 0;

	int highestScoringStudent = 0;

	int lowestScoringStudent = 0;

	for(int subjects = 0; subjects < numberOfSubjects; subjects++){

		int sumOfAllScoreInASubject = 0;

		int highestScorePerSubject = 0;

		int lowestScorePerSubject = 100;
	
		double averageScorePerSubject = 0;

		double roundOffAverageScorePerSubject = 0;

		int passes = 0;

		int fails = 0;

		for(studentScores = 0; studentScores < numberOfStudents; studentScores++){

			sumOfAllScoreInASubject += studentsGrades[studentScores][subjects];

			if(studentsGrades[studentScores][subjects] > highestScorePerSubject){
				highestScorePerSubject = studentsGrades[studentScores][subjects];
					highestScoringStudent = studentScores + 1;
			}

			if(studentsGrades[studentScores][subjects] < lowestScorePerSubject){
				lowestScorePerSubject = studentsGrades[studentScores][subjects];
					lowestScoringStudent = studentScores + 1;
			}

			averageScorePerSubject = (double)sumOfAllScoreInASubject / numberOfStudents;

			roundOffAverageScorePerSubject = Math.round(averageScorePerSubject * 100)/100.00;

			if(studentsGrades[studentScores][subjects] >= 50){
				passes++;
			}

			if(studentsGrades[studentScores][subjects] < 50){
				fails++;
			}	
		}
			System.out.println("SUBJECT " + (subjects + 1));
			System.out.println("Highest Scoring Student is:  "  + " Student " + highestScoringStudent + " Scoring " + highestScorePerSubject);
			System.out.println("Lowest Scoring Student is:  " + " Student " + lowestScoringStudent + " Scoring " + lowestScorePerSubject);
			System.out.println("Total Score is:  " + sumOfAllScoreInASubject);
			System.out.println("Average Score is:  " + roundOffAverageScorePerSubject);
			System.out.println("Number of passes:  " + passes);
			System.out.println("Number of Fails:  " + fails);
			System.out.println();
	}

	int failuresInHardestSubjects = 0;
	int theHardestSubject = 0;

	int passesInEasiestSubjects = 0;
	int theEasiestSubject = 0;

	int totaolSumOfEachSubject = 0;
	for(int subjects = 0; subjects < numberOfSubjects; subjects++){
		
		failuresInHardestSubjects = 0;

		passesInEasiestSubjects = 0;
	
		for(int students = 0; students < numberOfStudents; students++){

			totaolSumOfEachSubject += studentsGrades[students][subjects];			

			if(studentsGrades[students][subjects] < 50){
				failuresInHardestSubjects++;
				theHardestSubject = subjects + 1;
			}

			if(studentsGrades[students][subjects] > 50){
				passesInEasiestSubjects++;
				theEasiestSubject = subjects + 1;
			}
		}
	}

		System.out.println("The hardest subject is subject " + theHardestSubject + " with " + failuresInHardestSubjects + " failures");
		System.out.println("The easiest subject is subject " + theEasiestSubject + " with " + passesInEasiestSubjects + " passes");

		
		System.out.println("====================================================================");


		System.out.println("CLASS SUMMARY");
		System.out.println("====================================================================");
		
		int [] bestGraduatingStudentScore = new int[numberOfStudents];
		int sumOfStudentScores = 0;

		int highestStudentScore = 0;
		int bestGraduatingStudentNumber = 0;

		int lowestStudentScore = Integer.MAX_VALUE;
		int worstGraduatingStudentNumber = 0;
		
		for(int students = 0; students < numberOfStudents; students++){
			sumOfStudentScores = 0;
			
			for(int subjects = 0; subjects < numberOfSubjects; subjects++){

				sumOfStudentScores += studentsGrades[students][subjects];		
				
				bestGraduatingStudentScore[students] = sumOfStudentScores;

			}

			if(sumOfStudentScores > highestStudentScore){
        			highestStudentScore = sumOfStudentScores;
       				bestGraduatingStudentNumber = students + 1;
   			 }

			if(sumOfStudentScores < lowestStudentScore){
        			lowestStudentScore = sumOfStudentScores;
       				worstGraduatingStudentNumber = students + 1;
   			 }				
		}		
			System.out.println("Best Graduating Student is: " + "student " + bestGraduatingStudentNumber + " scoring " + highestStudentScore);
		System.out.println("====================================================================");

		System.out.println();

		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");	

			System.out.println("worst Graduating Student is: " + "student " + worstGraduatingStudentNumber + " scoring " + lowestStudentScore);

		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");	


		System.out.println("====================================================================");

			int sum = 0;
			int average = 0;
			for(int count = 0; count < classTotalScore.length; count++){

				sum += classTotalScore[count];

				average = sum / numberOfStudents;
			}
				System.out.println("Class total score is: " + sum);
				System.out.println("Class Average score is: " + average);
	
		System.out.println("====================================================================");
   }

}