package day01_00_practice.StaffDemo;
/*
   员工类:
        姓名 name;
        工号:id
        基本工资:salary
        计算薪资的方法(抽象方法)
 */
public abstract class employee {
    private String name;
    private int id;
    private double salary;

    public employee() {
    }

    public employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public abstract double jisuan();
}
