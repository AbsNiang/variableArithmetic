package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //System.out.println("What is your first number?");
        //int firstNum = input.nextInt();
        //System.out.println("What is your second number?");
        //int secNum = input.nextInt();
        // double total = (double) firstNum / secNum;
        // System.out.println(total);
        //System.out.println(17 % 5);
        //if ((17 % 5) == 0) {
        // System.out.println("number is divisible by 5");
        //Scanner input = new Scanner(System.in);
        // System.out.println("Type a number");
        // int number = input.nextInt();
        // double evenTest = (double) number % 2;
        // if(evenTest == 0); {
        //     System.out.println("number is even");
        // }
        Scanner input = new Scanner(System.in);
        System.out.println("What is the employee name?");
        String employeeName = input.next();
        System.out.println("How many hours has the employee worked this week?");
        int employeeHours = input.nextInt();
        final double hourlyWage = (double) 7.45;
        final int maxHours = 45;
        if (employeeHours > maxHours) {
            int overtime = employeeHours - maxHours;
            double overtimePay = overtime * 1.5 * hourlyWage;
            double generalPay = overtime * hourlyWage;
            double totalPay = generalPay + overtimePay;
            System.out.println("the total pay for " + employeeName + " is: " + totalPay);
            double taxedPay = totalPay * 0.8;
            System.out.println("The money after tax is: " + taxedPay);

        } else {
            double totalPay = employeeHours * hourlyWage;
            System.out.println("the total pay for " + employeeName + " is: " + totalPay);
            double taxedPay = totalPay * 0.8;
            System.out.println("The money after tax is: " + taxedPay);
        }
    }
}

