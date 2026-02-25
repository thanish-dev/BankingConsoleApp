package com.banking.app;

import java.util.Scanner;
import com.banking.service.Bank;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        int choice;

        
            System.out.println("\n===== Banking System =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    scanner.nextLine(); // clear buffer

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Initial Deposit: ");
                    double deposit = scanner.nextDouble();

                    bank.createAccount(name, deposit);
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int depAcc = scanner.nextInt();

                    System.out.print("Enter Amount: ");
                    double depAmount = scanner.nextDouble();

                    bank.deposit(depAcc, depAmount);
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int withAcc = scanner.nextInt();

                    System.out.print("Enter Amount: ");
                    double withAmount = scanner.nextDouble();

                    bank.withdraw(withAcc, withAmount);
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    int balAcc = scanner.nextInt();

                    bank.showBalance(balAcc);
                    break;

                case 5:
                    System.out.println("Thank you for using Banking System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }


        scanner.close();
    }
}