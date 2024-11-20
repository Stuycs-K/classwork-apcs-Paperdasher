import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Day2 {
  public static void main(String[] args){
      System.out.println(Bathroom("Day2Input.txt"));
  }

  public static String Bathroom(String input){

    String key = "";
    int[][] keypad = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int currentRow = 1;  
    int currentCol = 1;
    
    try{
      File file = new File(input);
      Scanner sc = new Scanner(file);

      while(sc.hasNextLine()){
        String datastring = sc.nextLine();
        for (char i : datastring.toCharArray()){
          if (i == 'U') {
            if (currentRow - 1 >= 0) {
              currentRow--;
            }
          } 
          else if (i == 'D') {
            if (currentRow + 1 < keypad.length) {
              currentRow++;
            }
          } 
          else if (i == 'L') {
            if (currentCol - 1 >= 0) {
              currentCol--;
            }
          } 
          else{
            if (currentCol + 1 < keypad[0].length) {
              currentCol++;
            }
          }
        }
        key += keypad[currentRow][currentCol]; 
      }
    sc.close();
  }catch(FileNotFoundException e){
      System.out.println("File not found");}
  return key;}
}
