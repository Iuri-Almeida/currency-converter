package br.com.itau.letscode.currency;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EuroTest {

    @Test
    void getOperatingFeeValue() {
        double operatingFeeValue = new Euro().getOperatingFeeValue();

        Assertions.assertEquals(6.00, operatingFeeValue);
    }

    @Test
    void getOperatingFeePercentage() {
        double operatingFeePercentage = new Euro().getOperatingFeePercentage();

        Assertions.assertEquals(0.00, operatingFeePercentage);
    }

    @Test
    void getPrice() {
        double price = new Euro().getPrice();

        Assertions.assertEquals(0.20, price);
    }

    @Test
    void getCurrency() {
        String currency = new Euro().getCurrency();

        Assertions.assertEquals("EUR", currency);
    }
}