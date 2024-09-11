/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version1;

/**
 *
 * @author User
 */
public class CommissionEmployee {
    public double totalSales;
    public String empName;
    public int empID;

    public CommissionEmployee() {
    }

    public CommissionEmployee(double totalSales, String empName, int empID) {
        this.totalSales = totalSales;
        this.empName = empName;
        this.empID = empID;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
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
    
    public void displayHourlyEmployee(){
        System.out.println(this.toString());
    }
    
}
