public class TicTacToe{

   public static void main(String [] args){
	
	char [][] gameBoard = {{' ', '|', ' ', '|', ' '}, 
		{'-', '+', '-', '+', '-'}, 
		{' ', '|', ' ', '|', ' '}, 
		{'-', '+', '-', '+', '-'}, 
		{' ', '|', ' ', '|', ' '}};

	creatGameBoard(gameBoard);
   } 

   public static void creatGameBoard(char [][] gameBoard){

	for(int row = 0; row < gameBoard.length; row++){

		for(int column = 0; column < gameBoard.length; column++){
			System.out.print(gameBoard[row][column] + " ");
		}
		System.out.println();
	}


   }



}