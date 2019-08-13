package itheima03_Date;

import java.util.Date;

/*
    public Date()分配一个 Date对象，并初始化，以便它代表它被分配的时间，精确到毫秒
    public Date(long date)分配一个 Date对象，并将其初始化为表示从标准基准时间起指定的毫秒数
    时间原点：1970-01-01   00：00：00
 */
public class Date01_gouzaofangfa {
    public static void main(String[] args) {
        //public Date()分配一个 Date对象，并初始化，以便它代表它被分配的时间，精确到毫秒
        Date d1 = new Date();
        System.out.println(d1);   //Date重写了toString方法，输出当前时间

        //           public Date(long date)分配一个 Date对象，并将其初始化为表示从标准基准时间起指定的毫秒数
        long date = 1000 * 60 * 60;  //1000毫秒*60*60=1小时
        Date d2 = new Date(date);
        System.out.println(d2);  //中国在东八区，所以时间比原点时间多8小时，在加一小时是9小时


    }
}
