import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class day2A{
  public static void main(String[] args){
    try{
    File file = new File("day2Input.txt");
    Scanner input = new Scanner(file);
    String passcode = "";
    int x = 1;
    int y = 1;
    String[][] padlock = new String[][] {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
    while(input.hasNextLine()){
      String line = input.nextLine();
      for (int i = 0; i < line.length(); i++){
        if (line.substring(i, i +1).equals("U")){
          if (y > 0 ){
            y -= 1;
        }
          }
          else if (line.substring(i, i +1).equals("D")){
            if (y < 2){
              y += 1;
            }
          }
          else if (line.substring(i, i +1).equals("L")){
            if (x > 0){
              x -= 1;
            }
      }
      else if (line.substring(i, i +1).equals("R")){
        if(x < 2){
          x += 1;
        }
    }
    }

    passcode += padlock[y][x];
  }
   System.out.println(passcode);
    input.close();
  }
  catch (FileNotFoundException ex) {
       System.out.println("File not found");
       System.exit(1);
     }
  }

}
