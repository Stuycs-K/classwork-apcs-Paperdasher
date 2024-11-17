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
    ArrayList<String> test4 = ArrayListPractice.createRandomArray(20);
    ArrayList<String> test5 = ArrayListPractice.createRandomArray(10000);
    ArrayList<String> test6 = new ArrayList<String> (5);
    ArrayList<String> test7 = new ArrayList<String> (15);
    test6.add("1"); test6.add("3"); test6.add("5"); test6.add("7"); test6.add("9");
    test7.add("2"); test7.add("4"); test7.add("6"); test7.add("8"); test7.add("10"); test7.add("12"); test7.add("14"); 
    test7.add("16"); test7.add("18"); test7.add("20"); test7.add("22");

    System.out.println(test1); System.out.println(test2);
    System.out.println("Mixing randomArray with an empty array: " + ArrayListPractice.mixLists(test2, test1));

    System.out.println(test6); System.out.println(test7);
    System.out.println("Mixing test6 and test7: " + ArrayListPractice.mixLists(test6, test7));
    System.out.println("Mixing test7 and test6: " + ArrayListPractice.mixLists(test7, test6));

    System.out.println(test4); System.out.println(test6);
    System.out.println("Mixing randomArray with preset array" + ArrayListPractice.mixLists(test4, test6));
    //System.out.println(ArrayListPractice.mixLists(test5, test3));
  }
}
