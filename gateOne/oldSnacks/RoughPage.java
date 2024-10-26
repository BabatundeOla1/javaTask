import java.util.Scanner;
import java.util.Arrays;

public class LagbajaSchool{

   public static void main(String [] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("How many students do you have? ");
	int numberOfStudents = sc.nextInt();

	System.out.println("How many subjects do you offer?: ");
	int numberOfSubjects = sc.nextInt();

	
	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("Saved Successfully");
	

	System.out.println();

	getStudentScoresAndGrade(numberOfStudents, numberOfSubjects);

  }



   public static void getStudentScoresAndGrade(int numberOfStudents, int numberOfSubjects){
	
	int [][] studentsGrades = new int[numberOfStudents][numberOfSubjects];

	Scanner sc = new Scanner(System.in);
	
	for(int scores = 0; scores < numberOfStudents; scores++){
		
		for(int subjects = 0; subjects < numberOfSubjects; subjects++){

			System.out.println("Entering Score for student" + " " + (scores + 1) + ".");
			System.out.println("Enter score for subject" + (subjects + 1) + ": ");
			int studentSubjects = sc.nextInt();

			studentsGrades[scores][subjects] = studentSubjects;

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




	int [] getThePosition = new int[numberOfStudents];

	for(int index = 0; index < studentsGrades.length; index++){

		int sum = 0;	
		double average = 0;
		double roundOff = 0;
		System.out.print("Student" + " " + (index + 1));

		for(int elements = 0; elements < studentsGrades[index].length; elements++){

			sum += studentsGrades[index][elements];

			average = (double)sum / numberOfSubjects;

			roundOff = Math.round(average*100)/100.00;

			getThePosition[index] = (int)average;
			
			System.out.print(" \t " + studentsGrades[index][elements]);
		}
		
		int[] position = new int[numberOfStudents];

		for(int count = 0; count < getThePosition.length; count++){
			
			position = 1;

			for(int counter = 1; counter < getThePosition.length; counter++){
				if(getThePosition[count] < getThePosition[counter])
					position++;
			}

			
			System.out.print("\t" + position[count]);
		}
		
			System.out.print("\t" + sum);
			System.out.print("\t" + roundOff);
			System.out.print("\t" + position);
			System.out.println();
	}
	System.out.println("====================================================================");
	System.out.println("====================================================================");

		System.out.println();





		System.out.println("STUDENT SUMMARY\n");
	int studentScores = 0;
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
			}

			if(studentsGrades[studentScores][subjects] < lowestScorePerSubject){
				lowestScorePerSubject = studentsGrades[studentScores][subjects];
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
			System.out.println("Highest Scoring Student is:  "  + " Student " + studentScores + " Scoring " + highestScorePerSubject);
			System.out.println("Lowest Scoring Student is:  " + " Student " + studentScores + " Scoring " + lowestScorePerSubject);
			System.out.println("Total Score is:  " + sumOfAllScoreInASubject);
			System.out.println("Average Score is:  " + roundOffAverageScorePerSubject);
			System.out.println("Number of passes:  " + passes);
			System.out.println("Number of Fails:  " + fails);
			System.out.println();
	}


	
	
	
			
   }

}