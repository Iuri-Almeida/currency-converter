package br.com.itau.letscode.currency;

import br.com.itau.letscode.converter.impl.ConversionWithValidation;

public class Euro extends ConversionWithValidation {
    @Override
    protected double getOperatingFeeValue() {
        return 6.00;
    }

    @Override
    protected double getOperatingFeePercentage() {
        return 0.00;
    }

    @Override
    public double getPrice() {
        return 0.20;
    }

    @Override
    public String getCurrency() {
        return "EUR";
    }
}
