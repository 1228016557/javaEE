package day01_00_practice._01;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public  void study(){
        System.out.println("讲课");
    }
}
