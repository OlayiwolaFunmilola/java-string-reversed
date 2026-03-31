package com.funmi.ATMProject;

import java.io.ObjectOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public Scanner getInput() {
        return input;
    }

    public Scanner setInput(Scanner input) {
        this.input = input;
        return input;
    }

    public DecimalFormat getMoneyFormat(double checkingBalance) {
        return moneyFormat;
    }

    public DecimalFormat setMoneyFormat(DecimalFormat moneyFormat) {
        this.moneyFormat = moneyFormat;
        return moneyFormat;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public double setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
        return savingBalance;
    }

    public void calCheckingWithdraw(double amount) {
        checkingBalance =(checkingBalance - amount);
    }

    public void calSavingWithdraw(double amount){
        savingBalance = (savingBalance - amount);
    }

    public void calCheckingDeposit(double amount){
        checkingBalance = (checkingBalance + amount);
    }

    public double calSavingDeposit(double amount){
        savingBalance = (savingBalance + amount);
        return savingBalance;

    }
    
    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance: " + getMoneyFormat(checkingBalance));
        System.out.println("Amount you want to withdraw from Checking Account: ");
        double amount = input.nextDouble();
        
        if((checkingBalance - amount) >= 0){
            calCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
        }else{
                System.out.println("Balance Cannot be Negative." + "\n");
            }
        }

        public void getSavingWithdrawInput(){
            System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
            System.out.print("Amount you want to withdraw from saving Account: ");
            double amount = input.nextDouble();

            if((savingBalance - amount) >= 0){
                calSavingWithdraw(amount);
                System.out.println("New saving Account Balance: " + moneyFormat.format(savingBalance));
            }else {
                System.out.println("Balance Cannot be Negative." + "\n");

            }

            ObjectOutput getCheckingDepositInput;
                System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
                System.out.println("Amount you want to deposit from Checking Account: ");
                double amounts = input.nextDouble();

                if((checkingBalance + amounts) >= 0){
                    calCheckingDeposit(amounts);
                    System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
                }else{
                    System.out.println("Balance Cannot be Negative." + "\n");
                }
            }

            public void getSavingDepositInput() {
                System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
                System.out.println("Amount you want to deposit from Saving Account: ");
                double amount = input.nextDouble();

                if((savingBalance + amount) >= 0){
                    calSavingDeposit(amount);
                    System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
                }else{
                    System.out.println("Balance Cannot be Negative." + "\n");
                }
            }

        }



