package itheima00_Practice.NimingOuter;

public class Test {

    public static void main(String[] args) {
      Fly f =  new Fly(){
            @Override
            public void open() {
                System.out.println("喷气式上天");
            }
        };

      f.open();
    }
}
