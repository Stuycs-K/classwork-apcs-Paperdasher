import java.util.ArrayList;

public class Driver{
  public static void main(String[] args){
    //testing createRandomArray
    System.out.println(ArrayListPractice.createRandomArray(0));
    System.out.println(ArrayListPractice.createRandomArray(10));
    System.out.println(ArrayListPractice.createRandomArray(1));
    System.out.println(ArrayListPractice.createRandomArray(50));

    //testing replaceEmpty
    System.out.println("\n");
    ArrayList<String> test1 = ArrayListPractice.createRandomArray(5);
    System.out.print(test1 + " --> ");
    ArrayListPractice.replaceEmpty(test1);
    System.out.println(test1);
    ArrayList<String> test2 = ArrayListPractice.createRandomArray(0);
    System.out.print(test2 + " --> ");
    ArrayListPractice.replaceEmpty(test2);
    System.out.println(test2);
    ArrayList<String> test3 = ArrayListPractice.createRandomArray(200000);
    System.out.print(test3 + " --> ");
    ArrayListPractice.replaceEmpty(test3);
    System.out.println(test3);
  }
}
