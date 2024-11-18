import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class TriangleTester{
   public static int countTrianglesA(String filename){
     int count = 0;
     try {
       File file = new File(filename);
       Scanner input = new Scanner(file);
       while (input.hasNextInt()){
         if (testTriangle(input.nextInt(), input.nextInt(), input.nextInt())){
           count += 1;
         }
       }
       input.close();
     } catch (FileNotFoundException ex) {
       System.out.println("File not found");
       System.exit(1);
     }
     return count;
   }
   public static int countTrianglesB(String filename){
     ArrayList<int[]>arrOfRow = new ArrayList<int[]>();
     int count = 0;
     try {
       File file = new File(filename);
       Scanner input = new Scanner(file);
       while(input.hasNextInt()){
         int[] row = new int[3];
         for (int i = 0; i < 3; i++){
             row[i] = input.nextInt();
         }
         arrOfRow.add(row);
       }
       for (int i = 0; i < arrOfRow.size(); i+=3){
         if (testTriangle(arrOfRow.get(i)[0], arrOfRow.get(i + 1)[0], arrOfRow.get(i + 2)[0])){
           count += 1;
         }
         if (testTriangle(arrOfRow.get(i)[1], arrOfRow.get(i + 1)[1], arrOfRow.get(i + 2)[1])){
           count += 1;
         }
         if (testTriangle(arrOfRow.get(i)[2], arrOfRow.get(i + 1)[2], arrOfRow.get(i + 2)[2])){
           count += 1;
         }
       }
       input.close();
     } catch (FileNotFoundException ex) {
       System.out.println("File not found");
       System.exit(1);
     }
     return count;
   }
   public static boolean testTriangle(int s1, int s2, int s3){
     return  s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1;
   }
   public static void main(String[] args){
   System.out.println(countTrianglesA("inputTri.txt"));
   System.out.println(countTrianglesB("inputTri.txt"));
 }
 }
