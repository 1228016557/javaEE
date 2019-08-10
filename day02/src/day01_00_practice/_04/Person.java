package day01_00_practice._04;
//person类(父类)  抽象类
public abstract class Person {
    private String name;  //名字
    private int age;   //年龄

    //空参构造方法
    public Person() {
    }

    //有参构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getset方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //eat方法
    public abstract void java();

}
