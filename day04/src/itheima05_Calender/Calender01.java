package itheima05_Calender;

import java.util.Calendar;

/*
Calendar 为特定瞬间与一组日历字段之间的转换提供了一些方法，并为操作日历字段提供了一些方法
​	Calendar 提供了一个类方法 getInstance 用于获取这种类型的一般有用的对象。
​	该方法返回一个Calendar 对象

   public int   get(int field)返回给定日历字段的值
   public abstract void add(int   field, int amount)根据日历的规则，将指定的时间量添加或减去给定的日历字段
   public final void set(int year,int month,int date)设置当前日历的年月日
*/


public class Calender01 {
    public static void main(String[] args) {
        //获取日期对象
        Calendar c = Calendar.getInstance(); //多态
        System.out.println(c);  //输出calender的各种属性

        //用add方法改变时间
          c.add(Calendar.YEAR,1);  //1表示一年后，负数表示年前
        //用get方法获取数据
        int year = c.get(Calendar.YEAR); //年
        int month = c.get(Calendar.MONTH)+1;//月    月份用0-11表示1-12，所以要加一
         int day = c.get(Calendar.DATE);  //日
        System.out.println(year+"年"+month+"月"+day);


        //用set方法来设置时间
        c.set(2048,1,1);
        int year1 = c.get(Calendar.YEAR); //年
        int month1 = c.get(Calendar.MONTH);//月    月份用0-11表示1-12，所以要加一
        int day1 = c.get(Calendar.DATE);  //日
        System.out.println(year1+"年"+month1+"月"+day1);
    }
}
