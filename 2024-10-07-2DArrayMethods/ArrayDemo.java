import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    int[][] test1 = new int[2][2];
    int[][] test2 = new int[][] {{4, 5}, {}, {0, 0, 1}};
    int[] test3 = new int[] {4, 5, 6};
    System.out.println(countZeros2D(test1) == 4);
    System.out.println(countZeros2D(test2) == 2);
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    System.out.println(Arrays.toString(test3).equals(arrToString(test3)));
    System.out.println(Arrays.deepToString(test2).equals(arrToString(test2)));
  }




  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String s = "[";
    for (int i = 0; i < ary.length; i++){
      s += ary[i];
      if (i < ary.length -1){
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
    int count = 0;
    for (int i = 0; i < nums.length; i++){
        for(int x = 0; x < nums[i].length; x++){
          if(nums[i][x] == 0){
            count +=1;
          }
        }
    }
    return count;
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
    String table = "<table>";
    for (int i = 0; i < nums.length; i++){
      table += "<tr>";
      for (int x = 0; x < nums[i].length; x++){
        table = table + "<td>" + nums[i][x] + "/td";

      }
      table += "</tr>";
    }
    table += "</table>";
    return table;
  }
}
