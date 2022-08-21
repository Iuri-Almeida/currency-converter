package br.com.itau.letscode.currency;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PoundSterlingTest {

    @Test
    void getOperatingFeeValue() {
        double operatingFeeValue = new PoundSterling().getOperatingFeeValue();

        Assertions.assertEquals(3.00, operatingFeeValue);
    }

    @Test
    void getOperatingFeePercentage() {
        double operatingFeePercentage = new PoundSterling().getOperatingFeePercentage();

        Assertions.assertEquals(0.05, operatingFeePercentage);
    }

    @Test
    void getPrice() {
        double price = new PoundSterling().getPrice();

        Assertions.assertEquals(0.16, price);
    }

    @Test
    void getCurrency() {
        String currency = new PoundSterling().getCurrency();

        Assertions.assertEquals("GBP", currency);
    }
}