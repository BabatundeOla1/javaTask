public class pattern2{

   public static void main(String...args){

int column = 5;
int row = 5;

for(int count = 1; count <= column; count++){

	for(int nextline = 1; nextline<= count+row; nextline++ ){
		System.out.print(" ");
	}

	for(int counter = 2; counter<= row; counter++){
		System.out.print("*" + " ");
	}
	
	System.out.println();

}

}

}

