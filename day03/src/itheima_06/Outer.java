package itheima_06;

public class Outer {
    private int num =10;
    public void method(){
        int num1 =20;
        class Inter{
            public void show(){
                System.out.println(num);
                System.out.println(num1);
               // System.out.println(n);报错
            }
        }
        Inter i =new Inter();
        i.show();

    }
    public void a(){
        int n =200;
    }

}
