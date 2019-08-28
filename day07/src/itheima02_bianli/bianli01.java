package itheima02_bianli;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Map遍历方式一
public class bianli01 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String>  map = new HashMap<>();
        //添加元素
        map.put("01","鸣人");
        map.put("02","佐助");
        map.put("03","小樱");
        map.put("04","雏田");
        //用keySet方法获取所有键值
        Set<String> keySet = map.keySet();
        //增强for循环
        for (String id : keySet) {
            //用get方法获取
            String value = map.get(id);
            System.out.println(id+" "+value);
            //01 鸣人
            //02 佐助
            //03 小樱
            //04 雏田
        }
    }
}
