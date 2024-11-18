import java.util.ArrayList;
import java.lang.Math;
public class ArrayListPractice{


//Create and return an ArrayList of the specified size that is randomly filled. Fill it
//with strings that look like the integers from 0 to 10 or similar, but make every 0 turn into the empty string "".
//Do not make very long numbers that are difficult to read. You shoudl use Math.random()
  public static ArrayList<String>createRandomArray(int size){
  ArrayList<String>arry = new ArrayList<String>(size);
  for (int i = 0; i < size; i++){
   int num = (int) (Math.random() * 10);
   if (num == 0){
     arry.add("");
   }
   else {
   arry.add("" + num);
  }
  }
  return arry;
  }
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
  public static void replaceEmpty( ArrayList<String> original){
  for (int i = 0; i < original.size(); i++){
    if (original.get(i).equals("")){
      original.set(i, "Empty");
    }
  }
  }
  //return a new ArrayList that is in the reversed order of the original.
  public static ArrayList<String> makeReversedList( ArrayList<String> original){
    ArrayList<String>reversed = new ArrayList<>(original.size());
    for (int i = 0; i < original.size(); i++){
      reversed.add(original.get(original.size() - i - 1));
    }
    return reversed;

  }
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
  //Example: mixLists(["1","3","5"],["2","4","6","8","10"]) would return the array list: [1,2,3,4,5,6,8,10] .
  public static ArrayList<String> mixLists( ArrayList<String> a, ArrayList<String> b){
  ArrayList<String>alt = new ArrayList <>();
  int smaller = Math.min(a.size(), b.size());
  for (int i = 0; i < smaller; i++){
    alt.add(a.get(i));
    alt.add(b.get(i));}
    for (int i = smaller; i < a.size(); i++){
      alt.add(a.get(i));}
    for (int i = smaller; i < b.size(); i++){
      alt.add(b.get(i));}
  return alt;}
}
