public class MyArrays{
  public static void main(String[] args){
  // test for aryToString
  int[] nums = new int[] {4, 5, 6};
  System.out.println(aryToString(nums).equals("[4, 5, 6]"));
  int[] nums1 = new int[] {1, 3, 4, 5};
  System.out.println(aryToString(nums1).equals("[1, 3, 4, 5]"));
  int[] nums2 = new int[] {};
  System.out.println(aryToString(nums2).equals("[]"));
  //test for returnCopy
int[] list1 = {4, 5, 6, 1};
  System.out.println(aryToString(returnCopy(list1)).equals(aryToString(list1)));
  System.out.println(returnCopy(list1) != list1);
  int[] list2 = {99, 10, 14, 13, 141, 41};
    System.out.println(aryToString(returnCopy(list2)).equals(aryToString(list2)));
    System.out.println(returnCopy(list2) != list2);

  //test for concatArray
  int[] ary1 = {1, 2};
  int[] ary2 = {3, 4};
  int[] concatenated = concatArray(ary1, ary2);
  System.out.println(aryToString(concatenated).equals("[1, 2, 3, 4]"));
  int[] ary3 = {1, 24, 12};
  int[] ary4 = {94, 104, 101, 11};
  int[] concatenated1 = concatArray(ary3, ary4);
  System.out.println(aryToString(concatenated1).equals("[1, 24, 12, 94, 104, 101, 11]"));

  }
  public static String aryToString(int[] nums){
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
