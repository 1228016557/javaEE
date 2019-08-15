package itheima02_HashSet;

/*
哈希值:是JDK根据对象的地址或者字符串或者数字算出来的int类型的数值
Object类中的public int hashCode()：返回对象的哈希码
 */
public class HashCode {
    public static void main(String[] args) {
     //字符串重写了HasCode方法，两个字符串的HashCode是在比较什么呢？
        String s = "张三";   //774889
        System.out.println(s.hashCode());
        String s1="李四";   //842061
        System.out.println(s1.hashCode());
        System.out.println("------------");
        System.out.println("重地".hashCode());   //1179395
        System.out.println("通话".hashCode());   ///1179395

       // 得出一个结论:如果两个字符串的哈希值不同,说明两个字符串一定不同;但是两个字符串不同,哈希值不一定不同
    }
}
