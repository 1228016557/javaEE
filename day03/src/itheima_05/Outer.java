package itheima_05;

public class Outer {
    private  int num= 10;
    private class Interclass{
        public void show(){
            System.out.println(num);
        }
    }
    public void method(){
        Interclass i =new Interclass();
         i.show();
    }

}