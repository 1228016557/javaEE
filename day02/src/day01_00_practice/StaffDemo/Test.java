package day01_00_practice.StaffDemo;
/*
 测试类
 */
public class Test {
    public static void main(String[] args) {
        Company c = new Company();  //创建公司对象
        c.setCompanyName("哪都通公司"); //设置公司名称
        Manager m = new Manager(); //创建项目经理类加入show方法
        m.setName("徐三"); //设置经理名称
        m.setId(123);  //设置工号
        m.setSalary(50000);  //工资
        c.show(m);   //调用查看工资方法
        //创建程序员类
        Coder c1 = new Coder();
        c1.setName("宝儿姐");
        c1.setId(111);
        c1.setSalary(100000);
        c.show(c1);


    }
    }




