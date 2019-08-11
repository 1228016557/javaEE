package itheima_07;

public  class Outer {

public  void method(){
     //匿名内部类：本质是一个继承了该类或者实现了该接口的匿名对象
         Inter i=  new Inter() {    //使用该接口类型接收该对象
        @Override
        public void show() {
            System.out.println("匿名内部类");
        }
    };

         i.show();

}

}
