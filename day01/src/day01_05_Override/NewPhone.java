package day01_05_Override;

public class NewPhone extends Phone {

    @Override
    public void call(String name){
        System.out.println("开启视频功能");
        super.call("林青霞");
    }
}
