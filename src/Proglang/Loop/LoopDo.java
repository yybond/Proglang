package Proglang.Loop;

public class LoopDo {
    public static void main(String[] args) {
        int x = 10;

        do {
            System.out.println("Значение x: " + x );
            x++;
            //System.out.println("\n");
        } while ( x < 15);
    }
}
