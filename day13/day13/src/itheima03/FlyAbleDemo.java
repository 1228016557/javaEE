package itheima03;
//有参无返回值抽象方法的练习
public class FlyAbleDemo {
    public static void main(String[] args) {
         //匿名内部类
        useFly(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
            }
        });
        System.out.println("-----");
        //lambda表达式
        useFly((String s) -> {
            System.out.println(s);
        });
        //省略格式
        useFly(s-> System.out.println(s));
    }
    private static void useFly(Flyable f){
      f.fly("我要飞的更高");
    }
}
