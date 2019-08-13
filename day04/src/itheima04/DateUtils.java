package itheima04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
定义一个日期工具类(DateUtils)，包含两个方法：把日期转换为指定格式的字符串；
把字符串解析为指定格式的日期，然后定义一个测试类(DateDemo)，测试日期工具类的方法
 */
public class DateUtils {

    private DateUtils() {
    }

    //日期转换为指定格式的字符串；
    public static String DatetoString(Date date, String geshi) {
        SimpleDateFormat sdf = new SimpleDateFormat(geshi);
        String s = sdf.format(date);
        return s;
    }

    //把字符串解析为指定格式的日期
    public static Date StringtoDate(String s, String geshi) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(geshi);
        Date date = sdf.parse(s);
        return date;
    }


}
