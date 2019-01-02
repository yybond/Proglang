package Proglang.InnerClasses.PrivateMembers;

public class My_class2 {

    public static void main(String args[]) {
        // Создание внешнего класса
        Outer_Demo outer = new Outer_Demo();

        // Создание внутреннего класса
        Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
        System.out.println(inner.getNum());
    }
}
