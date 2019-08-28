package itheima01_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
        Map的获取功能:  get(key)  根据键值获取值
                        keySet()  获取所有键值的集合
                        values()    获取所有值的集合
                        entrySet() 获取所有键值对对象的集合
  */
public class Map03 {
    public static void main(String[] args) {
        //创建集合对象
        Map<Integer,String> map = new HashMap<>();
        //添加元素
        map.put(001,"鸣人");
        map.put(002,"佐助");
        map.put(003,"小樱");
        map.put(004,"雏田");
//        get(key)  根据键值获取值
        System.out.println(map.get(001)); //鸣人
        System.out.println(map.get(004)); //雏田
//        keySet()  获取所有键值的集合
        Set<Integer> keySet = map.keySet();
        System.out.println(keySet);  //[1, 2, 3, 4]
//        values()    获取所有值的集合
        Collection<String> values = map.values();
        System.out.println(values);   //[鸣人, 佐助, 小樱, 雏田]
//        entrySet() 获取所有键值对对象的集合
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        System.out.println(entrySet); //[1=鸣人, 2=佐助, 3=小樱, 4=雏田]
    }
}
