package itheima01_Integer;

import java.util.Arrays;

/*
            案例需求

​	有一个字符串：“91 27 46 38 50”，请写程序实现最终输出结果是：“27 38 46 50 91”
 */
public class Integer4_Stringsort {
    public static void main(String[] args) {
        //创建一个字符串
        String  s ="91 27 46 38 50";

        //split切割字符串
        String[] arr =  s.split(" ");
//        System.out.println(Arrays.toString(arr));
        //新建一个int数组，把arr传进去
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }

        //排序
        Arrays.sort(arr1);

        //输出
        System.out.println("arr1 = " + Arrays.toString(arr1));


    }}
