package itheima03_Date;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        //获取当前日期对象
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.toString());
  //获取毫秒值
        long time = date.getTime();
        System.out.println(time);

        date.setTime(0);
        System.out.println(date);
    }
}
