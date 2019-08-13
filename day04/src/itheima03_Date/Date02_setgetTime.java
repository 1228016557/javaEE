package itheima03_Date;
/*
getTime    //获取的是日期对象从1970年1月1日 0时0分0秒到现在的毫秒值
setTime  //设置时间,给的是毫秒值 */

import java.util.Date;

public class Date02_setgetTime {
    public static void main(String[] args) {

        Date d =new Date();
        //getTime    //获取的是日期对象从1970年1月1日 0时0分0秒到现在的毫秒值
        System.out.println(d);         //获取当前时间
        System.out.println(d.getTime());    //获取从时间原点到现在的时间（毫秒）
       // setTime  //设置时间,给的是毫秒值 */
        d.setTime(1000*60*60);    //设置的时间是1个小时
        System.out.println(d);   //输出时间原点后1个小时的时间
    }
}
