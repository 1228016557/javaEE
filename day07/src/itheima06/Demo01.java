package itheima06;

import java.util.*;

/*
    案例需求

- 键盘录入一个字符串，要求统计字符串中每个字符串出现的次数。
- 举例：键盘录入“aababcabcdabcde”  在控制台输出：“a(5)b(4)c(3)d(2)e(1)”
    //键盘录入
    //把字符串转换为数组
    //创建hashMap集合记录字符和次数(并且判断集合中是否已经有该元素)
    //输出

 */
public class Demo01 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();
        //创建集合
        HashMap<Character,Integer> map = new HashMap<>();
        //把字符串转换为数组 toCharArray()方法
        char[] chars = line.toCharArray();
        //创建stringbuider
        StringBuilder sb = new StringBuilder();
        //for循环遍历
        for (int i = 0; i < chars.length; i++) {
             //获取键值
            char key = chars[i];
            //获取值
            Integer  valueone = map.get(key);
            //判断集合中是否已经有该元素
            if (valueone==null){
                map.put(key,1);
            }else {
                valueone++;
                map.put(key,valueone);
            }
          //  sb.append(key).append("(").append(valueone).append(")");
        }
     //   System.out.println(map.toString());
        //键值集合
        Set<Character> keySet =map.keySet();
        //for遍历
        for(Character key : keySet) {
            Integer value = map.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        //输出字符串
        String result = sb.toString();
        System.out.println(result);


    }
}
