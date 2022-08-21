package br.com.itau.letscode.currency;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ChileanPesoTest {

    @Test
    void getOperatingFeeValue() {
        double operatingFeeValue = new ChileanPeso().getOperatingFeeValue();

        Assertions.assertEquals(10.00, operatingFeeValue);
    }

    @Test
    void getOperatingFeePercentage() {
        double operatingFeePercentage = new ChileanPeso().getOperatingFeePercentage();

        Assertions.assertEquals(0.025, operatingFeePercentage);
    }

    @Test
    void getPrice() {
        double price = new ChileanPeso().getPrice();

        Assertions.assertEquals(174.17, price);
    }

    @Test
    void getCurrency() {
        String currency = new ChileanPeso().getCurrency();

        Assertions.assertEquals("CLP", currency);
    }
}