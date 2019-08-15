package itheima06_comparable;

import org.jetbrains.annotations.NotNull;

public class Person implements Comparable<Person> {
private String name;
private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(@NotNull Person o) {
      int num =  this.age - o.age;
    int num2 =  num == 0? this.name.compareTo(o.name):num;
      return num2;
    }
}
