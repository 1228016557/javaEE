package itheima_03;
//测试类
public class Test {
    public static void main(String[] args) {
        //方法的形参是接口名,其实需要的是该接口的实现类对象
        UseCat u = new UseCat();
        jump j = new Cat();
        u.usecat(j);
//方法的返回值是接口名,则返回的是该接口的实现类对象
        jump j1 = u.getcat();
        j1.jump();
    }
}
