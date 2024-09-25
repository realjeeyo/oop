/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version3;

/**
 *
 * @author User
 */
public class EmpName {
    public String fName;
    public String lName;
    public String mName;

    public EmpName() {
    }

    public EmpName(String fName, String lName, String mName) {
        this.lName = lName;
        this.fName = fName;
        this.mName = mName;
    }

    public EmpName(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
    
    public void display(){
        System.out.printf("%s, %s %s.", lName, fName, mName);
    }
}
