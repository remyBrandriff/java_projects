import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LightsOutFileLoader
{
//use forceLit to set the initial configuration
  public void load(LightsOut game, File inputfile)
  {
    String[] myArray = new String[5];
    String configuration;
    int row = 0;
    System.out.println("Got to File loader");
    try {
      Scanner sc = new Scanner(inputfile);
      myArray[0] = sc.nextLine();
      myArray[1] = sc.nextLine();
      myArray[2] = sc.nextLine();
      myArray[3] = sc.nextLine();
      myArray[4] = sc.nextLine();

        // for(int i=0;i<4;i++)
        // {
        //   myArray[i] = configuration;
        //   if(configuration.charAt(i) == 'X')
        //   {
        //     forceLit(row,i,true);
        //   }
        //   else if(configuration.charAt(i) == '_')
        //   {
        //     forceLit(row,i,false);
        //   }
        //   row++;
        // }
      if(myArray[0].charAt(0) == '_')
      {
        game.forceLit(0,0,true);
      }
      else
      {
        game.forceLit(0,0,false);
      }
      System.out.println(myArray[0]);
      System.out.println(myArray[1]);
      System.out.println(myArray[2]);
      System.out.println(myArray[3]);
      System.out.println(myArray[4]);

    } catch(FileNotFoundException e) {
      System.out.println("Error with input");

  }
  }
  }
