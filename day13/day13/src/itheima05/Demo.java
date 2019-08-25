package itheima05;
//接口中的默认方法
public class Demo {
    public static void main(String[] args) {
        MyInterface my = new Myinterfaceimp();
        my.show1(); //show1
        my.show2();//show2
        my.show3();//show3
        System.out.println("--------");
        Myinterfaceimp my1 =new Myinterfaceimp();
        my1.show1();//show1
        my1.show2();//show2
        my1.show3();//show3
    }

}
