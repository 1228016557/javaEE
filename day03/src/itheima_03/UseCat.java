package itheima_03;
//操作类
public class UseCat {
//用接口名作为形参
    public void usecat(jump j){
        j.jump();
    }

    //用接口名作为返回值
    public jump getcat(){
        jump j = new Cat();
        return j;
    }
}
