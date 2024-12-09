public class Warrior extends Adventurer{
  private String specialName = "Rage";
  private int special, specialMax;
  public Warrior(String name){
    super(name);
  }
  public Warrior(String name, int hp){
    super(name, hp);
  }
  public String getSpecialName(){
    return specialName;
  }
  public int getSpecial(){
    return special;
  }
  public void setSpecial(int n){
    special = n;
  }
  public int getSpecialMax(){
    return specialMax;
  }
  public String attack(Adventurer other){
    other.applyDamage(10);
    System.out.println(this.getName() + " attacked " + other.getName());
  }
  public String support(Adventurer other){
    other.setHP(other.getHP() + 10);
    System.out.println(this.getName() + " healed " + other.getName());

  }
  public String support();
  public String specialAttack(Adventurer other);



}
