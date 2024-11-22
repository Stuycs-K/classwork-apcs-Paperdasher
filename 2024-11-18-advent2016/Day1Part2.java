import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1Part2 {
    public static void main(String[] args){
        System.out.println(reachtwice("Day1Part1Input.txt"));
    }

    public static int reachtwice(String filename){
        try{
            File file = new File(filename);
            Scanner sc = new Scanner(file);
            String data = sc.nextLine();
            datainput = data.split(", ");
            sc.close();  
          } catch(FileNotFoundException e){
            System.out.println("File not found");
        }

    }
}
