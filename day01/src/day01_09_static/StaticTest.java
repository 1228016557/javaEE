package day01_09_static;

public class StaticTest   {
    public static void main(String[] args) {
        Student.university = "传智大学";
        Student s1 = new Student();
        s1.name = "塔兹米";
        s1.age = 18 ;
        s1.show();
        Student s2 = new Student();
        s2.name="红瞳";
        s2.age = 20;
        s2.show();
    }
}
