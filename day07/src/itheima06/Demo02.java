package itheima06;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
    案例需求

- 键盘录入一个字符串，要求统计字符串中每个字符串出现的次数。
- 举例：键盘录入“aababcabcdabcde”  在控制台输出：“a(5)b(4)c(3)d(2)e(1)”
    //键盘录入
    //把字符串转换为数组
    //创建hashMap集合记录字符和次数(并且判断集合中是否已经有该元素)
    //输出

 */
public class Demo02 {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sc  =new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();
        //创建集合
        HashMap<Character,Integer> map =new HashMap<>();
        //把字符串转换为字符
        for (int i=0;i<line.length();i++){
            //获取所有的键值
            char key = line.charAt(i);
            //获取值
            Integer value = map.get(key);
         //判断如果value为空,则说明该字母还没有加入map集合中
           if (value==null){
               map.put(key,1);
           }else {
               value++;
               map.put(key,value);
           }
        }
        //遍历map集合,并按要求拼接字符串
        StringBuilder str = new StringBuilder();
        //获取所有键值
        Set<Character> keySet = map.keySet();
        for (Character key : keySet) {
            Integer value = map.get(key);
          //拼接字符串
            str.append(key).append("(").append(value).append(")");
        }


        System.out.println(str.toString());



    }}
