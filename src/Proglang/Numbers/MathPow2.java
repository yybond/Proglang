package Proglang.Numbers;

public class MathPow2 {
    public static void main(String[] args) {
        double x1 = 10.635;
        double y1 = 3.76;

        //Возведение числа в дробную степень

        System.out.printf("Значение %.3f в степени %.2f равно %.3f \n", x1, y1, Math.pow(x1,  y1));
        System.out.printf("pow(%.3f, %.3f) = %.3f \n\n", x1, y1, Math.pow(x1, y1));
    }
}
