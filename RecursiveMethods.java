
package One;


public class RecursiveMethods {
	
	public static void printStars(int n) {
		return;
	}
	public static int power(int base, double exponent) {
		return 0;
	}

	public static void showMines(char[][] board, int row, int col) {
		if (isMine(board, row, col)) {
			for ( int i = 0; i < board.length; i++) {
				for (int j = 0; j < board.length; j++ ) {
					if ( ! isMine(board, i,j)) {
						board[i][j] = (char) (numAdjacentMines (board, i, j) + '0');
					}
				}
			}
			// show all mines and mine counts
		}
		else {
			recShowMines(board, row, col);
			// call the recursive helper method, recShowMines.
		}
	}

	private static void recShowMines(char[][] board, int row, int col) {

		// TODO: Implement the following algorithm using the helper methods below.
		 
	    // If (r, c) is not a valid row and column, do nothing.
		if (! onBoard(board, row, col))
			return;
		// If (r, c) is not a covered cell, do nothing.
		if (! isCovered ( board, row, col))
			return;
		// If the cell at (r, c) is a mine, do nothing.
		if ( isMine(board, row, col))
			return;
		// at this point row, col is not a mine
	    // count the number of adjacent cells that contain mines. 
		int mineCount = numAdjacentMines (board, row, col);
		
	    // Show the mine count instead of a covered cell at (r, c).
		board [row][col] = (char) (mineCount + '0');		
		
	    // If the mine count is zero, do steps 1 - 6 for cells at (r-1, c), (r+1, c), (r, c-1), (r, c+1), (r-1, c-1), (r-1, c+1), (r+1, c-1), and (r+1, c+1).
		if (mineCount == 0) {
			recShowMines(board, row -1, col);
			recShowMines(board, row +1, col);
			recShowMines(board, row ,col - 1);
			recShowMines(board, row ,col + 1);
			recShowMines(board, row -1, col - 1);
			recShowMines(board, row -1, col + 1);
			recShowMines(board, row +1, col - 1);
			recShowMines(board, row +1, col + 1);
			
		}

	}
	
	private static boolean onBoard(char[][] board, int row, int col) {
		return (row >= 0 && row < board.length && col >=0 && col < board[row].length);
	}
	
	private static boolean isCovered(char[][] board, int row, int col) {
		return onBoard(board, row, col) && board[row][col] == '-';
	}
	
	private static boolean isMine(char[][] board, int row, int col) {
		return onBoard(board, row, col) && board[row][col] == '*';
	}
	
	private static int numAdjacentMines(char[][] board, int row, int col) {
		
		int count = 0;
		
		for (int i = -1; i < 2; i++)
			for (int j = -1; j < 2; j++)
				if (!(i == 0 && j == 0) && isMine(board, row-i, col-j))
					count++;
		
		return count;
		
	}



}
