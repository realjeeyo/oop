/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mytime;

import java.util.Objects;

/**
 *
 * @author User
 */
public class MyTime {
    private int hours;
    private int minutes;
    private int seconds;
    private String meridian;
    
    public MyTime() {
        
    }
    
    public MyTime(int hrs, int min, int sec, String meridian) {
        setHours(hrs);
        setMinutes(min);
        setSeconds(sec);
        this.meridian = meridian;
    }
    
    public void setHours(int hours){
        this.hours = (hours <= 12 && hours > 0) ? hours : 12;
    }
    
    public int getHours() {
        return hours;
    }
    
    public int getMinutes(){
        return minutes;
    }
    
    public void setMinutes(int minutes){
        this.minutes = (minutes < 60 && minutes >= 0) ? minutes : 0;
    }
    
    public int getSeconds(){
        return seconds;
    }
    
    public void setSeconds(int seconds){
        this.seconds = (seconds < 60 && seconds >= 0) ? seconds : 0;
    }
    
    public void advanceTime(int seconds){
        this.seconds += seconds;
        int minuteRollover = this.seconds / 60;
        this.seconds %= 60;
        this.minutes += minuteRollover;
        int hourRollover = this.minutes / 60;
        this.minutes %= 60;
        this.hours += hourRollover;
        
        if (this.hours >= 24) {
            this.hours %= 24; 
        }
        
        if (this.hours == 0) {
            if (this.meridian.equals("AM")){
                this.meridian = "PM";
            } else {
                this.meridian = "AM";
            }
        } else if (this.hours == 12) {
            if (this.meridian.equals("AM")){
                this.meridian = "PM";
            } else {
                this.meridian = "AM";
            }
        } else if (this.hours > 12) {
            if (this.meridian.equals("AM")){
                this.meridian = "PM";
            } else {
                this.meridian = "AM";
            }
        } else {
            this.meridian = "AM";  
        }
    } // Move by how many seconds (seconds is input).
    
    public void tickBySecond(){ // Advance the time by 1 second, if it goes beyond 59 change the minutes and hours respectively.
        ++this.seconds;
        if (this.seconds > 59){
            this.tickByMinute();
            this.seconds = 0;
        }
    }
    
    public void tickByMinute(){
        ++this.minutes;
        if (this.minutes > 59){
            this.tickByHour();
            this.minutes = 0;
        }
    } // Increment the minute by 1 minute, if it goes beyond 59 change the hours respectively.
    
    public void tickByHour(){
        ++this.hours;
        if (this.hours > 12){
            if (this.meridian.equals("AM")){
                this.meridian = "PM";
            } else if (this.meridian.equals("PM")){
                this.meridian = "AM";
            }
            this.hours = 1;
        }
    } // Increment the hour by 1 hour, if it goes beyond 12, reset back to 1 and change meridian from AM to PM or PM to AM respectively.
    
    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d %s", hours, minutes, seconds, meridian);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.hours;
        hash = 59 * hash + this.minutes;
        hash = 59 * hash + this.seconds;
        hash = 59 * hash + Objects.hashCode(this.meridian);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MyTime other = (MyTime) obj;
        if (this.hours != other.hours) {
            return false;
        }
        if (this.minutes != other.minutes) {
            return false;
        }
        if (this.seconds != other.seconds) {
            return false;
        }
        return Objects.equals(this.meridian, other.meridian);
    }


    
    
}
