//abstract method
import java.util.Scanner;
abstract class Shape {

    abstract void draw();
}

class Circle extends Shape {

    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Day_14_4 {

    public static void main(String[] args) {

        Circle c = new Circle();

        c.draw();
    }
}
