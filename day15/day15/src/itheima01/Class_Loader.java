package itheima01;
/*
Java中的内置类加载器
- Bootstrap class loader：它是虚拟机的内置类加载器，通常表示为null ，并且没有父null
- Platform class loader：平台类加载器可以看到所有平台类 ，平台类包括由平台类加载器或其祖先定义的Java SE平台API，其实现类和JDK特定的运行时类
- System class loader：它也被称为应用程序类加载器 ，与平台类加载器不同。 系统类加载器通常用于定义应用程序类路径，模块路径和JDK特定工具上的类
- 类加载器的继承关系：System的父加载器为Platform，而Platform的父加载器为Bootstrap

static ClassLoader getSystemClassLoader()返回用于委派的系统类加载器
ClassLoader getParent()返回父类加载器进行委派
 */
public class Class_Loader {
    public static void main(String[] args) {
         //static ClassLoader getSystemClassLoader()返回用于委派的系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);  //AppClassLoader

        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent); //PlatformClassLoader

        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1); //null
    }
}
