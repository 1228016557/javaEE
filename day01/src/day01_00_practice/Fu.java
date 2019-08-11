package day01_00_practice;

public class Fu {
    int age = 40;

    public Fu(int age) {
        this.age = age;
        System.out.println("父类有参");
    }

    public Fu() {
        System.out.println("父类无参");
    }
    public final void  showone(){
        System.out.println("父类showone");
    }
}
