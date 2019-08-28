package itheima04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 案例需求
- 创建一个HashMap集合，键是学生对象(Student)，值是居住地 (String)。存储多个元素，并遍历。
- 要求保证键的唯一性：如果学生对象的成员变量值相同，我们就认为是同一个对象
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建一个集合对象
        Map<Student,String  > map = new HashMap<>();
        //添加元素并创建学生对象(学生类重写了hashCode和equals方法)
        map.put(new Student("鸣人",26),"木叶");
        map.put(new Student("佐助",26),"漂流");
        map.put(new Student("雏田",24),"木叶");
        map.put(new Student("小樱",25),"木叶");
        map.put(new Student("佐助",26),"木叶");
        //用keyset方法
        Set<Student> keySet = map.keySet();
        //增强for
        for (Student key : keySet) {
            //get()方法获取值
            String value = map.get(key);
            System.out.println(key.getName()+" "+key.getAge()+" "+value);
            //佐助 26 木叶
            //雏田 24 木叶
            //小樱 25 木叶
            //鸣人 26 木叶
        }


    }
}
