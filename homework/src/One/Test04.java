package One;

import java.util.Date;

public class Test04 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getYear());  //119

        Date d1 = new Date();
        System.out.println(d1.toString());//Wed Aug 14 19:33:24 CST 2019

        Date d2= new Date();
        System.out.println(d2.toLocaleString()); //2019年8月14日 下午7:35:15


    }
}
