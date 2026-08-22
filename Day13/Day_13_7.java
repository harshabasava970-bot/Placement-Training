import java.util.Scanner;
class Student {
    String name;
    int age;
    Student(String n, int a) {
        name = n;
        age = a;
    }
    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}
class Day_13_7 {
    public static void main(String[] args) {
        Student s = new Student("Mouni", 21);
        s.display();
    }
}
