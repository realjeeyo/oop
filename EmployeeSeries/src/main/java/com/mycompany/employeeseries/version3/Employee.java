/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version3;

/**
 *
 * @author User
 */
public class Employee {
    public EmpName name;
    public Date dateHired;
    public Date DOB;
    public int empID;
    
    public Employee() {
    }

    public Employee(EmpName name, Date dateHired, Date DOB, int empID) {
        this.name = new EmpName(name.getlName(), name.getfName(), name.getmName());
        this.dateHired = new Date(dateHired.getDay(), dateHired.getMonth(), dateHired.getYear());
        this.DOB = new Date(DOB.getDay(), DOB.getMonth(), DOB.getYear());
        this.empID = empID;
    }

    public EmpName getName() {
        return name;
    }

    public void setName(EmpName name) {
        this.name = new EmpName(name.getlName(), name.getfName(), name.getmName());
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = new Date(dateHired.getMonth(), dateHired.getDay(), dateHired.getYear());
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = new Date(DOB.getMonth(), DOB.getDay(), DOB.getYear());
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nEmployee Name: ").append(name.lName).append(", ").append(name.fName).append(" ").append(name.mName);
        sb.append("\nEmployee ID: ").append(empID);
        sb.append("\nDate Hired: ").append(dateHired.month).append("/").append(dateHired.day).append("/").append(dateHired.year);
        sb.append("\nDate of Birth: ").append(DOB.month).append("/").append(DOB.day).append("/").append(DOB.year);
        return sb.toString();
    }
    
    public void displayEmployee(){
        System.out.println(this);
    }
}
