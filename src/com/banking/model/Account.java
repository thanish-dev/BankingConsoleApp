package com.banking.model;

public class Account {
    private String name;
    private int accNo;
    private double balance;

    public Account(String name,int accNo, double balance) {
        this.name=name;
        this.accNo=accNo;
        this.balance=balance;
    }

    public int getAccNo(){
        return accNo;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Succesfully");
        }

        else{
            System.err.println("Invalid amount");
        }
    }    
    
    public void withdraw(double amount ){
        if(amount > 0 && amount<=balance){
            balance-= amount;
            System.out.println("Withdraw succesfull");
        }
        else{
            System.out.println("Insufficient balance");
        }
    } 
}    


