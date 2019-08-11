package itheima_04;

import javax.print.attribute.standard.NumberOfInterveningJobs;

/*
         内部类可以直接访问外部的成员,包括私有

​		外部类要访问内部类的成员,必须创建对象
 */
public class OuterClass {
    private int num = 100;

    //创建内部类
    public class InterClass {
        //创建方法访问num
        public void show() {
            System.out.println(num);
        }
    }
    //外部类要访问内部类的成员,必须创建对象
    public void method(){
        InterClass i = new InterClass();
        i.show();
    }

}
