public class ArrayMethods {
    public static void main(String[] args) {
        int[] test_arr = new int[]{1, 2, 3, 4};
        int[][] test_2Darr = new int[][]{{0, 1, 2, 3}, {4, 5}, {6}};
        int[][] test_blank2Darr = new int[][]{{0}, {0, 0}, {}};
        int[][] rec_2Darr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] replaceNeg = new int[][]{{-1, -3, 0}, {5, 9, 4}, {-8, 24, 3}}

        //test case for arrToString
        System.out.println(arrToString(test_arr) + " should equal to: " + "[1, 2, 3, 4]");

        //test case for arrToString2D
        System.out.println(arrToString2D(test_2Darr) + " should equal to: " + "[[0, 1, 2, 3], [4, 5], [6]]");

        //test cases for arr2DSum
        System.out.println(arr2DSum(test_2Darr) == 21);
        System.out.println(arr2DSum(test_blank2Darr) == 0);

        //test case for swapRC
        System.out.println(arrToString2D(swapRC(rec_2Darr)) + " should equal to: " + "{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}");


        System.out.println(replaceNeg)
      }

      //1. Anzam S: anzams@nycstudents.net
      // Sean: seanyutot@nycstudents.net

      //2. Copy your arrToString method from before.
      /**Return a String that represets the array in the format:
      * "[2, 3, 4, 9]"
      * Note the comma+space between values, and between values
      */
      public static String arrToString(int[] nums) {
        if (nums.length == 0) {
          return "[]";
        }

        String res = "[";

        for (int x = 0; x < nums.length; x++) {
          res += nums[x];
          if (x != (nums.length - 1)) {
            res += ", ";
          }
        }

        res += "]";
        return res;
      }

      //3. Write arrToString, with a 2D array parameter.
      //Note: Different parameters are allowed with the same function name.
      /**Return a String that represets the 2D array in the format:
        * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
        * Note the comma+space between values, and between arrays
        * You are encouraged to notice that you may want to re-use
        * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
        */
      public static String arrToString2D(int[][]ary){
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

      /*Return the sum of all of the values in the 2D array */
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

      /**Rotate an array by returning a new array with the rows and columns swapped.
        * You may assume the array is rectangular and neither rows nor cols is 0.
        * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
        */
      public static int[][] swapRC(int[][]nums){
        int[][] swappedRC = new int[nums[0].length][nums.length];
        for (int i = 0; i < nums.length; i++){
            for (int x = 0; x < nums[i].length; x++){
                swappedRC[x][i] = nums[i][x];
            }
        }
        return swappedRC;
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
    int [][] copy = new int[][]
    for (int i = 0; i < nums.length; i++){
      copy[i] = copy1D(nums[i]);
    }
    return copy;
  }
}
