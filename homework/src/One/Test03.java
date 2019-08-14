package One;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");  //解析：mm代表分钟
        Date s = new Date(1100000111);
        String format = sdf.format(s);
        System.out.println(format);   //1970-33-14
        System.out.println(s.getTime());  //1100000111
    }
}
