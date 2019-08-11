package itheima00_Practice.Jubuneibulei;

public class Outer
{
  private    String name ="我是外部的成员变量";

  private  class  inner{
      public  void show(){
          int num = 10;
          System.out.println(num);
          System.out.println(name);
      }

  }

  public void method(){
      inner  i =new inner();
      i.show();
  }

}
