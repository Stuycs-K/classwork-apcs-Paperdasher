import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Day6 {
    public static void main(String[] args){
        System.out.println(message("Day6Input.txt"));
        System.out.println(message2("Day6Input.txt"));
    }

    public static String message(String inputfile){
        int[][] freq = new int[8][26];
        int tempnum;
        String current = "";
        try{
            File input = new File(inputfile);
            Scanner sc = new Scanner(input);

            String output = "";

            for (int i = 0; sc.hasNextLine(); i++){
                current = sc.nextLine();
                for (int j = 0; j < 8; j++){
                    tempnum = current.charAt(j) - 'a';
                    freq[j][tempnum]++;
                }
            }

            int max = -1, maxIndex = -1;
            for (int i = 0; i < 8; i++){
                max = -1; maxIndex = -1;
                for (int j = 0; j < 26; j++){
                    if (max < freq[i][j]){
                        max = freq[i][j];
                        maxIndex = j;
                    }
                }
                output += Character.toString((char)(97 + maxIndex));
            }
            return output;
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        return null;
    }

    public static String message2(String inputfile){
        int[][] freq = new int[8][26];
        int tempnum;
        String current = "";
        try{
            File input = new File(inputfile);
            Scanner sc = new Scanner(input);

            String output = "";

            for (int i = 0; sc.hasNextLine(); i++){
                current = sc.nextLine();
                for (int j = 0; j < 8; j++){
                    tempnum = current.charAt(j) - 'a';
                    freq[j][tempnum]++;
                }
            }

            int min = 500, minIndex = 500;
            for (int i = 0; i < 8; i++){
                min = 500; minIndex = 500;
                for (int j = 0; j < 26; j++){
                    if (min > freq[i][j]){
                        min = freq[i][j];
                        minIndex = j;
                    }
                }
                output += Character.toString((char)(97 + minIndex));
            }
            return output;
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        return null;
    }
}
