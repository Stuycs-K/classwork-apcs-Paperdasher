import java.util.ArrayList;

public class ArrayListPractice{
  public static ArrayList<String>createRandomArray(int size){
    ArrayList<String> randomarray = new ArrayList<String>(size);
    for (int i = 0; i < size; i++){
      int temp = (int)(Math.random() * 11);
      String Temp = "";
      if (temp != 0){
        Temp += temp;
      }
      randomarray.add(Temp);
    }
    return randomarray;
  }
}
