public class Driver {
  public static void main(String[] args){
    Adventurer p1 = new Warrior("Sean",100);
    Adventurer p2 = new Warrior("William", 100);
    System.out.println(p1.toString());
    System.out.println(p2.getSpecialName());
    p1.setSpecial(20);
    System.out.println(p1.getSpecial());
    System.out.println(p2.getSpecialMax());
    System.out.println(p1.attack(p2));
    System.out.println(p2.support(p1));
    System.out.println(p2.support());
    System.out.println(p1.specialAttack(p2));


  }

}
