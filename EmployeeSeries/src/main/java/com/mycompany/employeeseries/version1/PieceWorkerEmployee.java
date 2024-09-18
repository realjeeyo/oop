/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version1;

/**
 *
 * @author User
 */
public class PieceWorkerEmployee {
    private int totalPiecesFinished;
    private double ratePerPiece;
    private String empName;
    private int empID;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }
    
    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece, String empName, int empID) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
        this.empName = empName;
        this.empID = empID;
    }
    
    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
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
        return (totalPiecesFinished * ratePerPiece) + (totalPiecesFinished / 100) * 10;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nEmployee ID: ").append(empID);
        sb.append("\nEmployee Name: ").append(empName);
        sb.append("\nTotal Pieces Finished: ").append(totalPiecesFinished);
        sb.append("\nRate Per Piece: ").append(ratePerPiece);
        return sb.toString();
    }
    
    public void displayHourlyEmployee(){
        System.out.println(this.toString());
    }
    
}
