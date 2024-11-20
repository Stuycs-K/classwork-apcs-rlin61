import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class day2{
  public static void main(String[] args){
    try{
    File file = new File("day2Input.txt");
    Scanner input = new Scanner(file);
    String passcode = "";
    while(input.hasNextLine()){
      passcode += code(input.nextLine());
    }
    System.out.println(passcode);
    input.close();
  }
  catch (FileNotFoundException ex) {
       System.out.println("File not found");
       System.exit(1);
     }
  }
  public static String code(String input){
    String[][] padlock = new String[][] {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

  }
}
