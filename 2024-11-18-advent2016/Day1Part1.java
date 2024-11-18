import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1Part1{

  public static int blocks_away(String input){
    int x_corr = 0, y_corr = 0;
    int angle_dir = 0;
    int blocks = 0;
    Scanner sc1 = new Scanner(input);
    Scanner sc2 = new Scanner(input);

    while(sc1.hasNext()){
      if (sc1.next().contains("L")){
        angle_dir -= 90;
      }
      else{
        angle_dir += 90;
      }

      if ((angle_dir >= 360) || (angle_dir <= -360)){
        (angle_dir - ((angle_dir / 360) * 360));
      }

      if (angle_dir == 0){
        y_corr += sc2.nextInt();
      }
      if (angle_dir == 90 || angle_dir == -270){
        x_corr += sc2.nextInt();
      }
      if (angle_dir == 180 || angle_dir == -180){
        y_corr -= sc2.nextInt();
      }
      if (angle_dir == 270 || angle_dir == -90){
        x_corr -= sc2.nextInt();
      }

      blocks = Math.abs(x_corr) + Math.abs(y_corr);
      return blocks;
    }





    return blocks;
  }
}
