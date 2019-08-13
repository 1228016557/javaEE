package itheima02;

import java.util.Arrays;

/*
        案例需求
​ 有一个字符串：“91 27 46 38 50”，请写程序实现最终输出结果是：“27 38 46 50 91”

 */
public class Test_StringSort {
    public static void main(String[] args) {
        //1.创建字符串
        String s = "91 27 46 38 50";

        //2.把字符串中的数字数据存储到一个int类型的数组中
        String[] s1 = s.split(" ");
        //3.定义一个int数组，把 String[] 数组中的每一个元素存储到 int 数组中
        int[] arr = new  int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            arr[i] = Integer.parseInt(s1[i]);
        }
        //排序
        Arrays.sort(arr);

        //拼接成一个字符串类型
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                s2.append(arr[i]);
            }
            else{
                s2.append(arr[i]+" ");
            }
        }

        System.out.println(s2);
    }
}
