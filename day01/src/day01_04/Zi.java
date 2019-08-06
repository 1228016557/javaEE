package day01_04;

public class Zi extends Fu {
    public int age = 30;

   public Zi(){
       System.out.println("子类无参构造方法被调用");
   }
   public Zi(int age){
       System.out.println("子类有参构造方法被调用");
   }
}
