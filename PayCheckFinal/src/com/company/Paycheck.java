package com.company;

public class Paycheck implements payroll{
    private double hrsWorked;
    private double rate;
    private double hrsOT;
    private double total;

    public Paycheck(){
        hrsWorked = 0.0;
        rate = 0.0;
    }

    //    getters
    public double getHours(){
        return hrsWorked;
    }
    public double getPay(){
        return rate;
    }

    //    setters
    public void setHours(double hoursWorked){
        hrsWorked = hoursWorked;
    }
    public void setPay(double payRate){
        rate = payRate;
    }

    public Paycheck(double hoursWorked, double payRate){
        hrsWorked = hoursWorked;
        rate = payRate;
    }

    @Override
    public double regularPay() {
        total = 40 * rate;
        return total;
    }

    @Override
    public double overTimePay() {
        hrsOT = hrsWorked - 40;
        total = hrsOT * (rate * 1.5);
        return total;
    }

    @Override
    public double totalPay() {
        double t1 = regularPay();
        double t2 = overTimePay();
        return t1 + t2;
    }
}
