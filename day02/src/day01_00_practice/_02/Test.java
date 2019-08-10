package day01_00_practice._02;

import javax.lang.model.element.AnnotationMirror;

public class Test {
    public static void main(String[] args) {
        UseAnimal a =new UseAnimal();
        Cat c =new Cat();
        a.athomeeat(c);
        //a.show();  报错,不能访问子类的特有类
        Dog d =new Dog();
        a.athomeeat(d);
    }
}
