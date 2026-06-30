package Projectss;

import java.util.*;

// Banking System
class bankingSyster {

    int accno;
    String name;
    double balance;
    double withdrawl_amount;
    double deposit_amount;

    bankingSyster(int acc, String nm, double bal) {
        this.accno = acc;
        this.name = nm;
        this.balance = bal;
    }

    void deposit(double amt) {
        balance = balance + amt;

        System.out.println("Your Account is Deposited with Rs. " + amt);

    }

    public static void main(String[] args) {

    }
}
