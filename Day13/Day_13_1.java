class Student {
    String name;
    int age;

    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}
class Day_13_1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Mouni";
        s.age = 21;

        s.display();
    }
}
