import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Day6 {
    public static void main(String[] args){
        System.out.println(message("Day6Input.txt"));
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

            for (int i = 0; i < 8; i++){
                int left = 0, right = freq[i].length - 1;
                int largestValue = freq[i][0];
                int largestIndex = 0;

                while (left <= right) {
                    int mid = left + (right - left) / 2;

                    if (freq[i][mid] > largestValue) {
                        largestValue = freq[i][mid];
                        largestIndex = mid;
                    }
                    left = mid + 1;
                }
                output += Character.toString((char)(97 + largestIndex));
            }
            return output;
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        return null;
    }
}
