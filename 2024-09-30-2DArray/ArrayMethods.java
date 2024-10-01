// William Li and Ricky Lin williaml298@nycstudents.net rickyl49@nycstudents.net

public class ArrayMethods{

  public static void main(String[] args){
    int[] test1 = new int[] {1, 2, 3, 4, 5, 6};
    int[][] test2 = new int[][] {{2, 3, 4}, {5, 6, 7}, {8, 9, 10}};

    System.out.println(arrToString(test1).equals("[1, 2, 3, 4, 5, 6]"));

    System.out.println(arrToString(test2).equals("[[2, 3, 4], [5, 6, 7], [8, 9, 10]]"));

  }

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
  public static String arrToString(int[][]ary){
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

  /*Return the sum of all of the values in the 2D array
  public static int arr2DSum(int[][]nums){
    //use a nested loop to solve this
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}

  public static int[][] swapRC(int[][]nums){
    return new int[1][1];
  }
*/
}
