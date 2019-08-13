package itheima04;

import java.text.ParseException;
import java.util.Date;

/*
        案例需求

​	定义一个日期工具类(DateUtils)，包含两个方法：把日期转换为指定格式的字符串；
把字符串解析为指定格式的日期，然后定义一个测试类(DateDemo)，测试日期工具类的方法
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        //调用DatetoString方法
        String s = DateUtils.DatetoString(date, "yyyy-MM-dd HH:mm:ss");
        System.out.println(s);

        //调用StringtoDate方法
        String s1 = "12-12-12 12:00:01";
        Date date1 = DateUtils.StringtoDate(s1, "yy-MM-dd HH:mm:ss");
        System.out.println(date1);


    }
}
