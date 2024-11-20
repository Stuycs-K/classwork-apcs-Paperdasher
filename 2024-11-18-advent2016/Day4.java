import java.io.FileNotFoundException;

public class Day4 {
    public static void main(String[] args){
        System.out.println(getSum("Day4Input.txt"));
    }

    public static boolean checkreal(String room){
        //check if room is real or not
        //if charAt val is >57, letter
        for (int i = 0; i < room.length(); i++){
          if (room.charAt(i) > 57){
              int counter++;//*****make one for each new letter
          }
        }
        String top5 = "";//add top 5 char to string
        return top5.equals(room.substring(-2, -7));
    }

    public static int ID(String room){
        //gets ID of room to sum up
        return -1;
    }
    public static int getSum(String inputfile){
        try{
            File file = new File(inputfile);
            Scanner sc = new Scanner(file);
            int sum = 0;
            String room = "";

            while(sc.hasNextLine()){
                room = sc.nextLine();
                if (checkreal(room)){
                    sum += ID(room);
                }
            }
            return sum;
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            return -1;
        }
    }
}
