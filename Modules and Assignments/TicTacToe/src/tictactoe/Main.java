package tictactoe;

/**
 * 
 * <p>
 * @author lukesaucer
 * @since 04/08/2021
 * @version 1.0
 * 
 */


import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) throws InvalidInputException {
		
		Scanner input = new Scanner(System.in);
		TTT game = new TTT();
		game.initializeBoard();
		
		do
		{
			game.printBoard();
			int row;
			int col;
			
			do {
				System.out.println("Player " + game.getCurrentPlayerMark() + ", place your mark. Enter Row Number + Return. Enter Column Number + Return.");
			row = input.nextInt() - 1;
			col = input.nextInt() - 1;
			}
			
			while (!game.placeMark(row, col));
			game.changePlayer();
		
		}
		
		while (!game.checkForWin() && !game.isBoardFull());
		if (game.isBoardFull() && !game.checkForWin()) 
		{
			game.printBoard();
			System.out.println("This round is a tie!");
		}
		else
		{
			game.printBoard();
			game.changePlayer();
			System.out.println(Character.toUpperCase(game.getCurrentPlayerMark()) + " is the Winner!");
		}
	input.close();
	}	
}
