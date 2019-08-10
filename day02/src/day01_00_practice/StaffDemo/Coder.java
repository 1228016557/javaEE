package day01_00_practice.StaffDemo;
/*
   程序员类
        项目奖金:projectBonus
 */
public class Coder extends employee {
    private double projectBonus;


    @Override
    public double jisuan() {
        double money = projectBonus+getSalary();
        return money;
    }
}
