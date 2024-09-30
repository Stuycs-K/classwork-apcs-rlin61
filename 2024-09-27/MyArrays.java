public class MyArrays{
  public static void main(String[] args){
  // test for aryToString
  int[] nums = new int[] {4, 5, 6};
  System.out.println(aryToString(nums).equals("[4, 5, 6]"));
  //test for returnCopy

  System.out.println(aryToString(returnCopy(ary)).equals(ary));
  System.out.println(aryToString(returnCopy(ary)) == ary);
  }
  public static String aryToString(int[] nums){
    String s = "[";
    for (int i = 0; i < nums.length; i++){
      s += nums[i];
      if (i < nums.length -1){
        s += ", ";
      }
      s += "]";
    }
    return s;
  }
  public static int[] returnCopy(int[] ary){
  int[] copy = new int[ary.length];
  for(int i = 0; i < ary.length; i++){
    copy[i] = ary[i];
  }
  return copy;
}
}
