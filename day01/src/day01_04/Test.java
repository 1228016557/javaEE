package day01_04;

//测试类
public class Test {
    public static void main(String[] args) {
     //子类无参方法构造
        Zi z = new Zi();
        //子类有参方法构造
        Zi z2 = new Zi(20);

        /*
        为什么子类中所有的构造方法都会默认访问父类中的无参构造方法
        因为子类会继承父类的数据,可能还会使用父类的数据.所以子类初始化之前,必须先完成父类的初始化
         每一个子类构造方法的第一条语句默认都是:super()
         */
    }
}
