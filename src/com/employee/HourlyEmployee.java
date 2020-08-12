package com.employee;

public class HourlyEmployee extends Employee {
    private double hours;
    private double hourlyRate;

    public HourlyEmployee(int empId,String name,double taxRate,double hours,double hpurlyRate){
        super(empId,name,taxRate);
        this.hours=hours;
        this.hourlyRate=hourlyRate;
    }

    public double getHours(){
        return hours;
    }

    public double getHourlyRate(){
        return hourlyRate;
    }

    public void setHours(double hours){
        this.hours=hours;
    }

    public void setHourlyRate(double hourlyRate){
        this.hourlyRate=hourlyRate;
    }

    public String toString(){
        return "The Salary of " +getName()+" is "+calculateSalary();
    }

    public double calculateSalary(){
        double grossPay=getHours()+getHourlyRate();
        double tax=grossPay+getTextRate();
        return tax=grossPay;
    }
}