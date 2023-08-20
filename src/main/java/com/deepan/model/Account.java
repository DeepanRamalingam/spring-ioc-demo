package com.deepan.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "defaultAccount")
public class Account {

    private int accNo;
    private String branchName;

    private String bankName;

    private double balance;

    @Autowired
    private Address address;


    public Account(int accNo, String branchName, String bankName, double balance) {
        this.accNo = accNo;
        this.branchName = branchName;
        this.bankName = bankName;
        this.balance = balance;
    }

    public Account(int accNo, String branchName, String bankName) {
        this.accNo = accNo;
        this.branchName = branchName;
        this.bankName = bankName;
    }


    public Account(){}



    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAccNo() {
        return accNo;
    }


//    ============================================================
    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

//    =====================================================


    @Override
    public String toString() {
        return "Account{" +
                "accNo=" + accNo +
                ", branchName='" + branchName + '\'' +
                ", bankName='" + bankName + '\'' +
                ", balance=" + balance +
                ", address=" + address +
                '}';
    }
}

//encapuslation

//hide data
//access data via methods


//1. fields
//2. constrcutors
//3. getter and setter
//4. toString()