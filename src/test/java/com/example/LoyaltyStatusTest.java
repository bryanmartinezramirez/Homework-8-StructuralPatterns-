package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoyaltyStatusTest {

    @Test
    void testRegularDiscount() {
        LoyaltyStatus status =
            new LoyaltyStatus(LoyaltyStatus.Level.REGULAR);

        assertEquals(100.00, status.applyDiscount(100), 0.001);
    }

    @Test
    void testSilverDiscount() {
        LoyaltyStatus status =
            new LoyaltyStatus(LoyaltyStatus.Level.SILVER);

        assertEquals(95.00, status.applyDiscount(100), 0.001);
    }

    @Test
    void testGoldDiscount() {
        LoyaltyStatus status =
            new LoyaltyStatus(LoyaltyStatus.Level.GOLD);

        assertEquals(90.00, status.applyDiscount(100), 0.001);
    }
}
