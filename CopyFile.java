public class CopyFile {

  import java.util.Scanner;
  import java.io.PrintWriter;
  import java.io.FileNotFoundException;
  import java.io.File;

    public static void main(String[] args) {

        File inFile = null;
        Scanner in = null;
        PrintWriter out = null;
        //determines if user gave us two file names--one to read and one to print to
        if(args.length != 2) {
          System.err.println("Must have two file names");
          return;
        }

        try {
          inFile = new File (args[0]);
          in = new Scanner (inFile);
          out = new PrintWriter(args[1]);

          //do the copy
          while (in.hasNextLine()) {
              String line = in.nextLine(); //read next line in source file
              out.println(line); //print out line to goal file
          }
        }
        catch (FileNotFoundException e) {
          System.err.println(e);
        } catch (Exception e) {
          System.err.println(e);
        }

    }
}
