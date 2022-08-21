package br.com.itau.letscode.currency;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class YenTest {

    @Test
    void getOperatingFeeValue() {
        double operatingFeeValue = new Yen().getOperatingFeeValue();

        Assertions.assertEquals(1.50, operatingFeeValue);
    }

    @Test
    void getOperatingFeePercentage() {
        double operatingFeePercentage = new Yen().getOperatingFeePercentage();

        Assertions.assertEquals(0.09, operatingFeePercentage);
    }

    @Test
    void getPrice() {
        double price = new Yen().getPrice();

        Assertions.assertEquals(26.49, price);
    }

    @Test
    void getCurrency() {
        String currency = new Yen().getCurrency();

        Assertions.assertEquals("JPY", currency);
    }
}