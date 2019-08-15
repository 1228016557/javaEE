package itheima08_Demo;

public class Student {
private String name;
private int china;
private int math;


    public Student() {
    }


    public Student(String name, int china, int math) {
        this.name = name;
        this.china = china;
        this.math = math;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChina() {
        return china;
    }

    public void setChina(int china) {
        this.china = china;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getSum(){
       return getChina()+getMath();
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", china=" + china +
                ", math=" + math;
    }
}
