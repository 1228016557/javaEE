package itheima010;
//测试类
public class Test01 {
    public static void main(String[] args) {
        //创建对象，确定泛型T类型为string
        fanxing01<String> f = new fanxing01<>();
          f.setName("sss");
        System.out.println(f.getName());

         //调用方法确定泛型类型
        f.method("asd");
        f.method(123);
        f.method(true);
        f.method(12.3);

        fanxing02 f2 = new fanxing02();
        f2.method("sd");
    }
}
