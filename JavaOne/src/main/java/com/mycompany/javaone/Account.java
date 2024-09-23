/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaone;


/**
 *
 * @author User
 */


public class Account {
    private double currBal;
    private double availBal;
    private String accName;
    private int accNum;
    
    public Account(){
    }
    
    public Account(String accName, int accNum){
        this.accName = accName;
        this.accNum = accNum;
    }

    // Check Balance (Current)
    public double getCurrBal() {
        return currBal;
    }

    // Check Balance (Available)
    public double getAvailBal() {
        return availBal;
    }

    public void verify(){
        this.availBal = this.currBal;
    }
    
    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    
    //Methods / Behaviors
    
    public boolean deposit(double amnt){
        if (amnt % 100 == 0){
            this.currBal += amnt;
            return true;
        }
        return false;
    }
    
    public boolean withdraw(double amnt){
        if (this.availBal - (amnt + 10) >= 0 && amnt % 100 == 0){
            this.availBal -= (amnt + 10);
            this.currBal -= (amnt + 10);
            return true;
        }
        return false;
    }
    
    public boolean transfer(Account a, double amnt){
        if (this.availBal - (amnt+10) >= 0){
            a.deposit(amnt);
            this.withdraw(amnt);            
            return true;
        }
        return false;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\nAccount ID: ");
        sb.append(accNum);
        sb.append("\nAccount Name: ");
        sb.append(accName);
        sb.append("\nCurrent Balance: ");
        sb.append(currBal);
        sb.append("\nAvailable Balance: ");
        sb.append(availBal);
        
        return sb.toString();
    }
    
    public void display(){
        System.out.println(this.toString());
    }
    
    
}

/*
Class Name: Account
Properties:
- currentBalance : double
- availableBalance : double
- accountName : String
- accountNumber : int

Methods/Behaviours:
+ deposit(amount : double) : boolean // Anything divisible by 100
+ withdraw(amount : double) : boolean // Banking Fee = -Php10.00
+ checkBalance() : double
+ transfer(another : Account, amount : double) : boolean 
+ toString() : String
+ display() : void
*/