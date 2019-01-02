package Proglang.Inheritance;

public class Calculator {

    int c;

    public void addition (int a, int b){
        c = a + b;
        System.out.println("Сумма чисел6 " + c);
    }

    public void substraction(int a, int b){
        c = a - b;
        System.out.println("Разность чисел: " + c);
    }
}
