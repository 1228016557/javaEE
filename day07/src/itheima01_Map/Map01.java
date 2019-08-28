package itheima01_Map;

import java.util.HashMap;
import java.util.Map;

/*
        Map集合
            Interface Map<K,V>  K:键的类型 V:值的类型
            不能包含重复的健,多态形式创建
            put();添加元素
 */
public class Map01 {
    public static void main(String[] args) {
        //多态形式创建Map对象
        Map<String,String>  map = new HashMap<>();
        //添加元素
        map.put("01","鸣人");
        map.put("02","佐助");
        map.put("03","小樱");
        //输出集合
        System.out.println(map); // {01=鸣人, 02=佐助, 03=小樱}

        //再添加一个元素,用相同键值
        map.put("03","卡卡西");
        System.out.println(map);  //{01=鸣人, 02=佐助, 03=卡卡西}
        /*
          put添加键值,如果集合中没有该元素则添加,如果有则替换
        */
    }
}
