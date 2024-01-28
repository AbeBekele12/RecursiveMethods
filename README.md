RecursiveMethods Package
This package contains a Java class RecursiveMethods that provides various recursive methods for handling mines on a game board.

Methods
1. printStars(int n)
This method does not perform any operation and simply returns.

2. power(int base, double exponent)
This method takes a base and an exponent and returns 0. (Note: The implementation is currently not provided.)

3. showMines(char[][] board, int row, int col)
This method reveals mines and mine counts on the game board. If the specified cell (row, col) contains a mine, all mines on the board are revealed along with their counts. Otherwise, it calls the recursive helper method recShowMines to reveal neighboring cells.

4. recShowMines(char[][] board, int row, int col)
This private recursive helper method is responsible for revealing neighboring cells recursively based on the specified algorithm:

If (row, col) is not a valid cell on the board, do nothing.
If (row, col) is not a covered cell, do nothing.
If the cell at (row, col) is a mine, do nothing.
Count the number of adjacent cells that contain mines.
Show the mine count instead of a covered cell at (row, col).
If the mine count is zero, recursively perform steps 1-6 for neighboring cells.
5. onBoard(char[][] board, int row, int col)
This private method checks if the specified cell (row, col) is within the bounds of the game board.

6. isCovered(char[][] board, int row, int col)
This private method checks if the specified cell (row, col) is covered.

7. isMine(char[][] board, int row, int col)
This private method checks if the specified cell (row, col) contains a mine.

8. numAdjacentMines(char[][] board, int row, int col)
This private method counts the number of adjacent cells around (row, col) that contain mines.

How to Use
You can use the RecursiveMethods class by creating an instance of it and calling the methods with the required parameters. The methods are designed to handle game board operations related to mines in a recursive manner.

java
RecursiveMethods recursiveMethods = new RecursiveMethods();
// Example usage
recursiveMethods.showMines(gameBoard, 2, 3);


Note
Ensure that the isMine, onBoard, and other helper methods are implemented correctly as they are crucial for the functioning of the recursive algorithms.
