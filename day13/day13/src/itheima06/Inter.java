package itheima06;

public interface Inter {
    //抽象方法
    void show();
    //默认方法
    default void method(){
        System.out.println("Inter中的默认方法执行了");
    }
    //静态方法
  static   void test(){
        System.out.println("Inter中的静态方法执行了");
    }
}
