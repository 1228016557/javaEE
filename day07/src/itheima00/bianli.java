package itheima00;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//遍历练习
public class bianli {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        //添加元素
        map.put(1,"s");
        map.put(3,"d");
        map.put(4,"h");
     //调用entrySet方法
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        //增强for
        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }
        System.out.println(entries);
    }
}
