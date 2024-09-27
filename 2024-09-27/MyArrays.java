public class MyArrays{
  public static int[] returnCopy(int[]ary){
    String array_string = "";
    for (int i = 0; i < ary.length; i++){
      if (i == arr.length - 1){
      array_string += nums[i];
      }
      else{
        array_string += nums[i] + ", ";
      }
    }
    array_string += "]";
    return array_string;
  }


  public static int[] concatArray(int[]ary1,int[]ary2){
    int [] concat_ary = new int[ary1.length + ary2.length];
    for (int i = 0; i < concat_ary.length; i++)
  }

  public static void main(String[] args){
    int [] ary = new int[] {5, 3, 10, 24, 9, 6};
    System.out.println(returnCopy(ary) == arr);
    System.out.println(concatArray(ary, ));
  }

}
