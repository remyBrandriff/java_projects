// //looping through a 2D array
// int[][] myArray = new int[4][6];
// for(int i = 0; i < myArray.length; i++) {
//   for(int j = 0; j < myArray[0].length; j++) {
//     System.out.println( myArray[i][j] );
//     }
//   }
//
// //modified into a "for each" loop
// int[][] myArray = new int[4][6];
// for (int[] subArray : myArray ) {
//   for (int i : subArray) {
//     System.out.println( i );
//     }
//   }

public class tictactoe {

/*  Create a class that models a tic-tac-toe board
    Has a placeX(int i, int j) method to place 'X' at spot (i,j); O equivalent
    Has a toString() method to print out the board
    Has a checkXWinner() that returns true if X is winner; O equivalent
*/

private char[][] board; //initializes to null by default

private tictactoe() {
  board = new char[3][3];
  for(int i = 0; i < board.length; i++) { //for each row
    for (int j = 0; j < board[i].length; j++) { //for each column
      board[i][j] = ' '; //"clears" each cell
    }
  }
}

private void placeMark(char mark, int i, int j) {
  try {
    board[i][j] = mark;
  }
  catch(ArrayIndexOutOfBoundsException myException) {
    System.out.println("You can't place anything in that index.");
    System.out.println(myException);
  }
  /* catch(Exception e) {}
  is a catchall for errors, unspecified, can be used instead of specific errors
  */

  System.out.println("Turn is over.");
}


public String toString() {
  String s = "";
  for(int i = 0; i<board[0].length; i++) { //loop through each column
    for(int j = 0; j<board.length; j++) { //loop through each row
      s += board[j][i];
      if(j < board.length - 1) s += "|";
    }
    s += "\n";
  }
  return s;
}

public static void main(String[] args) {
    tictactoe game = new tictactoe();
    game.placeMark('X', 0, 0);
    game.placeMark('Y', 0, 1);

  }
}
