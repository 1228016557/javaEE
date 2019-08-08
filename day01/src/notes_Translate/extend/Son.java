package notes_Translate.extend;
//孩子类
/*
        1.java中类只支持单继承 不支持多继承
        2.支持多层继承(孩子继承爸爸,爸爸继承爷爷)
 */
public class Son  extends Father /*, Mother*/ {
     //多继承有风险,java中不支持多继承
    public  String name;
    public  int age;
    public  void  s(){
        System.out.println("son");
    }
}
