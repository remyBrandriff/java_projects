import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LightsOut
{
  private int size;
  //private char[][] loc;
  // used boolean instead of char given that value is boolean
  private boolean [][] player;

  public LightsOut(int size)
  {
    this.size = size;
    player = new boolean[size][size];
  }

  public int getSize()
  {
    return this.size;
  }

  // Lights up the square
  public boolean isLit(int row, int col)
  {
    return player[row][col];

    // couldn't get these to work so we used the above
    //try #2
    // if(forceLit() == '_')
    // {
    //   return true;
    // }
    // else
    // {
    //   return false;
    // }

    //try #1
    // for (int i = 0; i<row; i++){
    //   for (int j = 0; j<col; j++){
    //     if (loc[i][j] == '_') {
    //       return true;
    //     }
    //     else {
    //       return false;
    //     }
    //   }
    // }
  }

  // force-lights squares
  public void forceLit(int row, int col, boolean value)
  {
    System.out.println("Forcelit");

    // force specific squares either lit or unlit
    try {
    player[row][col] = value;
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Error in forceLit");
    }
  }

  // lights up clicked square and adjacent squares
  public void press(int row, int col)
  {
    // if(loc[row][col] == '_'){
    //   loc[row][col] = 'X';
    // }
    // else if(loc[row][col] == 'X'){
    //   loc[row][col] = '_';
    // }

    // hard code in each combo instead of the if statements
    try {
      forceLit(row, col, !player[row][col]);
      forceLit(row+1, col, !player[row+1][col]);
      forceLit(row-1, col, !player[row-1][col]);
      forceLit(row, col+1, !player[row][col+1]);
      forceLit(row, col-1, !player[row][col-1]);
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("Error in press()");
    }


  }
}
