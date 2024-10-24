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

	System.out.println("=========================================================================");
	System.out.print("STUDENT" + "\t\t");

	for(int sub = 1; sub <= numberOfSubjects; sub++){
		System.out.print("SUB" + sub + "\t");
	}

	System.out.print("TOT\tAVE\tPOS");
	System.out.println();
	System.out.println("=========================================================================");

	double [] getAverage = new double[numberOfStudents];
	int [] totalSum = new int[numberOfSubjects];

	for(int index = 0; index < studentsGrades.length; index++){

		
		int sum = 0;	

		double average = 0, roundOff = 0;
		

		System.out.print("Student" + (index + 1));

		for(int elements = 0; elements < studentsGrades[index].length; elements++){

			sum += studentsGrades[index][elements];
			totalSum[index] = sum;

			average = (double)sum / numberOfSubjects;
			roundOff = Math.round(average*100)/100.00;

			getAverage[index] = roundOff;

			System.out.print(" \t " + studentsGrades[index][elements]);
		}

				
			System.out.print("\t" + sum);
			System.out.print("\t" + roundOff);
			
			System.out.println();
	}

	System.out.println("=========================================================================");
	
	System.out.println("=========================================================================");
			System.out.print(Arrays.toString(getAverage));
				System.out.println();

		for(int count = 0; count < getAverage.length; count++){		

			for(int counter = 1; counter < getAverage.length; counter++){

				if(getAverage[counter - 1] < getAverage[counter]){

					double temp =  getAverage[count];
					getAverage[count] = getAverage[counter];
					getAverage[counter] = temp;
				}
			}
		}

		for(int print = 0; print < getAverage.length; print++){

			System.out.print(getAverage[print] + " ");

		}
   }

  }

