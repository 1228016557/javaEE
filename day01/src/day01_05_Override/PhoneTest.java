package day01_05_Override;

//测试类
public class PhoneTest {
    public static void main(String[] args) {
        //创建对象,调用方法
        Phone p = new Phone();
        p.call("林青霞");
        System.out.println("---------");
        NewPhone n = new NewPhone();
        n.call("林青霞");
    }
}

