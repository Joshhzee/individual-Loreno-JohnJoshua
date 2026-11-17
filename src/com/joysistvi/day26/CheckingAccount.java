package com.joysistvi.day26;

public class CheckingAccount extends Account
        implements Transaction, Transferable, Overdraftable {

    public CheckingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void displayAccountInfo() {
        System.out.println(toString());
        System.out.println("Overdraft Limit: " + OVERDRAFT_LIMIT);
    }

    @Override
    public boolean isWithinOverdraft(double amount) {
        return getBalance() - amount >= -OVERDRAFT_LIMIT;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        setBalance(getBalance() + amount);
        System.out.println("Deposited " + amount + ". New balance: " + getBalance());
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return false;
        }
        if (!isWithinOverdraft(amount)) {
            System.out.println("Withdrawal failed: exceeds the overdraft limit of " + OVERDRAFT_LIMIT);
            return false;
        }
        setBalance(getBalance() - amount);
        System.out.println("Withdrew " + amount + ". New balance: " + getBalance());
        return true;
    }

    @Override
    public boolean transfer(Transaction target, double amount) {
        System.out.println("Transferring " + amount + "...");
        if (withdraw(amount)) {
            target.deposit(amount);
            System.out.println("Transfer successful.");
            return true;
        }
        System.out.println("Transfer failed.");
        return false;
    }

    // Part 5: Method overloading
    public void deposit(double amount, String remarks) {
        deposit(amount);
        System.out.println("Remarks: " + remarks);
    }

    public boolean withdraw(double amount, String remarks) {
        boolean result = withdraw(amount);
        System.out.println("Remarks: " + remarks);
        return result;
    }
}
