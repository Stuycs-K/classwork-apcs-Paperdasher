import java.util.ArrayList;

public class Driver{
  public static void main(String[] args){
    //testing createRandomArray
    System.out.println(ArrayListPractice.createRandomArray(0));
    System.out.println(ArrayListPractice.createRandomArray(10));
    System.out.println(ArrayListPractice.createRandomArray(1));
    System.out.println(ArrayListPractice.createRandomArray(50));

    //testing replaceEmpty
    System.out.println("\nTESTING REPLACEMEMPTY");
    ArrayList<String> test1 = ArrayListPractice.createRandomArray(5);
    ArrayList<String> test2 = ArrayListPractice.createRandomArray(0);
    ArrayList<String> test3 = ArrayListPractice.createRandomArray(200000);

    System.out.print(test1 + " --> ");
    ArrayListPractice.replaceEmpty(test1);
    System.out.println(test1);
    
    System.out.print(test2 + " --> ");
    ArrayListPractice.replaceEmpty(test2);
    System.out.println(test2);
    
    /*System.out.print(test3 + " --> ");
    ArrayListPractice.replaceEmpty(test3);
    System.out.println(test3);*/

    //testing makeReversedList
    System.out.println("\nTESTING MAKEREVERSEDLIST");
    System.out.println(test2 + " --> " + ArrayListPractice.makeReversedList(test2));
    System.out.println(test1 + " --> " + ArrayListPractice.makeReversedList(test1));
    //System.out.println(test3 + " --> " + ArrayListPractice.makeReversedList(test3));

    //testing mixLists
    System.out.println("\nTESTING MIXLISTS");
    System.out.println(test2 + " --> " + ArrayListPractice.mixLists(test2));
    System.out.prinltn(test1 + " --> " + ArrayListPractice.mixLists(test1));
    //System.out.println(test3 + " --> " + ArrayListPractice.mixLists(test3));
  }
}
