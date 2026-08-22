import java.util.Scanner;
class Student {
    String name;
    int age;
    Student() {
        this("Unknown", 0);
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println(name + " " + age);
    }
}
class Day_13_8 {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
