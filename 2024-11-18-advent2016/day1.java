import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class day1{
  public static void main(String[] args){
    try {
      File file = new File("input.txt");
      Scanner input = new Scanner(file);
      input.close();

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return;
    }

  }
}
