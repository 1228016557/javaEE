package itheima_02;

public class UseAnimal {
    //抽象方法作为形参，其实需要的是其子类对象
    public void useanimal(Animal a){
        a.eat();
    }

    //抽象方法作为返回值，其实返回的是其子类的对象
    public Animal getanimal(){
        Animal a =new Cat();
        return a;
    }
}
