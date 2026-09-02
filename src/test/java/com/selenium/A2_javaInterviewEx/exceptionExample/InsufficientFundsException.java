package com.selenium.A2_javaInterviewEx.exceptionExample;

// Extending Exception makes this a Checked Exception
public class InsufficientFundsException extends Exception {

    // Optional custom field to hold extra data
    private final double shortfall;

    // Constructor that accepts a message and the specific custom metric
    public InsufficientFundsException(String message, double shortfall) {
        // Pass the error message to the parent Exception class
        super(message);
        this.shortfall = shortfall;
    }

    // Getter to retrieve the specific error metric later
    public double getShortfall() {
        return shortfall;
    }
}
