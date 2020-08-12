package com.employee;

public abstract class Employee{
    private int empId;
    private String name;
    private double taxRate;
    public Employee(){
        setEmpId(1);
        setName("Amna");
        settaxRate(20.2);
    }
    public Employee(int empId,String name,double taxRate){
        settaxRate(taxRate);
        setName(name);
        setEmpId(empId);
    }
    public int getEmpId(){
        return empId;
    }

    public String getName(){
        return name;
    }

    public double getTextRate(){
        return taxRate;
    }

    public void setEmpId(int empId){
        this.empId=empId;
    }

    public void setName(String name){
        this.name=name;
    }

    public void settaxRate(double textRate){
        this.taxRate=textRate;
    }
    public abstract double calculateSalary();
    public String toString(){
        return "The Salary is "+calculateSalary();
    }



}