package itheima01_Integer;
/*
       int 和String 之间的相互转换
 */
public class Integer3_zhuanhuan {
    public static void main(String[] args) {
          int num = 100;
          String s ="123";
          //int --->String
        //方法一
        String d1 = ""+num;
        //方法二
        String d2 = String.valueOf(num);

        //String ---->  int
        //方法一
        //String -->Integer ---->int
        Integer d3 = Integer.valueOf(s);
        int x = d3.intValue();
        //方法二
     int d4 = Integer.parseInt(s);

    }
}
