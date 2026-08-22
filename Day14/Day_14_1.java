//Encapsulation
import java.util.Scanner;
class Student {
    private String name;
    private int age;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}
class Day_14_1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Mouni");
        s.setAge(21);
        s.display();
    }
}
