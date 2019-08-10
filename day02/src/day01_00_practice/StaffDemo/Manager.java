package day01_00_practice.StaffDemo;
/*
   经理类:
        管理奖金: managementBonus
 */
public class Manager extends employee {
    private double managementBonus;

    public Manager() {
    }

    public Manager(double managementBonus) {
        this.managementBonus = managementBonus;
    }

    public Manager(String name, int id, double salary, double managementBonus) {
        super(name, id, salary);
        this.managementBonus = managementBonus;
    }

    @Override
    public double jisuan() {
        double money = managementBonus+getSalary();
        return money;
    }
}
