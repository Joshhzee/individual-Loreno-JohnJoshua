package com.joysistvi.day26;

public interface Transaction {
    void deposit(double amount);
    boolean withdraw(double amount);
}
