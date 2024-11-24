import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day1Part2 {
    public static void main(String[] args){
        System.out.println(reachtwice("Day1Part1Input.txt"));
    }

    public static int reachtwice(String filename){
        int x_corr = 0, y_corr = 0;
        int angle_dir = 0, blocks = 0;

        try{
            File file = new File(filename);
            Scanner sc = new Scanner(file);
            ArrayList<String> visited = new ArrayList<String>();

            while(sc.hasNext()){
                String direction = sc.next();
                if (direction.substring(0, 1).equals("L")){
                    angle_dir--;
                }
                else{
                    angle_dir++;
                }

                if ((angle_dir >= 4) || (angle_dir <= -4)){
                    angle_dir = (angle_dir + 4) % 4;
                }

                blocks = Integer.parseInt(direction.substring(1, direction.length() - 1));
                for (int i = 0; i < blocks; i++){
                    if (angle_dir == 0){
                        y_corr++;
                    }
                    if (angle_dir == 1 || angle_dir == -3){
                        x_corr++;
                    }
                    if (angle_dir == 2|| angle_dir == -2){
                        y_corr--;
                    }
                    if (angle_dir == 3 || angle_dir == -1){
                        x_corr--;
                    }
                    String location = x_corr + ", " + y_corr;
                    if (visited.contains(location)){
                        return Math.abs(x_corr) + Math.abs(y_corr);
                    }
                    visited.add(location);
                }
            }
          } catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        return -1;
    }
}
