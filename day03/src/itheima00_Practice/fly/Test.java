package itheima00_Practice.fly;

public class Test {
    public static void main(String[] args) {
        Fly f = new Brid();
        f.fly();
        method1(f);
          Fly f1 =   method2();
           f1.fly();
    }

    //接口作为参数
   public static void method1(Fly f){
        f.fly();
    }
    //方法返回值是接口
    public static Fly method2(){
        Fly f = new Brid();
        return f;
    }
}
