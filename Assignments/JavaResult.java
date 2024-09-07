import java.util.Scanner;

public class JavaResult{

public static void main(String...args){

   Scanner sc = new Scanner(System.in);
   System.out.print("Enter your Java Score: ");
   int javaScore = sc.nextInt();


   if(javaScore >= 60){

	System.out.println("You pass the exam.");
   
   }

   else {

	System.out.println("You don't pass the exam.");
   
   }







}

}