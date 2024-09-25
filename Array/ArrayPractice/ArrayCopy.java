/***import java.lang.System;

public class ArrayCopy{

    public static void main(String [] args){

	int [] source ={3, 4, 5};
	int [] target = new int[source.length];


System.arraycopy(source, 0, target, 0, source.length);

	target[0]++;

	for(int i = 0; i<source.length; i++){
		target[i] = source[i];
	}




    }

}***/


/***public class ArrayCopyjava {

    public static void main(String [] args){
	
	int [] num = {1, 3};

	swapArray(num);

	System.out.print("Array is {" + num[0] + "," + " " + num[1] + "}");

    }


    public static void swapArray(int [] array){

	int toSwap = array[0];
	
	array[0] = array[1];

	array[1] = toSwap;

    }

}***/

public class ArrayCopy{

   public static void main(String [] args){

	int [] list = {1, 2, 3, 5, 4};
   	
	for(int count = list.length - 1; count >= 0; count--)

	System.out.print(list[count] + " ");

   }

}


