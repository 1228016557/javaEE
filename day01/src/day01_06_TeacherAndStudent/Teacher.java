package day01_06_TeacherAndStudent;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach(){
        System.out.println("用爱成就每一个学员");
    }

}
