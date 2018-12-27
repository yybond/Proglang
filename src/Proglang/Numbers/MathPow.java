package Proglang.Numbers;

// Метод Math.pow() — возводит значение первого аргумента в степень второго аргумента,
// тем самым позволяет осуществить быстрое возведение в степень любых значений.

public class MathPow {
    public static void main(String[] args) {

        //Возведение в квадрат числа 3
        int a1 = 3;
        int b1 = 2;
        System.out.printf("Число 3 в квадрате равно %.0f \n", Math.pow(a1, b1));

        //Возведение в квадрат числа 5
        int a2 = 5;
        int b2 = 2;
        System.out.println("Число 5 в квадрате равно " + Math.pow(a2, b2));

        //Возведение в куб числа 2
        int a3 = 2;
        int b3 = 3;
        System.out.printf("Число 2 в кубе равно %.0f \n", Math.pow(a3, b3));

        //Возведение в куб числа 3
        int a4 = 3;
        int b4 = 3;
        System.out.println("Число 3 в кубе равно " + Math.pow(a4, b4));
    }
}
