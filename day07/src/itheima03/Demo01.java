package itheima03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    案例需求
​	创建一个HashMap集合，键是学号(String)，值是学生对象(Student)。存储三个键值对元素，并遍历
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建一个集合对象
        Map<String ,Student> map = new HashMap<>();
        //添加元素并创建学生对象
        map.put("001",new Student("鸣人",26));
        map.put("002",new Student("佐助",26));
        map.put("003",new Student("雏田",24));
        map.put("004",new Student("小樱",25));
        //用keySet获取所有键值
        Set<String> keySet = map.keySet();
        //增强for遍历
        for (String key : keySet) {
            Student student = map.get(key);
            System.out.println(key+" "+student.getName()+" "+student.getAge());
            //001 鸣人 26
            //002 佐助 26
            //003 雏田 24
            //004 小樱 25
        }
        System.out.println("-------------");
        //方式二,使用entrySet方法获取键值和值
        Set<Map.Entry<String, Student>> entrySet = map.entrySet();
        //增强for
        for (Map.Entry<String, Student> entry : entrySet) {
            String key = entry.getKey();
            Student value = entry.getValue();
            System.out.println(key+" "+value.getName()+" "+value.getAge());
            //001 鸣人 26
            //002 佐助 26
            //003 雏田 24
            //004 小樱 25
        }
    }
}
