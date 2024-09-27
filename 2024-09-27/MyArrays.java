public class MyArray{
  public static void main(Strings[] args){

  }
  public static String aryToSTring(int[] nums){
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
}
