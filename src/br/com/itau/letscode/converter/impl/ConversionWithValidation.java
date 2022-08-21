package br.com.itau.letscode.converter.impl;

import br.com.itau.letscode.converter.Convertible;
import br.com.itau.letscode.converter.Validatable;

public abstract class ConversionWithValidation implements Convertible, Validatable {

    @Override
    public final double convert(double value) {
        if (this.isValid(value)) {
            return this.doConvert(value);
        }
        throw new IllegalArgumentException("Falha ao converter o valor = " + value + ".");
    }

    @Override
    public final boolean isValid(double value) {
        return value > 0;
    }

    private double doConvert(double value) {
        return (value - this.getIOF(value) - this.getOperatingFee(value)) * this.getPrice();
    }

    public double getIOF(double value) {
        return value * 0.011;
    }

    public double getOperatingFee(double value) {
        return this.getOperatingFeeValue() + value * this.getOperatingFeePercentage();
    }

    protected abstract double getOperatingFeeValue();

    protected abstract double getOperatingFeePercentage();

    public abstract double getPrice();

    public abstract String getCurrency();
}
