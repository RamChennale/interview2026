package com.selenium.A2_javaInterviewEx.exceptionExample;

public class BankAccount {

        public static void main(String[] args) {
            BankAccount account = new BankAccount();

            try {
                System.out.println("Attempting to withdraw $600.00...");
                account.withdraw(600.00);
            } catch (InsufficientFundsException e) {
                // Handle the specific business error elegantly
                System.err.println("Error: " + e.getMessage());
                System.err.println("You are missing: $" + e.getShortfall());
            }
        }

    private double balance = 500.00;
    // The method signature must explicitly state it can throw a checked exception
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            double missingAmount = amount - balance;
            // Triggering our custom exception with context
            throw new InsufficientFundsException("Transaction failed: Insufficient balance.", missingAmount);
        }
        balance -= amount;
        System.out.println("Successful withdrawal! Remaining balance: $" + balance);
    }
}
