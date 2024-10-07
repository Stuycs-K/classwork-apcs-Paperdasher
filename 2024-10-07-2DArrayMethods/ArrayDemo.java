import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()

    int[] test_arr = new int[]{1, 2, 3, 4};
    int[][] test_2Darr = new int[][]{{0, 1, 2, 3}, {4, 5}, {6}};
    int[][] test_blank2Darr = new int[][]{{0}, {0, 0}, {}};
    int[][] rec_2Darr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] replaceNeg = new int[][]{{-1, -3, 0}, {5, -9, 4}, {-8, 24, 3}};

    //test case for arrToString
    System.out.println(arrToString(test_arr) + " should equal to: " + Arrays.toString(test_arr));

    //test case for arrToString2D
    System.out.println(arrToString(test_2Darr) + " should equal to: " + Arrays.deeptoString(test_2Darr));

    //test cases for arr2DSum
    System.out.println(arr2DSum(test_2Darr) == 21);
    System.out.println(arr2DSum(test_blank2Darr) == 0);

    //test case for swapRC
    System.out.println(arrToString(swapRC(rec_2Darr)) + " should equal to: " + "{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}");

    //test case for replaceNegative
    System.out.println("Original 2D Array with Negatives: " + arrToString2D(replaceNeg));
    replaceNegative(replaceNeg);
    System.out.println("New 2D Array with Negatives replaced: " + arrToString2D(replaceNeg));

    //test cases for copy
    System.out.println(test_2Darr + " should not equal to: " + copy(test_2Darr));
    System.out.println(arrToString2D(copy(test_2Darr)) + " should equal to: " + "{{0, 1, 2, 3}, {4, 5}, {6}}");

    System.out.println(test_blank2Darr + " should not equal to: " + copy(test_blank2Darr));
    System.out.println(arrToString2D(copy(test_blank2Darr)) + " should equal to: " + "{{0}, {0, 0}, {}}");

    test_2Darr[0][3] = 4;
    System.out.println(arrToString2D(test_2Darr) + " should equal to: " + "{{0, 1, 2, 4}, {4, 5}, {6}}");
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    if (ary.length == 0) {
      return "[]";
    }

    String res = "[";

    for (int x = 0; x < ary.length; x++) {
      res += ary[x];
      if (x != (ary.length - 1)) {
        res += ", ";
      }
    }

    res += "]";
    return res;
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    if (ary.length == 0) {
      return "[]";
    }

    String res = "[";

    for (int x = 0; x < ary.length; x++) {
      res += arrToString(ary[x]);

      if (x != (ary.length - 1)) {
        res += ", ";
      }
    }

    res += "]";

    //this should use arrToString(int[])
    return res;
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    return 0;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    if (nums.length == 0){
        return 0;
    }
    for (int i = 0; i < nums.length; i++){
        if (nums[i].length != 0){
            for (int x = 0; x < nums[i].length; x++){
                sum += nums[i][x];
            }
        }
    }
    return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i++){
      for (int x = 0; x < vals[i].length; x++){
        if (vals[i][x] < 0){
          if (i == x){
            vals[i][x] = 1;
          }
          else{
            vals[i][x] = 0;
          }
        }
      }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[] copy1D(int[] nums){
    int [] copy = new int[nums.length];
    for (int i = 0; i < copy.length; i++){
      copy[i] = nums[i];
    }
    return copy;
  }

  public static int[][] copy(int[][] nums){
    int [][] copy = new int[nums.length][];
    for (int i = 0; i < nums.length; i++){
      copy[i] = copy1D(nums[i]);
    }
    return copy;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] swappedRC = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums.length; i++){
        for (int x = 0; x < nums[i].length; x++){
            swappedRC[x][i] = nums[i][x];
        }
    }
    return swappedRC;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    return "";
  }
}
