package itheima07_try_catch;
/*
 Throwable成员方法
 getMessage()返回此 throwable 的详细消息字符串
 toString()返回此可抛出的简短描述
  printStackTrace()把异常的错误信息输出在控制台
 */

public class  try03_Throwable{
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }
    public static void method(){
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        }
        catch (ArrayIndexOutOfBoundsException  e){
            //getMessage()返回此 throwable 的详细消息字符串
           // System.out.println(e.getMessage()); //Index 3 out of bounds for length 3
            //toString()返回此可抛出的简短描述
           // System.out.println(e.toString()); //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            //printStackTrace()把异常的错误信息输出在控制台
            e.printStackTrace();

        }
    }

}
