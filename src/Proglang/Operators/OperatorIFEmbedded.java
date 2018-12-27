package Proglang.Operators;

public class OperatorIFEmbedded {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;

        if (x==30){
            if(y==10){
                System.out.println("X = 30 и Y = 10");
            }
        }
        if (x==20){
            if (y==10){
                System.out.println("X = 20 и Y = 10");
            } else {
                System.out.println("Y is false");
            }
        } else {
            System.out.println("Nothing's true");
        }
    }
}
