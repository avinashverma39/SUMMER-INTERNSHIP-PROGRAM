// package Projectss;

import java.util.*;

// Banking System
class bankingSyster {

    int accno;
    String name;
    String gmail;
    double balance;
    double withdrawl_amount;
    double deposit_amount;

    bankingSyster(int acc, String nm, double bal) {
        this.accno = acc;
        this.name = nm;
        this.balance = bal;
    }

    void acDetial() {
        System.out.println("Account Number : " + accno);
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account gmail : " + gmail);

    }

    void deposit(double amt) {
        balance = balance + amt;

        System.out.println("Your Account is Deposited with Rs. " + amt);
        System.out.println("Current Balance Amount in your account Rs." + balance);

    }

    void withdraw(double amt) {

        balance = balance - amt;

        System.out.println("Your Account is Withdrawl with Rs. " + amt);
        System.out.println("Current Balance Amount is Rs. " + balance);

    }

    public static void main(String[] args) {

    }
}
