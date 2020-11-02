public class Sudoku{

  // Creating private instance variables for the starting configuration of the puzzle, the array that holds the puzzle,
  // and a boolean variable that is true when the puzzle has no more blank spaces
  private String starting_configuration;
  private char[][] array;
  private boolean isFull;


  // An empty constructor
  public Sudoku(){ }


  // Constructor that puts the starting configuration into a 2D array
  public Sudoku(String starting_configuration){
    String text = starting_configuration.replace("\n", "");
    this.starting_configuration = text;
    array = new char[this.starting_configuration.length() / 9][this.starting_configuration.length() / 9];
    for(int i = 0; i < this.starting_configuration.length() / 9; i++){
      for(int j = 0; j < this.starting_configuration.length() / 9; j++){
        char c = this.starting_configuration.charAt((i * 9) + j);
        array[i][j] = c;
      }
    }
  }


  // getSquare method that returns the value of a square based on row and column parameters
  public char getSquare(int row, int col){
    char value = array[row][col];
    return value;
  }


  // setSquare method that sets a certian square based on row and column paramters
  public void setSquare(int row, int col, char value){
    array[row][col] = value;
    //System.out.println(column());
  }


  // Private helper method row that checks to make sure there are no duplicate values in each row
  private boolean row() {
    for(int i = 0; i < this.array[0].length; i++){
      for(int j = 0; j < this.array.length; j++){
        for(int k = 1; k < 9 - j; k++){
          // if(array[i][j + k] == ' '){
          //   return false;
          // }
          // if(array[i][j] == ' '){
          //   return false;
          // }
          if(array[i][j + k] == ' '){
            continue;
          }
          if(array[i][j] == array[i][j + k]){
            return false;
          }
        }
      }
    }
    return true;
  }


  // Private helper method column that checks to make sure there are no duplicate values in each row
  private boolean column() {
    for(int i = 0; i < this.array.length; i++){
      for(int j = 0; j < this.array[i].length; j++){
        for(int k = 1; k < 9 - j; k++){
          // if(array[i][j + k] == ' '){
          //   return false;
          // }
          // if(array[i][j] == ' '){
          //   return false;
          // }
          if(this.array[i][j + k] == ' '){
            continue;
          }
          if(this.array[i][j] == array[i][j + k]){
            return false;
          }
        }
      }
    }
    return true;
  }


  // Private helper method subsquare2 that puts a 3x3 subsquare into a 1-dimensional array and returns it
  private char[] subsquare2(int squareRow, int squareCol){
    char[] subsquareArray = new char[9];
    int counter = 0;
    for(int i = 0; i < (this.array[0].length) / 3; i++){
      for(int j = 0; j < (this.array.length) / 3; j++){
        subsquareArray[counter] = this.array[i + squareRow * 3][j + squareCol * 3];
        counter++;
      }
    }
    return subsquareArray;
  }


  // Private helper method subsquare1 that checks to make sure there are no duplicate values in the 1-dimensional array.
  // Takes the 1-dimensional array returned in the subsquare2 method as a parameter.
  private boolean subsquare1(char[] subsquareArray){
    for(int j = 0; j < subsquareArray.length; j++){
      for(int k = 1; k < subsquareArray.length - j; k++){
        if(subsquareArray[j + k] == ' '){
          continue;
        }
        // if(subsquareArray[j] == ' '){
        //   return false;
        // }
        // if(subsquareArray[j + k] == ' '){ // ADD THIS TO ROW AND COLUMN METHODS
        //   return false;
        // }
        if(subsquareArray[j] == subsquareArray[j + k]){
          return false;
        }
      }
    }
  return true;
  }


  // Private helper method subsquare that runs subsquare2 and subsquare1 nine times to check each subsquare for dupilcate values.
  private boolean subsquare(){
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        boolean flag = subsquare1(subsquare2(i, j));
        if(flag == false){
          return false;
        }
      }
    }
    return true;
  }


  // isValid method that returns true if there are no duplicate values in each subsquare, column, or row.
  // The private helper methods are used in this method.
  public boolean isValid(){
      if(row() == true && column() == true && subsquare() == true){
        return true;
      }
      return false;
  }


  // isSolved method that returns true if there are no blank spaces left in the puzzle and isValid returns true.
  public boolean isSolved(){
    for(int i = 0; i < this.array[0].length; i++){
      for(int j = 0; j < this.array.length; j++){
        if(array[i][j] == ' '){
          isFull = false;
        }
        else{
          isFull = true;
        }
      }
    }
    if(isValid() == true && isFull == true){
      return true;
    }
    return false;
  }
}
