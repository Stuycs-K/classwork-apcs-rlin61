import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TriangleTester{
   public static int countTrianglesA(String filename){
     int count = 0;
     try {
       File file = new File(filename);
       Scanner input = new Scanner(file);
       while (input.hasNextLine()){
         input.nextLine();
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
   public static boolean testTriangle(int s1, int s2, int s3){
     return  s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1;
   }
   public static void main(String[] args){
   System.out.println(countTrianglesA("inputTri.txt"));
 }
}
