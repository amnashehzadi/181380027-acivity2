package com.employee;

public class CommissionedEmployee extends Employee{
    private double sales;
    private double commissionRate;

    public CommissionedEmployee(int empId,String name,double taxRate,double sales,double commissionRate){
        super(empId,name,taxRate);
        this.sales=sales;
        this.commissionRate=commissionRate;

    }

    public double getSales(){
        return sales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }
    public void setSales(double sales){
        this.sales=sales;
    }

    public void setCommissionRate(double commissionRate){
        this.commissionRate=commissionRate;
    }

    public String toString(){
        return "The salary of "+getName()+" is "+calculateSalary();
    }

    public double calculateSalary(){
        double grossRate=getSales()+getCommissionRate();
        double tax=grossRate+getTextRate();
        return tax=grossRate;

        }
    }
