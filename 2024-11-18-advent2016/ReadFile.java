//1 you need all three imports.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

  public static void main(String[] args) {
    //2 Opening a file requires a try/catch
    try {
      File file = new File("ReadFile.java");//1
      Scanner input = new Scanner(file);
      while(input.hasNextLine()){
         String line = input.nextLine();
        if (line.indexOf("{") > -1){
          System.out.println(line);
        }
      }
      /*
      while (input.hasNextLine()){
        input.nextLine();
        if(input.hasNextLine()){
        System.out.println(input.nextLine());
      }
      }
      */
      /*

      File file = new File("ReadFile.java");//1
      Scanner input = new Scanner(file);
      while (input.hasNext()){
        System.out.println(input.next());
      }
*/

      //CODE THAT SCANS THE FILE.
      input.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return; //you can return from a void function just don't put a value.
    }
  }
}
