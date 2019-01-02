package Proglang.InnerClasses.PrivateMembers;

class Outer_Demo {
    // Частная переменная внешнего класса
    private int num = 2018;

    // Внутренний класс
    public class Inner_Demo {
        public int getNum() {
            System.out.println("Это метод getnum внутреннего класса");
            return num;
        }
    }
}