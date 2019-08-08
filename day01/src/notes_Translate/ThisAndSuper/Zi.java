package notes_Translate.ThisAndSuper;
//就近原则
public class Zi extends Fu{
    public int age =30;
@Override
    public void show(){
//       age = 20;
//        System.out.println(age); // 输出20,就近原则
        System.out.println(this.age); //输出30,this代表当前对象的引用
        System.out.println(super.age);//输出40,super表示父类
    super.show();
    }
}
