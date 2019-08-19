package itheima02_digui;
/*
不推荐递归解决问题
    递归的介绍:
- 以编程的角度来看，递归指的是方法定义中调用方法本身的现象
- 把一个复杂的问题层层转化为一个与原问题相似的规模较小的问题来求解
- 递归策略只需少量的程序就可描述出解题过程所需要的多次重复计算
    案例:不死神兔
 */
public class DiGui01 {
    public static void main(String[] args) {
        //回顾不死神兔问题，求第20个月兔子的对数
        //每个月的兔子对数：1,1,2,3,5,8，...(规律:这个月的兔子数等于前两个月的和)
        int[] arr = new int[20];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[19]);  //6765
        //递归方法
         /*

        递归解决问题，首先就是要定义一个方法：
            定义一个方法f(n)：表示第n个月的兔子对数
            那么，第n-1个月的兔子对数该如何表示呢？f(n-1)
            同理，第n-2个月的兔子对数该如何表示呢？f(n-2)
        StackOverflowError:当堆栈溢出发生时抛出一个应用程序递归太深
     */
        System.out.println(f(20)); //6765

    }
//      - 递归一定要有出口。否则内存溢出
//- 递归虽然有出口，但是递归的次数也不宜过多。否则内存溢出
    public static  int f(int n){
     if (n==1||n==2) {
         return 1;
     }else {
         return f(n-1)+f(n-2);
     }
    }

}