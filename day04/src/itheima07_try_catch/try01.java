package itheima07_try_catch;
/*
    JVM默认处理异常的方式
            1.把异常的名称,错误的原因及异常出现的位置等输出在控制台
             2.把程序停止
 */

public class try01 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }
    public static void method(){
        int[] arr = {1,2,3};
        System.out.println(arr[3]);
    }
}
/*
    JVM默认处理异常的方式
            1.把异常的名称,错误的原因及异常出现的位置等输出在控制台
             2.把程序停止
       1. java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	   at itheima07_try_catch.try01.method(try01.java:13)
	     at itheima07_try_catch.try01.main(try01.java:8)
 */