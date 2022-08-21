package br.com.itau.letscode.currency;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArgentinianPesoTest {

    @Test
    void getOperatingFeeValue() {
        double operatingFeeValue = new ArgentinianPeso().getOperatingFeeValue();

        Assertions.assertEquals(2.50, operatingFeeValue);
    }

    @Test
    void getOperatingFeePercentage() {
        double operatingFeePercentage = new ArgentinianPeso().getOperatingFeePercentage();

        Assertions.assertEquals(0.015, operatingFeePercentage);
    }

    @Test
    void getPrice() {
        double price = new ArgentinianPeso().getPrice();

        Assertions.assertEquals(26.24, price);
    }

    @Test
    void getCurrency() {
        String currency = new ArgentinianPeso().getCurrency();

        Assertions.assertEquals("ARS", currency);
    }

}