package br.com.itau.letscode.currency;

import br.com.itau.letscode.converter.impl.ConversionWithValidation;

public class PoundSterling extends ConversionWithValidation {
    @Override
    protected double getOperatingFeeValue() {
        return 3.00;
    }

    @Override
    protected double getOperatingFeePercentage() {
        return 0.05;
    }

    @Override
    public double getPrice() {
        return 0.16;
    }

    @Override
    public String getCurrency() {
        return "GBP";
    }
}
