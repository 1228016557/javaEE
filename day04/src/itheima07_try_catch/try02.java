package itheima07_try_catch;
/*
  3.3try-catch方式处理异常
  执行流程
程序从try里面的代码开始执行
出现异常,就会跳转到对应的catch里面取执行
执行完成后,程序还可以继续往下执行
 */

public class try02 {
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
            System.out.println("你访问的数组索引越界了");
        }
    }

}
