package itheima12;

public class StudentDemo {
    public static void main(String[] args) {
        //lambda表达式
        useStudentBuilder((name,age)->new Student(name,age));
        //引用构造器
        useStudentBuilder(Student::new);
    }
    public static void useStudentBuilder(StudentBuilder s){
        Student s1 = s.builder("林青霞", 30);
        System.out.println(s1.getName()+s1.getAge());
    }
}
