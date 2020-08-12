package com.employee;
import java.security.PublicKey;

public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(int empId,String name,double taxRate,double salary){
        super(empId,name,taxRate);
        this.salary=salary;
    }

    private double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public double calculateSalary(){
        return (getSalary()+getTextRate())-getSalary();
    }

    public String toString(){
        return "The salary of "+getName()+" is "+calculateSalary();
    }

}
