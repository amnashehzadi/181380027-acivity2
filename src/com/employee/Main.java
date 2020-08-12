package com.employee;

public class Main{
    public static void main(String[] args){
        Employee[] e1=new Employee[6];
        e1[0]=new SalariedEmployee(1,"Zohaib",16.1,20000);
        e1[1]=new SalariedEmployee(2,"Zeeshan",13.2,17000);
        e1[2]=new SalariedEmployee(3,"Subhan",15.7,15000);
        e1[3]=new SalariedEmployee(4,"Mahnoor",9.0,12000);
        e1[4]=new SalariedEmployee(5,"Maheen",10.9,10000);
        e1[5]=new SalariedEmployee(6,"iqra",11.6,2000);
        for (int i=0;i<e1.length;i++){
            System.out.println(e1[i].toString());
        }
    }
}