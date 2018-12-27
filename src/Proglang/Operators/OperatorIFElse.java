package Proglang.Operators;


public class OperatorIFElse {
    public static void main(String[] args) {
        int x = 30;
        int a = 10;
        int b = 15;

        if (x==10){
            System.out.println("Znachenie X = 10");
        } else if (x==20){
            System.out.println("Znachenie X = 20");
        } else if (x==30){
            System.out.println("Znachenie X = 30");
        } else {
            System.out.println("Eto operator ELSE");
        }

        System.out.println("Способ сокращения оператора if-else при помощи оператора ?");
        System.out.println(a==b ? "a and b are equal!" : "a and b are not equal");
    }
}
