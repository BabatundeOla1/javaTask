public class EvenPosition{

    public static void main(String [] args){

	int [] number = {1, 2, 3, 4, 5, 6, 7};
	getEvenPosition(number);

    }


   public static void getEvenPosition(int [] even){

	for(int count = 0; count < even.length; count++){
		if(even[count] % 2 == 0)
	System.out.println(even[count]);
	}
	
   }

}