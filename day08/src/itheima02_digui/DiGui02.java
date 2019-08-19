package itheima02_digui;

import java.util.Scanner;

//	用递归求5的阶乘，并把结果在控制台输出
public class DiGui02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int i = sc.nextInt();
        //调用方法
        jiecheng(5);
        System.out.println(i+"的阶乘是:"+jiecheng(i));
    }
    public static  int jiecheng(int n){
       if (n ==1){
           return 1;
       }else{
           return n*jiecheng(n-1);
       }
    }
}
