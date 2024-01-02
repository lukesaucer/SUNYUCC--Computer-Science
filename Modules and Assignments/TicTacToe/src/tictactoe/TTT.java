package tictactoe;

/**
 * 
 * <p>
 * @author lukesaucer
 * @since 04/08/2021
 * @version 1.0
 * 
 */

public class TTT {

	private char[][] board;
	private char currentPlayerMark;
	
	
	public TTT() {
		board = new char[3][3];
		currentPlayerMark = 'x';
		initializeBoard();
	}
	
	public char getCurrentPlayerMark() {
		return currentPlayerMark;
	}
	
	public void initializeBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}
	}
	
	public void printBoard() {

		System.out.println("-------------");
		
		for (int i = 0; i < 3; i++) {
			System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}
	
	public boolean isBoardFull( ) {
		boolean isFull = true;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == '-') {
					isFull = false;
				}
			}
		}
		return isFull;
		
	}
	
	public boolean checkForWin() {
		return checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin();
	}
	
	private boolean checkRowsForWin() {
		for (int i = 0; i < 3; i++) {
			if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
				return true;
			}
		}
		return false;
	} 
	
	private boolean checkColumnsForWin() {
		for (int i = 0; i < 3; i++) {
			if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
				return true;
			}
		}
		return false;
	}
	
	private boolean checkDiagonalsForWin() {
		return (checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true);
	}
	
	private boolean checkRowCol(char c1, char c2, char c3) {
		return ((c1 != '-') && (c1 == c2) && (c2 == c3));
	}

	public void changePlayer() {
		if (currentPlayerMark == 'x') {
			currentPlayerMark = 'o';	
		}
		else {
			currentPlayerMark = 'x';
		}
	}
	
	public boolean placeMark(int row, int col) {
		if ((row >= 0) && (row < 3)) {
			if ((col >= 0) && (col < 3)) {
				if (board[row][col] == '-') {
					board[row][col] = currentPlayerMark;
					return true;
				} 
			}
		}
		return false;
	}
}
