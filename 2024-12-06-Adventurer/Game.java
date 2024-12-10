import java.util.Scanner;
public class Game{
  public static void main(String[] args){
      Scanner userInput = new Scanner(System.in);
    Adventurer player = new Warrior("Bob", 100);
    Adventurer enemy = new CodeWarrior("David", 100);

    while(true){
      System.out.println(player.getName() + ", " + player.getHP() + "/" + player.getmaxHP() + " HP, " + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName());
      System.out.println(enemy.getName() + ", " + enemy.getHP() + "/" + enemy.getmaxHP() + " HP, " + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName());
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String input = userInput.nextLine();
      while(!input.equals("a") && !input.equals("attack")
        && !input.equals("sp")&& !input.equals("special")
        && !input.equals("su") && !input.equals("support")
        && !input.equals("quit")){
        System.out.println("Invalid response. Please input a valid response: ");
        input = userInput.nextLine();
      }
      if (input.equals("quit")){
        System.out.println("User quit");
        return;
      }
      else if (input.equals("a") ||input.equals("attack") ){
        System.out.println(player.attack(enemy));
      }
      else if (input.equals("sp") ||input.equals("special") ){
        System.out.println(player.specialAttack(enemy));
      }
      else if (input.equals("su") ||input.equals("support") ){
        System.out.println(player.support());
      }
      if (enemy.getHP() > 0){
        int choice = (int) Math.random() * 3;
        if (choice == 0 ){
          System.out.println(enemy.attack(player));
        }
        else if (choice == 1){
          System.out.println(enemy.specialAttack(player));
        }
        else if (choice == 2){
          System.out.println(enemy.support());
        }
      }
      if (player.getHP() <= 0){
        System.out.println(enemy.getName() + " wins!");
        return;
      }
      if (enemy.getHP() <= 0){
        System.out.println(player.getName() + " wins!");
        return;
      }
  }

}
}
