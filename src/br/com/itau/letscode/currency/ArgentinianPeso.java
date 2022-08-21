package br.com.itau.letscode.currency;

import br.com.itau.letscode.converter.impl.ConversionWithValidation;

public class ArgentinianPeso extends ConversionWithValidation {
    @Override
    protected double getOperatingFeeValue() {
        return 2.50;
    }

    @Override
    protected double getOperatingFeePercentage() {
        return 0.015;
    }

    @Override
    public double getPrice() {
        return 26.24;
    }

    @Override
    public String getCurrency() {
        return "ARS";
    }
}
