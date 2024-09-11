public class TabularOutput{

	public static void main(String...args){
	System.out.println("N\tN2\tN3\tN4");

	for(int count = 1; count <= 5; count++){
	   int square = count * count;
	   int cube = count * count * count;
	   int quart = count * count * count * count;

	System.out.println(count + "\t" + square + "\t" + cube + "\t" + quart);

	}

    	}


}