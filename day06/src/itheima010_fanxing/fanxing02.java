package itheima010_fanxing;
//泛型类
public class fanxing02<T>{
private T  age;

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }
    //泛型方法
    public  void method(T t){
        System.out.println(t);
    }
}