package itheima05_qiantao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//ArrayList嵌套HashMap
/*案例需求
- 创建一个ArrayList集合，存储三个元素，每一个元素都是HashMap
- 每一个HashMap的键和值都是String，并遍历。*/
public class qiantao01 {
    public static void main(String[] args) {
        //创建arraylist集合
        ArrayList<HashMap<String,String>> list = new ArrayList<>();
        //创建三个hashMap集合
        Map<String,String> map1 = new HashMap<>();
        map1.put("01","鸣人");
        map1.put("02","佐助");
        map1.put("03","小樱");
        list.add((HashMap<String, String>) map1);

        Map<String,String> map2 = new HashMap<>();
        map2.put("01","鹿丸");
        map2.put("02","丁次");
        map2.put("03","井野");
        list.add((HashMap<String, String>) map2);

        Map<String,String> map3 = new HashMap<>();
        map3.put("01","小李");
        map3.put("02","宁次");
        map3.put("03","天天");
        list.add((HashMap<String, String>) map3);


        //增强for
        for (HashMap<String, String> map : list) {
            //用entrySet方法获取所有键值和值
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            //增强for
            for (Map.Entry<String, String> entry : entrySet) {
                //获取键值
                String key = entry.getKey();
               //获取值
                String value = entry.getValue();
                System.out.println(key+" "+value);
            }

        }
    }
}
