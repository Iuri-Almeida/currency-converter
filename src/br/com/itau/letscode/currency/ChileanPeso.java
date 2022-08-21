package br.com.itau.letscode.currency;

import br.com.itau.letscode.converter.impl.ConversionWithValidation;

public class ChileanPeso extends ConversionWithValidation {
    @Override
    protected double getOperatingFeeValue() {
        return 10.00;
    }

    @Override
    protected double getOperatingFeePercentage() {
        return 0.025;
    }

    @Override
    public double getPrice() {
        return 174.17;
    }

    @Override
    public String getCurrency() {
        return "CLP";
    }
}
