package One;
/*
        判断String类型和toString类型是否重写了toString
 */
public class Test01 {
    public static void main(String[] args) {
        //判断String类型是否重写了toString
        String s1 = new String("asd");
        String s2 = new String("asd");
        boolean  flag1 = s1.equals(s2);
        System.out.println(flag1);   //true  比较的是内容，所以重写了toString

        //判断StringBuilder是否重写了toString方法
        StringBuilder s3 = new StringBuilder("asd");
        StringBuilder s4 = new StringBuilder("asd");
        boolean  flag2 = s3.equals(s4);
        System.out.println(flag2);  //false  比较的是地址值，所以没有重写

    }
}
