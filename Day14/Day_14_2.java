//Getter and Setter
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

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
}
class Day_14_2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Mouni");
        s.setAge(21);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
