package Proglang.Numbers;

//Метод Math.abs() — дает абсолютное значение аргумента, простыми словами — мы получаем модуль числа.

public class MathAbs {
    public static void main(String[] args) {
        Integer a = -8;
        double d = -100;
        float f = -90;

        System.out.println(Math.abs(a));
        System.out.println(Math.abs(d));
        System.out.println(Math.abs(f));
    }
}
