package itheima04;
/*
练习描述
有参有返回值抽象方法的练习(两数字之和)
 */
public class AddableDemo {
    public static void main(String[] args) {
     //匿名内部类
        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                return x+y;
            }
        });
        //lambda表达式
        useAddable((int x,int y)->{
            return x+y;
        });
        //省略格式
        useAddable((x,y)->x+y);
    }
    private static void useAddable(Addable a) {
        int result = a.add(30, 50);
        System.out.println("两数字之和:"+result);
    }
}