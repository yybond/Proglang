package Proglang.Loop;

public class LoopForImproved {
    public static void main(String[] args) {
        int [] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers){
            System.out.println( x );
            System.out.println(",");
        }
        //System.out.println("\n");
        String [] names = {"Oleg", "Ivan", "Dima", "Yulia"};
        for ( String name : names ){
            System.out.println( name);
            System.out.println(",");
        }

    }
}
