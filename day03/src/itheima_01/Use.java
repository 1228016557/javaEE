package itheima_01;

public class Use {
    //方法的形参是类名，其实需要的是该类的对象
    public void usecat( Cat c){
        c.eat();
    }
//方法的返回值是类名，其实返回值是该类的对象
    public  Cat  getcat(){
        Cat c =new Cat();
        return c;
    }

}
