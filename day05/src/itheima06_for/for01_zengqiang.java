package itheima06_for;

import java.util.ArrayList;
import java.util.Arrays;

/*
        增强for循环
  */
public class for01_zengqiang {
     public static void main(String[] args) {
         //创建数组
         int[] arr = {1,1,5,89,3,5};
         //增强for循环输出arr
         for (int i :arr){
             System.out.println(i);
         }
         //创建string数组
      String[] str = {"qwe","asd","zxc"};
        //增强for循环输出
         for (String s :str){
             System.out.println(s);
         }
         //创建arraylist集合
         ArrayList<String> a  = new ArrayList<>();
        //添加元素
         a.add("aaa");
         a.add("bbb");
         a.add("ccc");
         //增强for循环输出
         for (String s:a){
             System.out.println(s);
         }



     }
}
