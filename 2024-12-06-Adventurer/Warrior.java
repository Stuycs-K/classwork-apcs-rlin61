public class Warrior extends Adventurer{
  private String specialName = "Rage";
  private int special = 100;
  private int specialMax = 100;
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
    return this.getName() + " attacked " + other.getName();
  }
  public String support(Adventurer other){
    other.setHP(other.getHP() + 10);
    return this.getName() + " healed " + other.getName();

  }
  public String support(){
    this.setHP(this.getHP() + 10);
    return this.getName() + " healed " + this.getName();
  }
  public String specialAttack(Adventurer other){
    this.setSpecial(this.getSpecial() - 10);
    other.applyDamage(20);
    return this.getName() + " used special attack against " + other.getName();
  }
}
