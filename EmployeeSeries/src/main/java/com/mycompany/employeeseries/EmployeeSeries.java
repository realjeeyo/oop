/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeeseries;
//import com.mycompany.employeeseries.version1.*;
//import com.mycompany.employeeseries.version2.*;
//import com.mycompany.employeeseries.version3.*;
//import com.mycompany.employeeseries.version4.*;
import com.mycompany.employeeseries.version5.*;

/**
 *
 * @author User
 */
public class EmployeeSeries {

    public static void main(String[] args) {
        //Version 4 & 5
        HourlyEmployee HE = new HourlyEmployee(140, 200, new EmpName("Jansen","Choi","Kai Xuan"),new Date(2004,8,5), new Date(2024,9,15), 101);
        PieceWorkerEmployee PWE = new PieceWorkerEmployee(15000, 40, new EmpName("Ethan","Saballa","Samson"),new Date(2004,8,5), new Date(2024,9,15), 102);
        CommissionEmployee CE = new CommissionEmployee(50000, new EmpName("Josh","Lui","Que"),new Date(2004,5,5), new Date(2024,9,15), 103);
        BasedPlusCommissionEmployee BPCE = new BasedPlusCommissionEmployee(15000, 2000, new EmpName("JL","Codilla","Basaya"),new Date(2004,5,5), new Date(2024,9,15), 104);
        
        EmployeeRoster emplist = new EmployeeRoster();
        emplist.displayAllEmployee();
        System.out.printf("Count of CE: %d\n",emplist.countCE());
        System.out.printf("Count of PWE: %d\n",emplist.countPWE());
        System.out.printf("Count of BPCE: %d\n",emplist.countBPCE());
        System.out.printf("Count of HE: %d\n\n\n",emplist.countHE());
        
        emplist.addEmployee(HE);
        emplist.addEmployee(PWE);
        emplist.addEmployee(CE);
        emplist.addEmployee(BPCE);
        emplist.displayAllEmployee();
        System.out.printf("Count of CE: %d\n",emplist.countCE());
        System.out.printf("Count of PWE: %d\n",emplist.countPWE());
        System.out.printf("Count of BPCE: %d\n",emplist.countBPCE());
        System.out.printf("Count of HE: %d\n\n\n",emplist.countHE());
        
        emplist.removeEmployee(103);
        
        emplist.displayAllEmployee();
        System.out.printf("Count of CE: %d\n",emplist.countCE());
        System.out.printf("Count of PWE: %d\n",emplist.countPWE());
        System.out.printf("Count of BPCE: %d\n",emplist.countBPCE());
        System.out.printf("Count of HE: %d\n",emplist.countHE());

//        //Version 5
//        HourlyEmployee HE = new HourlyEmployee(140, 200, new EmpName("Jansen","Choi","Kai Xuan"),new Date(2004,8,5), new Date(2024,9,15), 101);
//        PieceWorkerEmployee PWE = new PieceWorkerEmployee(15000, 40, new EmpName("Ethan","Saballa","Samson"),new Date(2004,8,5), new Date(2024,9,15), 102);
//        CommissionEmployee CE = new CommissionEmployee(50000, new EmpName("Josh","Lui","Que"),new Date(2004,5,5), new Date(2024,9,15), 103);
//        BasedPlusCommissionEmployee BPCE = new BasedPlusCommissionEmployee(15000, 2000, new EmpName("JL","Codilla","Basaya"),new Date(2004,5,5), new Date(2024,9,15), 104);
//        
//        EmployeeRoster emplist = new EmployeeRoster();
//        emplist.addEmployee(HE);
//        emplist.addEmployee(PWE);
//        emplist.addEmployee(CE);
//        emplist.addEmployee(BPCE);
//        emplist.displayAllEmployee();
//     
//        System.out.printf("Count of CE: %d\n",emplist.countCE());
//        System.out.printf("Count of PWE: %d\n",emplist.countPWE());
//        System.out.printf("Count of BPCE: %d\n",emplist.countBPCE());
//        System.out.printf("Count of HE: %d\n\n\n",emplist.countHE());
//        
//        emplist.displayCE();
    }
}
