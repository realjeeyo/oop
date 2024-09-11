/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version1;

/**
 *
 * @author User
 */
public class BasedPlusCommissionEmployee{
    private double totalSales;
    private double baseSalary;
    private String empName;
    private int empID;

    public BasedPlusCommissionEmployee() {
    }

    public BasedPlusCommissionEmployee(double totalSales, double baseSalary, String empName, int empID) {
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
        this.empName = empName;
        this.empID = empID;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
    
    public double computeSalary(){
        if (totalSales >= 1000000){
            return baseSalary + totalSales * 0.3;
        } else if (totalSales >= 100000 && totalSales < 1000000){
            return baseSalary + totalSales * 0.2;
        } else if (totalSales >= 10000 && totalSales < 100000){
            return baseSalary + totalSales * 0.1;
        } else {
            return baseSalary + totalSales * 0.05;
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nEmployee ID: ").append(empID);
        sb.append("\nEmployee Name: ").append(empName);
        sb.append("\nTotal Sales: ").append(totalSales);
        sb.append("\nBase Salary: ").append(baseSalary);
        return sb.toString();
    }
    
    public void displayHourlyEmployee(){
        System.out.println(this.toString());
    }
    
}
