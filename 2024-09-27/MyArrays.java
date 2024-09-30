public class MyArrays{
  public static void main(String[] args){
  // test for aryToString
  int[] nums = new int[] {4, 5, 6};
  System.out.println(aryToString(nums).equals("[4, 5, 6]"));
  //test for returnCopy

  System.out.println(aryToString(returnCopy(ary)).equals(ary));
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
public static int[] concatArray(int[]ary1,int[]ary2){
  int[] copy = new int[ary1.length + ary2.length];
  for (int i = 0; i < ary1.length; i++){
    copy[i] = ary1[i];
  }
  for (int i = 0; i < ary2.length; i++){
    copy[i + (ary1.length)] = ary2[i];
  }
  return copy;
}
}
