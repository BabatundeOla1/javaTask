public class ArraySumOfNumbers{

public static void main(String...args){

	int [] Theezy = {23, 25, 26, 27};
	

	int sum = 0;
	int average = 0;
	for(int count = 0; count < Theezy.length; count++){

	//find the sum of the Array.
		sum+= Theezy[count];

	//find the average of the sum.
		average = sum / Theezy.length;
	
	} System.out.println(average);




}

}