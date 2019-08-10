package day01_00_practice._04;
//学生类继承Person类
public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    //  重写eat方法(person是抽象类所以必须重写所有抽象方法)
    @Override
    public void java() {
        System.out.println("我是学习java的,我会java");
    }
}
