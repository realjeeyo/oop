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
        System.out.println("\nHourlyEmployee:");
        HourlyEmployee a = new HourlyEmployee();
        HourlyEmployee a2 = new HourlyEmployee("Jio", 2);
        HourlyEmployee a3 = new HourlyEmployee(41, 100, "Jansen", 3);
        
        a.setTotalHoursWorked(41);
        a.setRatePerHour(100);
        a.setEmpName("Josh");
        a.setEmpID(1);
        a.displayHourlyEmployee();
        System.out.println(a.computeSalary());
        
        a2.setTotalHoursWorked(40);
        a2.setRatePerHour(100);
        a2.displayHourlyEmployee();
        System.out.println(a2.computeSalary());
        
        a3.displayHourlyEmployee();
        System.out.println(a3.computeSalary());
        
        // PieceWorkerEmployee
        System.out.println("\nPieceWorkerEmployee:");
        PieceWorkerEmployee b = new PieceWorkerEmployee();
        PieceWorkerEmployee b2 = new PieceWorkerEmployee("Jio", 2);
        PieceWorkerEmployee b3 = new PieceWorkerEmployee(100, 150, "Jansen", 3);
        
        b.setTotalPiecesFinished(100);
        b.setRatePerPiece(100);
        b.setEmpName("Josh");
        b.setEmpID(1);
        b.displayHourlyEmployee();
        System.out.println(b.computeSalary());
        
        b2.setTotalPiecesFinished(100);
        b2.setRatePerPiece(100);
        b2.displayHourlyEmployee();
        System.out.println(b2.computeSalary());
        
        b3.displayHourlyEmployee();
        System.out.println(b3.computeSalary());
        
        // CommissionEmployee
        System.out.println("\nCommissionEmployee:");
        CommissionEmployee c = new CommissionEmployee();
        CommissionEmployee c2 = new CommissionEmployee("Jio", 2);
        CommissionEmployee c3 = new CommissionEmployee(150000, "Jansen", 3);
        
        c.setTotalSales(100000);
        c.setEmpName("Josh");
        c.setEmpID(1);
        c.displayHourlyEmployee();
        System.out.println(c.computeSalary());
        
        c2.setTotalSales(100000);
        c2.displayHourlyEmployee();
        System.out.println(c2.computeSalary());
        
        c3.displayHourlyEmployee();
        System.out.println(c3.computeSalary());
        
        // BasedPlusCommissionEmployee
        System.out.println("\nBasedPlusCommissionEmployee:");
        BasedPlusCommissionEmployee d = new BasedPlusCommissionEmployee();
        BasedPlusCommissionEmployee d2 = new BasedPlusCommissionEmployee("Jio", 2);
        BasedPlusCommissionEmployee d3 = new BasedPlusCommissionEmployee(120000, 500, "Jansen", 3);
        
        d.setTotalSales(100000);
        d.setBaseSalary(500);
        d.setEmpName("Josh");
        d.setEmpID(1);
        d.displayHourlyEmployee();
        System.out.println(d.computeSalary());
        
        d2.setTotalSales(100000);
        d2.setBaseSalary(500);
        d2.displayHourlyEmployee();
        System.out.println(d2.computeSalary());
        
        d3.displayHourlyEmployee();
        System.out.println(d3.computeSalary());
    }
}
