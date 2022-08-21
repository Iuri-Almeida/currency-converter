package br.com.itau.letscode.currency;

import br.com.itau.letscode.converter.impl.ConversionWithValidation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class DollarTest {

    @Test
    void getOperatingFeeValue() {
        double operatingFeeValue = new Dollar().getOperatingFeeValue();

        Assertions.assertEquals(5.00, operatingFeeValue);
    }

    @Test
    void getOperatingFeePercentage() {
        double operatingFeePercentage = new Dollar().getOperatingFeePercentage();

        Assertions.assertEquals(0.03, operatingFeePercentage);
    }

    @Test
    void getPrice() {
        double price = new Dollar().getPrice();

        Assertions.assertEquals(0.19, price);
    }

    @Test
    void getCurrency() {
        String currency = new Dollar().getCurrency();

        Assertions.assertEquals("USD", currency);
    }

    @Test
    void convert() {
        ConversionWithValidation conversion = new Dollar();

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> {
                    conversion.convert(-100.00);
                });
    }
}