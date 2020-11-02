public class ComboLock {

  //creates arrays of three spaces for the combination #'s, # of tries, and direction of turn
  private int[] num = new int[3];
  private int[] tries = new int[3];
  private int[] direction = new int[3];
  private int count;
  private int position;


  public ComboLock (int secret1, int secret2, int secret3) {
      //initializes variables
      num[0] = secret1;
      num[1] = secret2;
      num[2] = secret3;
      position = 0;
      count = 0;
  }

  public void reset() {
    //sets the 'lock' back to 0
      attempt[0] = 0;
      attempt[1] = 0;
      attempt[2] = 0;
  }

  public void turnLeft(int ticks) {
      //turns the 'dial' to the left
      position = (position - ticks) + 39;
      tries[count] = position;
      direction[count] = 1;
      count++;
  }

  public void turnRight(int ticks) {
      //turns dial to the right
      position = position + ticks;
      tries[count] = position;
      direction[count] = 0;
      count++;
  }

  public boolean open(int secret) {
      //pops open the 'lock' if everything matches up
      int correct = 0;
      for (int i = 0; i<3; i++) {
        if (tries[i] == code[i]) {
          correct++;
        }
      }
  }

  //use modulus for turning the lock
  //val += clicks
  //val %=  7

  public static void main(String[] args) {

  }
}
