//Interface
import java.util.Scanner;
interface Animal {
    void sound();
}

class Dog implements Animal {

    public void sound() {
        System.out.println("Dog barks");
    }
}
class Day_14_5 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
