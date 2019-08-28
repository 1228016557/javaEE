package itheima00;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Map嵌套map
public class bianli03_qiantao03 {
    public static void main(String[] args) {
        //创建第一个元素
        Map<Integer ,String> mp1 = new HashMap<>();
        mp1.put(1,"张三");
        mp1.put(2,"李四");
         //创建第二个元素
        Map<Integer ,String> mp2 = new HashMap<>();
        mp2.put(1,"王二");
        mp2.put(2,"麻子");
        //创建第三个元素
        Map<Integer ,String> mp3 = new HashMap<>();
        mp3.put(1,"王五");
        mp3.put(2,"老王");
        //创建Mp1集合存储元素
        Map<Integer,Map<Integer,String>> Mp1 = new HashMap<>();
        Mp1.put(01,mp1);
        Mp1.put(02,mp2);
        Mp1.put(03,mp3);

        //用keyset方法获取Mp1中的所有键值
        Set<Integer> KeySet = Mp1.keySet();
        //增强for
        for (Integer int1 : KeySet) {
            System.out.println(int1);
            //获取mp1
            Map<Integer, String> Mzhi = Mp1.get(int1);
         //   System.out.println(int1+" "+Mzhi);
            Set<Integer> keySet = Mzhi.keySet();
            for (Integer mjian : keySet) {
                String mzhi = Mzhi.get(mjian);
                System.out.println(mjian+" "+mzhi);
            }

        }
    }
}
