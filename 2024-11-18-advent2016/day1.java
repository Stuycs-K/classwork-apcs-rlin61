import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class day1{
  public static void main(String[] args){
    try {
      File file = new File("input.txt");
      Scanner input = new Scanner(file);
      while(input.hasNextLine()){
        String[] line = input.nextLine().split(", ");
        int direction = 0;
        int x = 0;
        int y = 0;
        ArrayList<String>location = new ArrayList<>();
        for (int i = 0; i < line.length; i++){
          if (line[i].contains("R")){
            direction = (direction + 1) % 4;
          }
          else if (line[i].contains("L")){
            direction = (direction + 3) % 4;

          }
           int distance = Integer.parseInt(line[i].substring(1));
           for (int j = 0; j < distance; j++) {
              if (direction == 0) {
                y++;
              }
              else if (direction == 1) {
                  x++;
                    }
              else if (direction == 2) {
                  y--;
                  }
              else if (direction == 3){
                  x--;
                }
        String place = x + ", " +y;
        if (location.contains(place)){
          System.out.println(Math.abs(x) + Math.abs(y));
          return;
        }
        location.add(place);
          }
        }
        System.out.println(Math.abs(x) + Math.abs(y));
      }
      input.close();

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      System.exit(1);
    }
}
  }
