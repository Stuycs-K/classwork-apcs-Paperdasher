import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1Part1{

  public static int blocks_away(String input){
    int x_corr = 0, y_corr = 0;
    int angle_dir = 0, blocks = 0;
    String[] datainput = null;
    try{
      File file = new File(input);
      Scanner sc = new Scanner(file);
      String data = sc.nextLine();
      datainput = data.split(", ");
      sc.close();  
    } catch(FileNotFoundException e){
      System.out.println("File not found");
    }
    
    if (datainput == null){
      return 0;
    }

    for (int i = 0; i < datainput.length; i++){
      if (datainput[i].contains("L")){
        angle_dir--;
      }
      else{
        angle_dir++;
      }

      if ((angle_dir >= 4) || (angle_dir <= -4)){
        angle_dir = (angle_dir + 4) % 4;
      }
      
      blocks = Integer.parseInt(datainput[i].substring(1));

      if (angle_dir == 0){
        y_corr += blocks;
      }
      if (angle_dir == 1 || angle_dir == -3){
        x_corr += blocks;
      }
      if (angle_dir == 2|| angle_dir == -2){
        y_corr -= blocks;
      }
      if (angle_dir == 3 || angle_dir == -1){
        x_corr -= blocks;
      }
    }

    return Math.abs(x_corr) + Math.abs(y_corr);
  }
}
