class Student {
    public String name = "Charan";
    private int age = 19;
    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}
class Day_13_4 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        s.display();
    }
}
