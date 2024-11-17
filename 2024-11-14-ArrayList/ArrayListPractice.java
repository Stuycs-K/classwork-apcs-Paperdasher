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

  public static void replaceEmpty( ArrayList<String> original){
    //Modify the ArrayList such that it has all of the empty strings are
    //replaced with the word "Empty".
    for (int i = 0; i < original.size(); i++) {
      if (original.get(i) == "") {
        original.set(i, "Empty");
      }
    }
  }

  public static ArrayList<String> makeReversedList( ArrayList<String> original){
    //return a new ArrayList that is in the reversed order of the original.
    ArrayList<String> revArr = new ArrayList<String>(original.size());
    for (int i = original.size() - 1; i >= 0; i--) {
      revArr.add(original.get(i));
    }
    return revArr;
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    //return a new ArrayList that has all values of a and b in alternating order that is:
    //a[0], b[0], a[1], b[1]...
    //If one list is longer than the other, just attach the remaining values to the end.
    ArrayList<String> combined = new ArrayList<String>(a.size() + b.size());
    int maxindex = 0, lessindex = 0;
    if (a.size() <= b.size()){
      maxindex = b.size();
      lessindex = a.size();
    }
    if (b.size() <= a.size()){
      maxindex = a.size();
      lessindex = b.size();
    }
    for (int i = 0; i < maxindex; i++){
      if(i < lessindex){
        combined.add(a.get(i));
        combined.add(b.get(i));
      }
      else if(i < a.size() && i >= b.size()){
        combined.add(a.get(i));
      }
      else{
        combined.add(b.get(i));
      }
    }
    return combined;
  } 
}
