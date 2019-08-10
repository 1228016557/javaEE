package day01_00_practice._04;
/*
    Student 会java
    Teacher  前后端都会
  创建一个Person类,把老师学生类的共有代码放进去
  创建一个接口,写老师特有的功能
 创建一个操作类Use
 */
public class Test {
    public static void main(String[] args) {


    //创建一个操作类的对象
    Use u = new Use();


    //多态创建Teacher类
        Teacher t = new Teacher();

        //创建studentone类
     Studentone h = new Studentone();

    //多态创建student类
   Student s1 = new Student();
    //调用操作类的java方法,看谁会java
      u.java(s1);
      u.java(t);
     // u.java(h);   会报错,因为studentone没有继承person类

        //调用html方法,看谁会html
        u.html(h);
        u.html(t);
        //u.html(s1); 报错





}
  }