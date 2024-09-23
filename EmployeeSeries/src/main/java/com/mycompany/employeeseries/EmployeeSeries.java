/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeeseries;
//import com.mycompany.employeeseries.version1.*;
import com.mycompany.employeeseries.version2.*;

/**
 *
 * @author User
 */
public class EmployeeSeries {

    public static void main(String[] args) {
//        Version 1
//        System.out.println("\nHourlyEmployee:");
//        HourlyEmployee a = new HourlyEmployee();
//        HourlyEmployee a2 = new HourlyEmployee("Jio", 2);
//        HourlyEmployee a3 = new HourlyEmployee(41, 100, "Jansen", 3);
//        
//        a.setTotalHoursWorked(41);
//        a.setRatePerHour(100);
//        a.setEmpName("Josh");
//        a.setEmpID(1);
//        a.displayHourlyEmployee();
//        System.out.println(a.computeSalary());
//        
//        a2.setTotalHoursWorked(40);
//        a2.setRatePerHour(100);
//        a2.displayHourlyEmployee();
//        System.out.println(a2.computeSalary());
//        
//        a3.displayHourlyEmployee();
//        System.out.println(a3.computeSalary());
//        
//        // PieceWorkerEmployee
//        System.out.println("\nPieceWorkerEmployee:");
//        PieceWorkerEmployee b = new PieceWorkerEmployee();
//        PieceWorkerEmployee b2 = new PieceWorkerEmployee("Jio", 2);
//        PieceWorkerEmployee b3 = new PieceWorkerEmployee(100, 150, "Jansen", 3);
//        
//        b.setTotalPiecesFinished(100);
//        b.setRatePerPiece(100);
//        b.setEmpName("Josh");
//        b.setEmpID(1);
//        b.displayHourlyEmployee();
//        System.out.println(b.computeSalary());
//        
//        b2.setTotalPiecesFinished(100);
//        b2.setRatePerPiece(100);
//        b2.displayHourlyEmployee();
//        System.out.println(b2.computeSalary());
//        
//        b3.displayHourlyEmployee();
//        System.out.println(b3.computeSalary());
//        
//        // CommissionEmployee
//        System.out.println("\nCommissionEmployee:");
//        CommissionEmployee c = new CommissionEmployee();
//        CommissionEmployee c2 = new CommissionEmployee("Jio", 2);
//        CommissionEmployee c3 = new CommissionEmployee(150000, "Jansen", 3);
//        
//        c.setTotalSales(100000);
//        c.setEmpName("Josh");
//        c.setEmpID(1);
//        c.displayHourlyEmployee();
//        System.out.println(c.computeSalary());
//        
//        c2.setTotalSales(100000);
//        c2.displayHourlyEmployee();
//        System.out.println(c2.computeSalary());
//        
//        c3.displayHourlyEmployee();
//        System.out.println(c3.computeSalary());
//        
//        // BasedPlusCommissionEmployee
//        System.out.println("\nBasedPlusCommissionEmployee:");
//        BasedPlusCommissionEmployee d = new BasedPlusCommissionEmployee();
//        BasedPlusCommissionEmployee d2 = new BasedPlusCommissionEmployee("Jio", 2);
//        BasedPlusCommissionEmployee d3 = new BasedPlusCommissionEmployee(120000, 500, "Jansen", 3);
//        
//        d.setTotalSales(100000);
//        d.setBaseSalary(500);
//        d.setEmpName("Josh");
//        d.setEmpID(1);
//        d.displayHourlyEmployee();
//        System.out.println(d.computeSalary());
//        
//        d2.setTotalSales(100000);
//        d2.setBaseSalary(500);
//        d2.displayHourlyEmployee();
//        System.out.println(d2.computeSalary());
//        
//        d3.displayHourlyEmployee();
//        System.out.println(d3.computeSalary());

//        Version 2
//        Employee
        Employee e1 = new Employee();
        Employee e2 = new Employee(2, "Jio Delgado");
        
        e1.setEmpID(1);
        e1.setEmpName("Josh Lui");
        e1.displayEmployee();
        
        e2.displayEmployee();
        
//        HourlyEmployee
        HourlyEmployee a1 = new HourlyEmployee();
        HourlyEmployee a2 = new HourlyEmployee(e1);
        HourlyEmployee a3 = new HourlyEmployee(e2, 100, 100);
        HourlyEmployee a4 = new HourlyEmployee(100, 100);
        HourlyEmployee a5 = new HourlyEmployee(100, 100, 5, "Jose Delgado");
        
        a1.setEmpID(10);
        a1.setEmpName("Josh Lui");
        a1.setRatePerHour(100);
        a1.setTotalHoursWorked(100);
        a1.displayHourlyEmployee();
        
        a2.setRatePerHour(100);
        a2.setTotalHoursWorked(100);
        a2.displayHourlyEmployee();
        
        a3.displayHourlyEmployee();
        
        a4.setEmpID(4);
        a4.setEmpName("Jansen Choi");
        a4.displayHourlyEmployee();
        
        a5.displayHourlyEmployee();
        
//        PieceWorkerEmployee
        PieceWorkerEmployee b1 = new PieceWorkerEmployee();
        PieceWorkerEmployee b2 = new PieceWorkerEmployee(e1);
        PieceWorkerEmployee b3 = new PieceWorkerEmployee(e2, 100, 100);
        PieceWorkerEmployee b4 = new PieceWorkerEmployee(100, 100);
        PieceWorkerEmployee b5 = new PieceWorkerEmployee(100, 100, 5, "Jose Delgado");
        
        b1.setEmpID(10);
        b1.setEmpName("Josh Lui");
        b1.setRatePerPiece(100);
        b1.setTotalPiecesFinished(100);
        b1.displayPieceWorkerEmployee();
        
        b2.setRatePerPiece(100);
        b2.setTotalPiecesFinished(100);
        b2.displayPieceWorkerEmployee();
        
        b3.displayPieceWorkerEmployee();
        
        b4.setEmpID(4);
        b4.setEmpName("Jansen Choi");
        b4.displayPieceWorkerEmployee();
        
        b5.displayPieceWorkerEmployee();
        
//        CommissionEmployee
        CommissionEmployee c1 = new CommissionEmployee();
        CommissionEmployee c2 = new CommissionEmployee(e1);
        CommissionEmployee c3 = new CommissionEmployee(e2, 100000);
        CommissionEmployee c4 = new CommissionEmployee(100000);
        CommissionEmployee c5 = new CommissionEmployee(100000, 5, "Jose Delgado");
        
        c1.setEmpID(10);
        c1.setEmpName("Josh Lui");
        c1.setTotalSales(100000);
        c1.displayCommissionEmployee();
        
        c2.setTotalSales(100000);
        c2.displayCommissionEmployee();
        
        c3.displayCommissionEmployee();
        
        c4.setEmpID(4);
        c4.setEmpName("Jansen Choi");
        c4.displayCommissionEmployee();
        
        c5.displayCommissionEmployee();
        
//        BasedPlusCommissionEmployee
        BasedPlusCommissionEmployee d1 = new BasedPlusCommissionEmployee();
        BasedPlusCommissionEmployee d2 = new BasedPlusCommissionEmployee(e1);
        BasedPlusCommissionEmployee d3 = new BasedPlusCommissionEmployee(150000, e2);
        BasedPlusCommissionEmployee d4 = new BasedPlusCommissionEmployee(100000, 300);
        BasedPlusCommissionEmployee d5 = new BasedPlusCommissionEmployee(100000, 5, "Jose Delgado", 500);

        d1.setEmpID(10);
        d1.setEmpName("Josh Lui");
        d1.setTotalSales(120000);
        d1.setBaseSalary(500);
        d1.displayBCPEmployee();

        d2.setTotalSales(150000);
        d2.setBaseSalary(600);
        d2.displayBCPEmployee();

        d3.displayBCPEmployee();

        d4.setEmpID(4);
        d4.setEmpName("Jansen Choi");
        d4.displayBCPEmployee();

        d5.displayBCPEmployee();
    }
}
