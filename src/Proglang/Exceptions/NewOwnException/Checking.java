package Proglang.Exceptions.NewOwnException;

import java.io.*;

public class Checking {
    private  int number;
    private double balance;

    public Checking(int number){
        this.number = number;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw (double amount) throws InsufficientFundsExeption{
        if (amount <= balance){
            balance -= amount;
        } else {
            double needs = amount - balance;
            throw new InsufficientFundsExeption(needs);
        }
    }

    public double getBalance(){
        return balance;
    }

    public int getNumber(){
        return number;
    }
}
