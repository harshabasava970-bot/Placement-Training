import java.util.Scanner;
class Animal {

    void eat() {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}
class Day_13_10 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
