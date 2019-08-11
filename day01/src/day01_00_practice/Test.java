package day01_00_practice;
/*
因为子类要使用父类的方法或数据,所以在访问子类的构造方法时,先把父类初始化
子类的每一个构造方法的第一行都有一个默认的super()
 */
public class Test {
    public static void main(String[] args) {
//        Zi z = new Zi();
//        z.show();

//        Zi z =new Zi();
        System.out.println("------");
        Zi z1 = new Zi(20);
       z1.method();

       Student s = new Student();
       z1.showone();

    }
}
