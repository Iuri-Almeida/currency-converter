package br.com.itau.letscode.converter.impl;

import br.com.itau.letscode.currency.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversionWithValidationTest {

    @Test
    void convert() {
        ConversionWithValidation conversionArgentinianPeso = new ArgentinianPeso();
        ConversionWithValidation conversionChileanPeso = new ChileanPeso();
        ConversionWithValidation conversionDollar = new Dollar();
        ConversionWithValidation conversionEuro = new Euro();
        ConversionWithValidation conversionPoundSterling = new PoundSterling();
        ConversionWithValidation conversionYen = new Yen();

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> {
                    conversionArgentinianPeso.convert(-100.00);
                    conversionChileanPeso.convert(-100.00);
                    conversionDollar.convert(-100.00);
                    conversionEuro.convert(-100.00);
                    conversionPoundSterling.convert(-100.00);
                    conversionYen.convert(-100.00);
                });
    }

}