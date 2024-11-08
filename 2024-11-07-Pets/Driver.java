// In Driver.java answer: What is the difference before and after you override this method? What does this tell us about methods that are overridden?
// Before, getName() just returned name but after overriding this method, it returns "The Mighty" + super.getName().
//This tells us that the new method is the one that's used instead of the original method.
public class Driver {
  public static void main(String[] args) {
    Animal a1 = new Animal("Moo", 14, "Bob");
    a1.speak();

    Bird b1 = new Bird("Squaaaak", 10, "Doug", 1.0, "Red");
    b1.speak();
  }
}
