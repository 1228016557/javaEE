package itheima06;
//接口中的静态方法
public class Demo {
    public static void main(String[] args) {
        Inter in =new Interipl();
        in.show();//show方法执行了
        in.method(); //Inter中的默认方法执行了
//        in.test();   //编译报错,静态方法只能通过接口名调用，不能通过实现类名或者对象名调用
        Inter.test(); //Inter中的静态方法执行了
    }
}
