package itheima010_fanxing;
//泛型类   创建对象时确定数据类型
public class fanxing01<T> {
    private  T name;

    public fanxing01() {
    }

    public fanxing01(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    //泛型方法
    public <T> void method(T t){
        System.out.println(t);
    }
}
