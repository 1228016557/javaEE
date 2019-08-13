package itheima06;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
        案例需求：
        	获取任意一年的二月有多少天
 */
public class eryuetian {
    public static void main(String[] args) {
        //键盘录入年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        int date = sc.nextInt();

        //获取日历（3月1日，在二月的后面一天）
        Calendar c = Calendar.getInstance();
        c.set(date, 2, 1);

        //往前推一天
        c.add(Calendar.DATE, -1);

        //现在是2月的最后一天，获取天数
        int i = c.get(Calendar.DATE);
        //输出天数
        System.out.println(i);


    }
}
