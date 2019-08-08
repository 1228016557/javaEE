package notes_Translate.Override;
/*
方法重写
		子类继承父类后,可以使用父类的非私有内容,但是如果觉得父类的方法
		不够强大,可以按照自身的逻辑来重新定义此方法 方法复写 方法覆盖
	注意事项
		1.可以使用@Override来验证是否是方法重新
		2.子类方法的访问权限要大于等于父类方法的访问权限
			public > 默认
 */
public class Test {
    public static void main(String[] args) {
        Zi z =new Zi();
        z.show();

    }
}
