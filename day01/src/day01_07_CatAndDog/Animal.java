package day01_07_CatAndDog;
 //动物类(父类,猫狗拥有的共性)
public class Animal {
    private String name;
    private int age;

     public Animal() {
     }

     public Animal(String name, int age) {
         this.name = name;
         this.age = age;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }
 }
