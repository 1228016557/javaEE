package itheima_08_Math;

import java.util.Random;

/*
            public static double floor(double a)返回小于或等于参数的最大double值，等于一个整数
            public   static int round(float a)按照四舍五入返回最接近参数的int
            public static int   max(int a,int b)返回两个int值中的较大值
            public static int   abs(int a)返回参数的绝对值
            public static double ceil(double a)返回大于或等于参数的最小double值，等于一个整数
            public   static int min(int a,int b)返回两个int值中的较小值
            public   static double pow (double a,double b)返回a的b次幂的值
            public   static double random()返回值为double的正值，[0.0,1.0)
 */
public class MathDemo {
    public static void main(String[] args) {
//        public static double ceil(double a)返回大于或等于参数的最小double值，等于一个整数
        System.out.println(Math.ceil(10.2));
        System.out.println(Math.ceil(10.9));
// public static double floor(double a)返回小于或等于参数的最大double值，等于一个整数
        System.out.println(Math.floor(-12.9));
        System.out.println(Math.floor(82));
        //public   static int round(float a)按照四舍五入返回最接近参数的int
        System.out.println(Math.round(3.3));
        System.out.println(Math.round(3.8));
        //public static int   max(int a,int b)返回两个int值中的较大值
        System.out.println(Math.max(10, 30));
//        public   static int min(int a,int b)返回两个int值中的较小值
        System.out.println(Math.min(10, 33));
//        public static int   abs(int a)返回参数的绝对值
        System.out.println(Math.abs(-90));
//        public   static double pow (double a,double b)返回a的b次幂的值
        System.out.println(Math.pow(10, 2));
//        public   static double random()返回值为double的正值(随机数)，[0.0,1.0)
        System.out.println((int) (Math.random() * 100));
        Random r = new Random();


    }
}
