import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Day2 {
  public static void main(String[] args){
      Bathroom("Day2Input.txt");
  }

  public static int Bathroom(String input){

    String[] data = null;
    try{
      File file = new File(input);
      Scanner sc = new Scanner(file);
      for (int i = 0; sc.hasNextLine(); i++){
        data[i] = sc.nextLine();
      }
      sc.close();
    } catch(FileNotFoundException e){
      System.out.println("File not found");
    }

    String[][] keypad = new String[3][3];

    

  }
}
