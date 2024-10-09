import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    int[] test1 = new int[] {2, 3, 4, 9};
    int[][] test2 = new int[][] {{2, 3, 4}, {5, 6, 7}, {8, 9, 10}};
    int[][] test21 = new int[][] {{4}, {1, 2, 4}};
    int[][] test3 = new int[][] {{4, 5, 1}, {10, 10, 10}, {1, 2, 3}};
    int[][] test4 = new int[][] {{1,2,3},{4,5,6}};
    int[][] test5 = new int[][] {{}, {1, 5}};
    int[][] test6 = new int[][] {{3, 3, 3}, {4, 5, 1}, {41, 414, 1}, {414, 4141, 41}};
    int[][] test7 = new int[][] {{-1,-1,-3}, {-5, -5, -1}};
    int[][] test8 = new int[][] {{-1,-1,-3}, {-5, -5, -1}, {-1, -1, -1}, {-1, -1, -1}};
    int[][] test9 = new int[][] {{4, 5}, {3, 2}};
    int[][] test10 = new int[][] {{}, {10, 40, 1}, {19, 1}};

    System.out.println(arrToString(test1).equals("[2, 3, 4, 9]"));

    System.out.println(arrToString(test2).equals("[[2, 3, 4], [5, 6, 7], [8, 9, 10]]"));
    System.out.println(arrToString(test5).equals("[[], [1, 5]]"));
    System.out.println(arrToString(test21).equals("[[4], [1, 2, 4]]"));
    System.out.println(arr2DSum(test3) == 46);
    System.out.println(arr2DSum(test21) == 11);
    System.out.println(arr2DSum(test5) == 6);
    System.out.println(arrToString(swapRC(test4)));
    System.out.println(arrToString(swapRC(test6)));
    System.out.println(arrToString(replaceNegative(test7)));
    System.out.println(arrToString(replaceNegative(test8)));
    System.out.println(copy(test9) != test9);
    System.out.println(arrToString(copy(test9)).equals(arrToString(test9)));
    int[][] copy9 = copy(test9);
    test9[0] = new int[] {1, 2};
    System.out.println(!arrToString(copy9).equals(arrToString(test9)));
    System.out.println(copy(test10) != test10);
    System.out.println(arrToString(copy(test10)).equals(arrToString(test10)));
    int[][] copy10 = copy(test10);
    test10[2] = new int[] {0, 0};
    System.out.println(!arrToString(copy10).equals(arrToString(test10)));
//do countZeros2D and the method array tests
  }
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()

  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
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

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
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

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    return 0;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for(int i = 0; i < nums.length; i++){
      for(int x = 0; x < nums[i].length; x++){
        sum += nums[i][x];
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
    for (int i = 0; i < vals.length; i++)
    {
      for (int x = 0; x < vals[i].length; x++)
      {
        if (x == i && vals[i][x] < 0)
        {
          vals[i][x] = 1;
        }
        else if (vals[i][x] < 0)
        {
          vals[i][x] = 0;
        }
        else
        {
          vals[i][x] = vals[i][x];
        }
      }
    }
    return vals;
    }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
    int[][] dupe = new int[nums.length][];
    for (int i = 0; i < nums.length; i++){
      dupe[i] = copyHelper(nums[i]);
    }
    return dupe;
  }

  public static int[] copyHelper(int[] arry){
    int[] copyarry = new int[arry.length];
    for(int x = 0; x < arry.length; x++){
       copyarry[x] = arry[x];
    }
    return copyarry;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] arr1 = new int[nums[0].length][nums.length];
    for(int i = 0; i < nums.length; i++){
      for(int x = 0; x < nums[i].length; x++){
        arr1[x][i] = nums[i][x];
      }
    }
    return arr1;
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
