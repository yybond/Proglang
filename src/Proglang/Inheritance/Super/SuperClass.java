package Proglang.Inheritance.Super;

public class SuperClass {
    int age;

    SuperClass(int age){
        this.age = age;
    }

    public void getAge(){
        System.out.println("Значение переменной age в суперклассе равно: "+ age);
    }
}
