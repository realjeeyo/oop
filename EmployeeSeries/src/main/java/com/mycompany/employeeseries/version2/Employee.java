/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version2;

/**
 *
 * @author User
 */
public class Employee {
    public int empID;
    public String empName;

    public Employee() {
    }

    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void displayEmployee(){
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nEmployee ID: ").append(empID);
        sb.append("\nEmployee Name: ").append(empName);
        return sb.toString();
    }
    
    
}
