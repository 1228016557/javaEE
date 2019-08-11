package itheima_013_Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

/*
        Arrays的常用方法
        public static String toString(int[] a)返回指定数组的内容的字符串表示形式
        public static void sort(int[] a)按照数字顺序排列指定的数组
 */
public class Test {
    public static void main(String[] args) {
    int[] arr = {10, 20, 30, 55, 94, 22};
    // public static String toString(int[] a)返回指定数组的内容的字符串表示形式
        System.out.println(Arrays.toString(arr));

        // public static void sort(int[] a)按照数字顺序排列指定的数组
                Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
