package Proglang.Exceptions.NewOwnException;

import java.io.*;

public class InsufficientFundsExeption extends Exception {
    private double amount;

    public InsufficientFundsExeption (double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }
}
