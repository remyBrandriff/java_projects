import java.awt.Color;

public class ConnectFour implements GridPlayable {
  private int[][] board = new int[8][10];
  private int player;
  private int winner;
  private int moves;

  public ConnectFour() {
    //initialize variables
    this.player = 1;
    this.winner = 0;
    this.moves = 0;
  }

  public int getGridWidth() {
    return 10; //return grid width
  }

  public int getGridHeight() {
    return 8; //return grid height
  }

  public void press(int a, int b) {
    //for pressing buttons
    board[a][b] = player;
    ++moves;
    checkWin();
    player = 3 - player;
  }

  public String getLabelAt(int a, int b) {
    switch(board[a][b]) {
      case 1: {
        return "X"; //if Player 1 clicks somewhere, place an X
      }
      case 2: {
        return "O"; //if Player 2 clicks somewhere, place an O
      }
    }
    return "";
  }

  public Color getColorAt(int a, int b) {
    switch(board[a][b]) {
      case 1: {
        return Color.blue; //Player 1 is blue
      }
      case 2: {
        return Color.red; //Player 2 is red
      }
    }
    return Color.black;
  }

  public boolean getPressableAt(int a, int b) {
    return board[a][b] == 0;
  }

  public GridPlayable.GameState getGameState() {
    switch(winner) {
      case 1: {
        return GridPlayable.GameState.WIN_P1; //Player 1 wins
      }
      case 2: {
        return GridPlayable.GameState.WIN_P2; //Player 2 wins
      }
      case 3: {
        return GridPlayable.GameState.LOSE; //Loses
      }
    }
    switch(player) {
      case 1: {
        return GridPlayable.GameState.TURN_P1; //Player 1's turn
      }
      case 2: {
        return GridPlayable.GameState.TURN_P2; //Player 2's turn
      }
    }
    return null;
  }

  private void checkWin() {
    int n;
    if(moves >= 80) { //if total moves is less than every possible space
      winner = 4;
    }
    for (n = 0; n < 4; ++n) {
            //if two in a row don't match OR if every other don't match (vertical)
            if (board[0][n] != board[1][n] || board[0][n] != board[2][n]) continue;
            winner = board[0][n];
            return;
        }
        for (n = 0; n < 4; ++n) {
            //if two in a row don't match OR if every other don't match (horizontal)
            if (board[n][0] != board[n][1] || board[n][0] != board[n][2]) continue;
            winner = board[n][0];
            return;
        }
        //for diagonal (going left to right (down) or right to left (up))
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] == board[3][3]) {
            winner = board[0][0];
            return;
        }
        //for diagonal (going left to right (up) or right to left (down))
        if (board[3][0] == board[2][1] && board[3][0] == board[1][2] && board[3][0] == board[0][3]) {
            winner = board[2][0];
            return;
        }
    }
}
