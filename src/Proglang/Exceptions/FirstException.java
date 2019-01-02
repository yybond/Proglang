package Proglang.Exceptions;

import java.io.IOException;

public class FirstException {

    public static void main(String[] args) {
        new FirstException().someMethod();
        System.out.println("after method");
    }
    void someMethod(){
        try {
            System.out.println("try");
            Object o = null;
            //o.hashCode();
        } catch (NullPointerException e) {
            System.out.println("catch");
            //e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }
}
