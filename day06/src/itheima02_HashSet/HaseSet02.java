package itheima02_HashSet;

import java.util.HashSet;

/*
    HashSet如何来保证元素唯一
                通过判断添加严肃的hashcode方法和equals方法来保证元素的唯一性
                        先比较两个元素的hashcode
                            如果hashcode不同 则添加集合
                            如果hashcode相同 继续判断equals
                            不同则添加，相同不添加
 */
public class HaseSet02 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("bcd");
        set.add("abc");
        set.add("重地");
        set.add("通话");

        System.out.println(set); //[bcd, 重地, 通话, abc]
        System.out.println("abc".hashCode());  //96354
        System.out.println("bcd".hashCode());  //97347

        System.out.println("重地".hashCode()); //1179395
        System.out.println("通话".hashCode()); //1179395
    }
}
