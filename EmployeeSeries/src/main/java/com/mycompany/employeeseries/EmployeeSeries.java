/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeeseries;
import com.mycompany.employeeseries.version1.*;


/**
 *
 * @author User
 */
public class EmployeeSeries {

    public static void main(String[] args) {
        HourlyEmployee e = new HourlyEmployee(41, 100, "Jio", 1);
        e.displayHourlyEmployee();
        
        System.out.println(e.computeSalary());
        
        PieceWorkerEmployee a = new PieceWorkerEmployee(350, 10, "Jansen", 2);
        a.displayHourlyEmployee();
        
        System.out.println(a.computeSalary());
        
        CommissionEmployee b = new CommissionEmployee(1000000, "Josh", 3);
        b.displayHourlyEmployee();
        
        System.out.println(b.computeSalary());
        
        BasedPlusCommissionEmployee c = new BasedPlusCommissionEmployee(1250000, 100, "Dusky", 4);
        c.displayHourlyEmployee();
        
        System.out.println(c.computeSalary());
    }
}
