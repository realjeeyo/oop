/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaone;

/**
 *
 * @author User
 */
public class JavaOne {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Account a1 = new Account("Jio Delgado", 21101024);
        Account a2 = new Account("Jansen Choi", 23102442);
        
        a1.deposit(10000);
        a1.verify();
        a1.display();
        a2.display();
        
        a1.transfer(a2, 5000);
        a1.display();
        a2.display();
        
        
        Vehicle v1 = new Vehicle(10, "White", "CR-V", "Honda", "GAE 9251");
        v1.display();
        
        v1.accelerate();
        v1.accelerate();
        v1.decelerate();
        v1.repair();
        v1.decelerate();
        v1.decelerate();
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

Class Name: Vehicle
Properties:
- topSpeed : int
- currSpeed : int
- color : String
- model : String
- manufacturer : String
- plateNumber : String
- disabled : boolean
Methods:
+ accelerate() : boolean
+ decelerate() : boolean
+ toString() : String
+ display() : void
*/