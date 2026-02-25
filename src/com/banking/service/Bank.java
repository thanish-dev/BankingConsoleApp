package com.banking.service;

import java.util.HashMap;
import com.banking.model.Account;

public class Bank {
    
    private HashMap<Integer,Account> accounts= new HashMap<>();

    private int nextAccNo = 1001;

    public void createAccount(String name, double initialdeposit){
         int accNo = nextAccNo++;

         Account acc= new Account( name,accNo, initialdeposit);
         accounts.put(accNo,acc);

         System.out.println("Account created succesfully");
         System.out.println("your account number is" + accNo);
    }

    public void deposit(int accNo, double amount){
        
        Account acc= accounts.get(accNo);
        
        if (acc!= null){
            acc.deposit(amount);
            System.out.println("Deposit succesfull of amt:"+ amount);
        }
        else{
            System.out.println("Account not found");
        }
    }

    public void withdraw(int accNo, double amount){
        
        Account acc= accounts.get(accNo);
        
        if (acc!= null){
            acc.withdraw(amount);
            System.out.println("withdraw succesfull of amt:"+ amount);
        }
    }    

    public void showBalance(int accNo){

        Account acc= accounts.get(accNo);
        if(acc!= null){
            acc.getBalance();
            System.err.println("Balance is" + acc.getBalance());
        }
         else{
            System.err.println("Enter a valid account number");
         }

    }   
    



    
}
