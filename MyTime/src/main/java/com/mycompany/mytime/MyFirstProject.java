/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.mytime;

/**
 *
 * @author User
 */
public class MyFirstProject {

    public static void main(String[] args) {
        MyTime x = new MyTime(11, 58, 30, "PM");

        System.out.println(x);
        x.tickBySecond();
        System.out.println(x);
        x.tickBySecond();
        System.out.println(x);

        x.advanceTime(86400);
        System.out.println(x);
    }
}
