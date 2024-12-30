
/*Create a parent class Animal with a method makeSound() that prints "Some generic sound."
Create subclasses:
Dog that overrides makeSound() to print "Woof Woof."
Cat that overrides makeSound() to print "Meow Meow."
In the Main class, use polymorphism to call makeSound() on different Animal objects. */
import java.util.*;

class Animal {

    void makesound() {
        System.out.println("Some genric Sound");
    }
}

class Dog extends Animal {

    void makesound() {
        System.out.println("Woof Woof ");
    }
}

class Cat extends Animal {

    void makesound() {
        System.out.println("Meow Meow ");
    }
}

public class Overriding2 {

    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.makesound();
        a = new Cat();
        a.makesound();
    }
}
