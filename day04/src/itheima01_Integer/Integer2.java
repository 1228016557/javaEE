package itheima01_Integer;
/*
            public static Integer valueOf(int i)返回表示指定的 int 值的 Integer   实例
            public static Integer valueOf(String s)返回一个保存指定值的 Integer 对象 String
 */
public class Integer2 {
    public static void main(String[] args) {
        //public static Integer valueOf(int i)返回表示指定的 int 值的 Integer   实例
        Integer integer = Integer.valueOf(100);
        System.out.println(integer);
        //      public static Integer valueOf(String s)返回一个保存指定值的 Integer 对象 String
        Integer integer1 = Integer.valueOf("1230");
        System.out.println(integer1);
    }
}
