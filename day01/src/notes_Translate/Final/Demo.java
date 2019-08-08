package notes_Translate.Final;
/*
    1.final修饰引用类型地址值不能改变 但是成员变量的值可以改变
        2.final修饰成员变量 成员变量不能使用默认值 必须在创建对象之前赋值
                          直接赋值
                          构造方法中赋值
 */
public class Demo {
    public static void main(String[] args) {
       final int age = 100;
             //age=10;  报错
        System.out.println("age = " + age);

        final Sutdent s = new Sutdent();
         s.age=50;  //final修饰的s是地址值
    }

}
