package br.com.itau.letscode.currency;

import br.com.itau.letscode.converter.impl.ConversionWithValidation;

public class Dollar extends ConversionWithValidation {
    @Override
    protected double getOperatingFeeValue() {
        return 5.00;
    }

    @Override
    protected double getOperatingFeePercentage() {
        return 0.03;
    }

    @Override
    public double getPrice() {
        return 0.19;
    }

    @Override
    public String getCurrency() {
        return "USD";
    }
}
