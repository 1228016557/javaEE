package day01_06_TeacherAndStudent;
/*
测试类
 */
public class PersonTest {
    public static void main(String[] args) {
      //创建老师类对象并进行测试
      Teacher t1 = new Teacher();
        t1.setName("林青霞");
        t1.setAge(20);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();

        //有参构造方法创建老师类对象
        Teacher t2 = new Teacher("风清扬",33);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();


        //1.无参构造学生对象
        Student s1 = new Student();
        s1.setName("塔兹米");
        s1.setAge(18);
        System.out.println(s1.getName()+","+ s1.getAge());
        s1.study();

        //2.有参构造方法
        Student s2 = new Student("红瞳",22);
        System.out.println(s2.getName()+","+s2.getAge());
        s2.study();
    }
}
