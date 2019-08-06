package day01_01_extends;
/*
测试类
 */
public class Test {
    public static void main(String[] args) {
        //创建对象,调用方法
        Fu f =new Fu();
        f.show();
/*
- 子类可以有父类的内容
- 子类还可以有自己特有的内容
 */
        Zi z =new Zi();
        z.method();
        z.show();
    }

}
