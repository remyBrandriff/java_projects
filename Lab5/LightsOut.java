import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class LightsOut{
  private int size;
  private boolean[][] board;

  public LightsOut(int size){
    this.size = size;
    board = new boolean[size][size];
  }
  public int getSize(){
    return size;
  }
  public boolean isLit(int row, int col){
    return board[row][col];

  }
  public void forceLit(int row, int col, boolean value){
    try{
      board[row][col] = value;
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("5");
    }
  }
  public void press(int row, int col){
      safeToggle(row, col);
      safeToggle(row+1, col);
      safeToggle(row-1, col);
      safeToggle(row, col+1);
      safeToggle(row, col-1);
    }
  private void safeToggle(int row, int col){
    try{
      forceLit(row, col, !board[row][col]);
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("6");
    }
  }

}
