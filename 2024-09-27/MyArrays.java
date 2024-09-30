public class MyArrays{
  public static String arrayTostring(int[] ary){
    String array_string = "[";
    for (int i = 0; i < ary.length; i++){
      if (i == ary.length - 1){
      array_string += ary[i];
      }
      else{
        array_string += ary[i] + ", ";
      }
    }
    array_string += "]";
    return array_string;
  }
  
  public static int[] returnCopy(int[]ary){
    int [] copy_ary = new int[ary.length];
    for (int i = 0; i < ary.length; i++){
      copy_ary[i] = ary[i];
    }
    return copy_ary;
  }


  public static int[] concatArray(int[]ary1,int[]ary2){
    int [] concat_ary = new int[ary1.length + ary2.length];
    for (int i = 0; i < ary1.length; i++){
      concat_ary[i] = ary1[i];
    }
    for (int i = 0; i < ary2.length; i++){
      concat_ary[i + ary1.length] = ary2[i];
    }
    return concat_ary;
  }

  public static void main(String[] args){
    int [] ary = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
    int [] ary2 = new int[] {9, 10, 11, 12, 13};

    int [] ary3 = new int[] {};
    int [] ary4 = new int[] {};

    int [] ary5 = new int[5];
    int [] ary6 = new int[2];

    System.out.println(returnCopy(ary) == ary);
    
    System.out.println(arrayTostring(ary));
    
    System.out.println(arrayTostring(ary2));

    System.out.println(arrayTostring(concatArray(ary, ary2)));

    
    System.out.println(returnCopy(ary3) == ary3);
    
    System.out.println(arrayTostring(ary3));
    
    System.out.println(arrayTostring(ary4));

    System.out.println(arrayTostring(concatArray(ary3, ary4)));

    
    System.out.println(returnCopy(ary6) == ary6);
    
    System.out.println(arrayTostring(ary5));
    
    System.out.println(arrayTostring(ary6));

    System.out.println(arrayTostring(concatArray(ary5, ary6)));

  }

}
