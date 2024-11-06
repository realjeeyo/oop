/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version7;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class EmployeeRoster {
    ArrayList<Employee> empList = new ArrayList();

    public EmployeeRoster() {
    }

    public boolean addEmployee(Employee emp){
        return empList.add(emp);
    }
    
    public Employee removeEmployee(int id) {
        for (int i=0; i<empList.size();++i){
            if (empList.get(i).getId() == id){
                return empList.remove(i);
            }
        }
        return null;
    }
        
    public int countHE(){
        return (int) empList.stream().filter(emp -> emp instanceof HourlyEmployee).count();
    }
        
    public int countCE(){
        return (int) empList.stream().filter(emp -> emp instanceof CommissionEmployee && !(emp instanceof BasedPlusCommissionEmployee)).count();
    }
    
    public int countBPCE(){
        return (int) empList.stream().filter(emp -> emp instanceof BasedPlusCommissionEmployee).count();
    }
    
    public int countPWE(){
        return (int) empList.stream().filter(emp -> emp instanceof PieceWorkerEmployee).count();
    }
    
    public void displayHE(){
        empList.stream().filter(emp -> emp instanceof HourlyEmployee).forEach(emp -> ((HourlyEmployee) emp).display());
    }
    
    public void displayCE(){
        empList.stream().filter(emp -> emp instanceof CommissionEmployee && !(emp instanceof BasedPlusCommissionEmployee)).forEach(emp -> ((CommissionEmployee) emp).display());
    }
    
    public void displayBPCE(){
        empList.stream().filter(emp -> emp instanceof BasedPlusCommissionEmployee).forEach(emp -> ((BasedPlusCommissionEmployee) emp).display());
    }
    
    public void displayPWE(){
        empList.stream().filter(emp -> emp instanceof PieceWorkerEmployee).forEach(emp -> ((PieceWorkerEmployee) emp).display());
    }
    
    public void displayAllEmployee(){
        System.out.printf("%-10s|%-20s|%-15s|%-15s|%-10s|%-30s|\n", "ID", "Name", "Date Of Birth", "Date Hired", "Salary", "Employee Type");
        empList.forEach(emp -> {
        System.out.printf("%-10s|", emp.getId());
        System.out.printf("%-20s|", emp.getName());
        System.out.printf("%-15s|", emp.getDob());
        System.out.printf("%-15s|", emp.getDateHired());
        System.out.printf("%-,10.2f|", emp.computeSalary());
        System.out.printf("%-30s|\n", emp.getClass().getSimpleName());
        });

        System.out.println();
    }
}
