package itheima02_bianli;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Map遍历方式二
public class bianli02 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String>  map = new HashMap<>();
        //添加元素
        map.put("01","鸣人");
        map.put("02","佐助");
        map.put("03","小樱");
        map.put("04","雏田");
       //用entry()方法获取集合对象
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //增强for遍历
        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" "+value);
             //01 鸣人
            //02 佐助
            //03 小樱
            //04 雏田
        }

    }
}
