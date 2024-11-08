// In Driver.java answer: What is the difference before and after you override this method? What does this tell us about methods that are overridden?
// Before, getName() just returned name but after overriding this method, it returns "The Mighty" + super.getName().
//This tells us that the new method is the one that's used instead of the original method.
//Place a comment on the lines 4-6 of your Driver file explaining which ones didn't work and why. (How does this align with the is-A relationship expectations?)
// Bird b2 = new Animal("Boo", 11, "Syrup"); didn't work because you cannot store animal in bird as animal is not a subclass of bird.
// Bird is a subclass of animal. This aligns with the is-A relationship expectations as it fits its suggestions of x is-a y, where x is a subclass of y.
public class Driver {
  public static void main(String[] args) {
    Animal a = new Animal("Moo", 14, "Bob");
    a.speak();

    Bird b = new Bird("Squaaaak", 10, "Doug", 1.0, "Red");
    b.speak();
    Animal a1 = new Animal("Woof", 2, "Maple");
    a1.speak();
    Bird b1 = new Bird("OOF", 9191, "David", 2.0, "Green");
    b1.speak();
    //Bird b2 = new Animal("Boo", 11, "Syrup");
    Animal a2 = new Bird("Maa",23, "Henry", 4.6, "White");
    a2.speak();
  }
}
