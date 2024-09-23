/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version2;

/**
 *
 * @author User
 */
public class PieceWorkerEmployee extends Employee{
    private int totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(Employee e){
        super(e.empID, e.empName);
    }
    
    public PieceWorkerEmployee(Employee e, int totalPiecesFinished, double ratePerPiece){
        super(e.empID, e.empName);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }
    
    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }
    
    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece, int empID, String empName) {
        super(empID, empName);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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
    
    public double computeSalary(){
        return (totalPiecesFinished * ratePerPiece) + (totalPiecesFinished / 100) * 10;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nRate Per Piece: ").append(ratePerPiece);
        sb.append("\nTotal Pieces Finished: ").append(totalPiecesFinished);
        return sb.toString();
    }
    
    public void displayPieceWorkerEmployee(){
        System.out.println(this.toString());
        System.out.println("\nComputed Piece Salary: ");
        System.out.println(computeSalary());
    }
    
}
