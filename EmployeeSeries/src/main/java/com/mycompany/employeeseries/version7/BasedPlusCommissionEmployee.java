/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version7;

/**
 *
 * @author User
 */
public class BasedPlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasedPlusCommissionEmployee() {
    }

    public BasedPlusCommissionEmployee(EmpName name, int id) {
        super(name, id);
    }

    public BasedPlusCommissionEmployee(double totalSales, EmpName name, Date dateHired, Date dob, int id) {
        super(totalSales, name, dateHired, dob, id);
    }

    public BasedPlusCommissionEmployee(double baseSalary, double totalSales, EmpName name, Date dateHired, Date dob, int id) {
        super(totalSales, name, dateHired, dob, id);
        this.baseSalary = baseSalary;
    }
    
    public BasedPlusCommissionEmployee(CommissionEmployee e){
        super(e.getTotalSales(), e.getName(), e.getDateHired(), e.getDob(), e.getId());
    }
    
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    @Override
    public double computeSalary(){
        return super.computeSalary() + this.baseSalary;
    }
}
