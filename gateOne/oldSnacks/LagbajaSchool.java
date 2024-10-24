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

	getStudentScoresAndGrade(numberOfStudents, numberOfSubjects);

  }

   public static void getStudentScoresAndGrade(int numberOfStudents, int numberOfSubjects){

	int sumOfScores = 0;
	
	int [][] studentsGrades = new int[numberOfStudents][numberOfSubjects];

	Scanner sc = new Scanner(System.in);	
	for(int scores = 0; scores < numberOfStudents; scores++){
		
		for(int subjects = 0; subjects < numberOfSubjects; subjects++){

			System.out.println("Entering Score for student" + " " + scores + ".");
			System.out.println("Enter score for subject" + subjects + ": ");
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

	for(int sub = 1; sub <= studentsGrades.length; sub++){
		System.out.print("SUB" + sub + "\t");
	}
	
	System.out.print("TOT\tAVE\tPOS");
	
	System.out.println();

	System.out.println("====================================================================");


	for(int index = 0; index < studentsGrades.length; index++){
		
		int sum = 0;
		double average = 0;		

		System.out.print("Student" + (index + 1));

		for(int elements = 0; elements < studentsGrades[index].length; elements++){

			sum += studentsGrades[index][elements];
			average = sum / studentsGrades.length;

			System.out.print(" \t " + studentsGrades[index][elements]);
			
		}
			System.out.print("\t" + sum);
			System.out.print("\t" + average);
			System.out.println();
	}

	System.out.println("====================================================================");

   }

}