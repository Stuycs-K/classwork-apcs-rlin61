import java.util.ArrayList;
import java.lang.Math;
public class ArrayListPractice{



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

  public static void replaceEmpty( ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
  for (int i = 0; i < original.size(); i++){
    if (original.get(i).equals("")){
      original.set(i, "Empty");
    }
  }
  }

  public static ArrayList<String> makeReversedList( ArrayList<String> original){
  //return a new ArrayList that is in the reversed order of the original.
    ArrayList<String>reversed = new ArrayList<>(original.size());
    for (int i = 0; i < original.size(); i++){
      reversed.add(original.get(original.size() - i - 1));
    }
    return reversed;

  }

  public static ArrayList<String> mixLists( ArrayList<String> a,
  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
  ArrayList<String>alt = new ArrayList <>();
  
  return null;
  }

  //Example: mixLists(["1","3","5"],["2","4","6","8","10"]) would return the array list: [1,2,3,4,5,6,8,10] .
  }
