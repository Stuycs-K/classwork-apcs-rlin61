import java.util.Scanner;
public class Game{
  public static void main(String[] args){
      Scanner userInput = new Scanner(System.in);
    Adventurer player = new Warrior("Bob", 100);
    Adventurer enemy = new CodeWarrior("David", 100);

    while(true){
      System.out.println(player.getName() + ", " + player.getHP() + "/" + player.getMaxHP() + " HP, " + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName());
      System.out.println(enemy.getName() + ", " + enemy.getHP() + "/" + enemy.getMaxHP() + " HP, " + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName());
      System.out.println("Type: (a)ttack / (sp)ecial / (s1) support / (s2) support / quit")
  }
  }

}
