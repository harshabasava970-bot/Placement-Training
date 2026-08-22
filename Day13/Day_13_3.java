import java.util.Scanner;
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}
class Day_13_3 {
    public static void main(String[] args) {
        Student s = new Student("Charan", 19);
        s.display();
    }
}
