package com.company;

public class Main {

    public static void main(String[] args) {
	    Paycheck c1 = new Paycheck(42.0, 22.0);
        System.out.println(c1.regularPay());
        System.out.println(c1.overTimePay());
        System.out.println(c1.totalPay());
    }
}
