package day01_00_practice._04;

import day02_05_interfaceAndAbstrance.Home;

//老师类继承Person类
public class Teacher extends Person implements Html {

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    //重写eat方法
    @Override
    public void java() {
        System.out.println("老师会java");
    }

    @Override
    public void html() {
        System.out.println("老师还会前端");
    }
}
