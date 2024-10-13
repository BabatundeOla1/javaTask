public class PracticeWithArray{

   public static void main(String [] args){
	
	java.util.Scanner sc = new java.util.Scanner(System.in);
	

	int [] arrayList = new int[10];

	System.out.print("Enter number of elements: ");
	for(int count = 0; count < arrayList.length; count++){
		arrayList[count] = sc.nextInt();

	}

	for(int counter = 0; counter < arrayList.length; counter++){

		arrayList[counter] = Math.random() * 100;

	}

   }


}





