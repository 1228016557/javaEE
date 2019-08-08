package notes_Translate.extend;
/*
继承
	多个类具备共性内容 向上抽取到一个类中 一个类和多个类产生的关系叫做继承
	格式
		public class 子类 extedns 父类{

		}
	产生效果
		子类可以直接使用父类所有可继承的属性和行为(非私有)
		私有的成员变量可以通过get/set方法访问赋值和取值
	继承好处
		复用性
		可维护性
	弊端
		耦合性高 子类独立性弱
	注意事项
		1.java中类只支持单继承 不支持多继承
		2.支持多层继承
		3.所有的类都直接或者间接继承了Object类
		4.构造方法不能继承

 */

// son     father     mother    grandfather 构成继承测试
public class  Test {
    Son s = new Son();
    //构造方法不能被继承
//    s.Father();
//   s.Father("sss",10)
}
