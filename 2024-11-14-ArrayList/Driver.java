import java.util.ArrayList;
import java.lang.Math;
public class Driver{
public static void main(String[] args) {
  System.out.println("create: " + ArrayListPractice.createRandomArray(20));
  System.out.println("create: " + ArrayListPractice.createRandomArray(200000));
  ArrayList<String> a1 = ArrayListPractice.createRandomArray(10);
  System.out.println("a1: " + a1);
  ArrayList<String> a2 =  ArrayListPractice.createRandomArray(25);
  System.out.println("a2: " + a2);
  ArrayList<String> a3 =  ArrayListPractice.createRandomArray(200000);
 System.out.println("a3: " + a3);
  ArrayListPractice.replaceEmpty(a1);
  ArrayListPractice.replaceEmpty(a3);
  System.out.println("Replaced a1: " + a1);
  System.out.println("Replaced a3: " + a3);
  System.out.println("reversed a2: " + ArrayListPractice.makeReversedList(a2));
  System.out.println("reversed a3: " + ArrayListPractice.makeReversedList(a3));
  System.out.println("mixed a1 and a2: " + ArrayListPractice.mixLists(a1, a2));
  ArrayList<String> a4 =  ArrayListPractice.createRandomArray(200000);
  System.out.println("mixed a3 and a4: " + ArrayListPractice.mixLists(a3, a1));

}
}
