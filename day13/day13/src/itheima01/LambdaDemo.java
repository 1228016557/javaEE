package itheima01;
//练习描述
//​	无参无返回值抽象方法的练习
public class LambdaDemo {
    public static void main(String[] args) {
        //方法一:再主方法中调用useEztable方法
      Eatable e = new EatableImpl();
      e.eat();
      //方法二:匿名内部类
      useEatable(new Eatable() {
          @Override
          public void eat() {
              System.out.println("方法二:吃饭");
          }
      });
      //方法三:Lambda表达式
        useEatable(()->{
            System.out.println("方法三:吃饭");
        });
        //省略格式:
        useEatable(()-> System.out.println("吃饭"));
    }
    private static void useEatable(Eatable e){
        e.eat();
    }
}
