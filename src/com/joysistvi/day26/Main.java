package com.joysistvi.day26;

public class Main {

    public static void testAccount(Account account) {
        account.displayAccountInfo();
    }

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("1001", "Juan Dela Cruz", 5000.0);
        CheckingAccount checking = new CheckingAccount("2001", "Maria Santos", 1000.0);

        System.out.println("=== Savings Account ===");
        testAccount(savings);
        System.out.println();

        System.out.println("=== Checking Account ===");
        testAccount(checking);
        System.out.println();

        System.out.println("=== Savings Transactions ===");
        savings.deposit(1000);
        savings.withdraw(5800);
        savings.deposit(500, "Birthday gift");
        savings.withdraw(1500, "Rent");
        System.out.println();

        System.out.println("=== Checking Transactions ===");
        checking.withdraw(2500);
        checking.withdraw(1000);
        System.out.println();

        System.out.println("=== Transfer (Savings to Checking) ===");
        savings.transfer(checking, 1000);
        System.out.println();

        System.out.println("=== Interest ===");
        savings.addInterest();
    }
}

/*
 * Part 7: OOP Concepts Used
 * Encapsulation: Account - private fields (accountNumber, accountHolder, balance) with getters/setters; setBalance() is protected, no public balance setter.
 * Inheritance: SavingsAccount and CheckingAccount extend Account and call super(...) in their constructors.
 * Polymorphism (overriding): displayAccountInfo(), deposit(), withdraw(), transfer() in SavingsAccount and CheckingAccount; toString() in Account.
 * Polymorphism (overloading): deposit(double, String) and withdraw(double, String) in SavingsAccount and CheckingAccount.
 * Abstraction (abstract class): Account with abstract method displayAccountInfo().
 * Abstraction (interfaces): Transaction, Transferable, InterestBearing, Overdraftable.
 * Constants: SavingsAccount.MIN_BALANCE, InterestBearing.INTEREST_RATE, Overdraftable.OVERDRAFT_LIMIT.
 */
