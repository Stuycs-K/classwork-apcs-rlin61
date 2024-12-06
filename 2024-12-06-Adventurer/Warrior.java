public class Warrior implements Adventurer{
  public Warrior(String name){
    super(name);
  }
  public Warrior(String name, int hp){
    super(name, hp);
  }
  public String getSpecialName(){
    return "rage";
  }
  public int getSpecial();
}
