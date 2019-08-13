package itheima03_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
            SimpleDateFormat是一个具体的类，用于以区域设置敏感的方式格式化和解析日期。
            public final String format(Date date)：将日期格式化成日期/时间字符串
            public Date parse(String source)：从给定字符串的开始解析文本以生成日期
 */
public class Date03_SimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");//用于以区域设置敏感的方式格式化和解析日期
        //  public final String format(Date date)：将日期格式化成日期/时间字符串
        String s = sdf1.format(date);
        System.out.println(date);
        System.out.println(s);

        //public Date parse(String source)：从给定字符串的开始解析文本以生成日期
        String  s2 = "2020-10-01  12:00:00";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date  date2 = sdf2.parse(s2);
        System.out.println(date2);

    }

}
