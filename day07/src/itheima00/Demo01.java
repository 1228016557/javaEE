package itheima00;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
        案例需求
- 键盘录入一个字符串，要求统计字符串中每个字符串出现的次数。
- 举例：键盘录入“aababcabcdabcde”  在控制台输出：“a(5)b(4)c(3)d(2)e(1)”
 */
public class Demo01 {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();

        //创建一个Map集合用来存储字符和次数
        Map<Character,Integer> mp = new HashMap<>();

        //将字符串转为字符数组
        char[] keys= line.toCharArray();

        //遍历数组
        for (int i = 0; i <keys.length ; i++) {
            //以此获取每个字符
            char key = keys[i];
            //判断是否已经存入,如果已经存在value+1
            if (mp.containsKey(key)){
                Integer value = mp.get(key);
                mp.put(key,value+1);  //输出key和value+1
            }
            //否则直接放入key,value为1
            else {
                mp.put(key,1);
            }
        }
    //输出
        System.out.println(mp);
    }
}
