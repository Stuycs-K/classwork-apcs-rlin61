import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class day2{
  public static void main(String[] args){
    try{
    File file = new File("day2Input.txt");
    Scanner input = new Scanner(file);
    String passcode = "";
    int x = 0;
    int y = 2;
    String[][] padlock = new String[][] {
      {null, null, "1", null, null},
       {null, "2", "3", "4", null},
        {"5", "6", "7", "8", "9"},
        {null, "A", "B", "C", null},
        {null, null, "D", null, null}
    };
    while(input.hasNextLine()){
      String line = input.nextLine();
      for (int i = 0; i < line.length(); i++){
        if (line.substring(i, i +1).equals("U")){
          if (y > 0 && padlock[y - 1][x] != null){
            y -= 1;
        }
          }
          else if (line.substring(i, i +1).equals("D")){
            if (y < 4 && padlock[y + 1][x] != null){
              y += 1;
            }
          }
          else if (line.substring(i, i +1).equals("L")){
            if (x > 0 && padlock[y][x - 1] != null){
              x -= 1;
            }
      }
      else if (line.substring(i, i +1).equals("R")){
        if(x < 4 && padlock[y][x + 1] != null){
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
