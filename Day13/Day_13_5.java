class Student {
    String name;              // Instance variable
    static String college = "KARE";  // Static variable
}
class Day_13_5 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Mouni";
        s2.name = "Charan";
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(Student.college);
    }
}
