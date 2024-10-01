//1. Write both your names + emails at the top of the document as a comment.
// William Li and Ricky Lin williaml298@nycstudents.net rickyl49@nycstudents.net

public class ArrayMethods{

  public static void main(String[] args){
    int[] test1 = new int[] {2, 3, 4, 9};
    int[][] test2 = new int[][] {{2, 3, 4}, {5, 6, 7}, {8, 9, 10}};
    int[][] test21 = new int[][] {{4}, {1, 2, 4}};
    int[][] test3 = new int[][] {{4, 5, 1}, {10, 10, 10}, {1, 2, 3}};
    int[][] test4 = new int[][] {{1,2,3},{4,5,6}};
    int[][] test5 = new int[][] {{}, {1, 5}};
    int[][] test6 = new int[][] {{3, 3, 3}, {4, 5, 1}, {41, 414, 1}, {414, 4141, 41}};

    System.out.println(arrToString(test1).equals("[2, 3, 4, 9]"));

    System.out.println(arrToString(test2).equals("[[2, 3, 4], [5, 6, 7], [8, 9, 10]]"));
    System.out.println(arrToString(test5).equals("[[], [1, 5]]"));
    System.out.println(arrToString(test21).equals("[[4], [1, 2, 4]]"));
    System.out.println(arr2DSum(test3) == 46);
    System.out.println(arr2DSum(test21) == 11);
    System.out.println(arr2DSum(test5) == 6);
    System.out.println(arrToString(swapRC(test4)));
    System.out.println(arrToString(swapRC(test6)));

  }
  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
  * "[2, 3, 4, 9]"
  * Note the comma+space between values, and between values
  */
  public static String arrToString(int[] nums){
    String s = "[";
    for (int i = 0; i < nums.length; i++){
      s += nums[i];
      if (i < nums.length -1){
        s += ", ";
      }

    }
    s += "]";
    return s;
  }

  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
  public static String arrToString(int[][] ary){
     //this should use arrToString(int[])
    String empty = "[";
    for(int i = 0; i < ary.length; i++){
      empty += arrToString(ary[i]);
      if (i != ary.length - 1){
        empty += ", ";
      }

    }
    empty += "]";


    return empty;
  }

  //Return the sum of all of the values in the 2D array
  public static int arr2DSum(int[][]nums){
    //use a nested loop to solve this
    int sum = 0;
    for(int i = 0; i < nums.length; i++){
      for(int x = 0; x < nums[i].length; x++){
        sum += nums[i][x];
      }
    }
    return sum;
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
*/
  public static int[][] swapRC(int[][]nums){
    int[][] arr1 = new int[nums[0].length][nums.length];
    for(int i = 0; i < nums.length; i++){
      for(int x = 0; x < nums[i].length; x++){
        arr1[x][i] = nums[i][x];
      }
    }
    return arr1;
  }

}
