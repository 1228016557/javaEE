package itheima00;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*V   get(Object key)根据键获取值
        Set<K>   keySet()获取所有键的集合
        Collection<V>   values()获取所有值的集合
        Set<Map.Entry<K,V>>   entrySet()获取所有键值对对象的集合*/
public class Map03 {

    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<>();
     //v put(K key,V value)将指定的值与该映射中的指定健相关联
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");

        //get(Object key)根据键获取值
        System.out.println(map.get("张无忌"));  //赵敏
        //  Set<K>   keySet()获取所有键的集合
        Set<String> keySet = map.keySet();
       //增强for输出
        for (String s : keySet) {
            System.out.println(s);   //杨过       郭靖    张无忌
        }
        // Collection<V>   values()获取所有值的集合
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);  //小龙女     黄蓉     赵敏
        }
        //  Set<Map.Entry<K,V>>   entrySet()获取所有键值对对象的集合*/
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);    //杨过=小龙女     郭靖=黄蓉    张无忌=赵敏
        }

        //输出对象
        System.out.println(map);

    }}
