/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version2;

/**
 *
 * @author User
 */
public class BasedPlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasedPlusCommissionEmployee() {
    }

    public BasedPlusCommissionEmployee(Employee e) {
        super(e);
    }

    public BasedPlusCommissionEmployee(double totalSales, Employee e){
        super(e, totalSales);
    }

    public BasedPlusCommissionEmployee(double totalSales, double baseSalary) {
        super(totalSales);
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(double totalSales, int empID, String empName, double baseSalary){
        super(totalSales, empID, empName);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + this.baseSalary;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nBase Salary: ").append(baseSalary);
        return sb.toString();
    }
    
    public void displayBCPEmployee(){
        System.out.println(this.toString());
        System.out.println("\nComputed Salary: ");
        System.out.println(computeSalary());
    }
    
}
