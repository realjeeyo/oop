/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version2;

/**
 *
 * @author User
 */
public class CommissionEmployee extends Employee{
    public double totalSales;
    
    public CommissionEmployee() {
    }

    public CommissionEmployee(Employee e) {
        super(e.empID, e.empName);
    }
    
    public CommissionEmployee(Employee e, double totalSales) {
        super(e.empID, e.empName);
        this.totalSales = totalSales;
    }

    public CommissionEmployee(double totalSales) {
        this.totalSales = totalSales;
    }

    public CommissionEmployee(double totalSales, int empID, String empName) {
        super(empID, empName);
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public double computeSalary(){
        if (totalSales >= 1000000){
            return totalSales * 0.3;
        } else if (totalSales >= 100000 && totalSales < 1000000){
            return totalSales * 0.2;
        } else if (totalSales >= 10000 && totalSales < 100000){
            return totalSales * 0.1;
        } else {
            return totalSales * 0.05;
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nEmployee ID: ").append(empID);
        sb.append("\nEmployee Name: ").append(empName);
        sb.append("\nTotal Sales: ").append(totalSales);
        return sb.toString();
    }
    
    public void displayCommissionEmployee(){
        System.out.println(this.toString());
        System.out.println("\nComputed Salary: ");
        System.out.println(computeSalary());
    }
    
}
