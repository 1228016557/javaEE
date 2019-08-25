package itheima09;
//有参数有返回值
/*
练习描述
- 定义一个接口(Converter)，里面定义一个抽象方法 int convert(String s);
- 定义一个测试类(ConverterDemo)，在测试类中提供两个方法
  - 一个方法是：useConverter(Converter c)
  - 一个方法是主方法，在主方法中调用useConverter方法
 */
public class Demo {
    public static void main(String[] args) {
        //lambda表达式
        useConverter(s-> Integer.parseInt(s));//666
        //引用类方法
        useConverter(Integer::parseInt);//666
      //Lambda表达式被类方法替代的时候，它的形式参数全部传递给静态方法作为参数
    }
    private static void useConverter(Converter c){
        int number = c.convert("666");
        System.out.println(number);
    }
}
