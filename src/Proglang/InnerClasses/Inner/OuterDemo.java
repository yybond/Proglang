package Proglang.InnerClasses.Inner;

//Внутренний класс нестатического вложенного класса

public class OuterDemo {
    int num;

    //Внутренний класс
    private class InnerDemo {
        public void print(){
            System.out.println("Это внутренний класс");
        }
    }

    //Доступ к внутреннему классу из метода
    void display_Inner(){
        InnerDemo inner = new InnerDemo();
        inner.print();
    }
}

