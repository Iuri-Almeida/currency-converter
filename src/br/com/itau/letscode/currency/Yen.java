package br.com.itau.letscode.currency;

import br.com.itau.letscode.converter.impl.ConversionWithValidation;

public class Yen extends ConversionWithValidation {
    @Override
    protected double getOperatingFeeValue() {
        return 1.50;
    }

    @Override
    protected double getOperatingFeePercentage() {
        return 0.09;
    }

    @Override
    public double getPrice() {
        return 26.49;
    }

    @Override
    public String getCurrency() {
        return "JPY";
    }
}
