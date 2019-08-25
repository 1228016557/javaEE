package itheima07;

public class InterDemo {
    public static void main(String[] args) {
        Inter in = new Interimpl();
        in.show1();
        in.show2();
        //调用inter中的静态方法
        Inter.method1();
        Inter.method2();
    }
}
