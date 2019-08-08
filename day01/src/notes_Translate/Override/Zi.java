package notes_Translate.Override;

public  class Zi extends Fu {
    @Override  //可以用来判断是不是重写
    public void show() {
        System.out.println("子类中重写");
    }
 /*  @Override    //子类方法的访问权限要大于等于父类方法的访问权限 public > 默认
                //父类中是public 子类中默认的索引访问权限小,不是重写*/
 /*   void eat(){
        System.out.println("喝汤");
    }*/
}
