package com.example;

public class LoyaltyStatus {

    public enum Level {
        REGULAR, SILVER, GOLD
    }

    private Level level;

    public LoyaltyStatus(Level level) {
        this.level = level;
    }

    public double applyDiscount(double total) {

        switch (level) {
            case SILVER:
                return total * 0.95;

            case GOLD:
                return total * 0.90;

            default:
                return total;
        }
    }
}
