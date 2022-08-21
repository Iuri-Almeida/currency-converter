package br.com.itau.letscode.model;

public class CurrencyRegister {

    private String fromCurrency;
    private String toCurrency;
    private Double total;
    private Double price;

    public CurrencyRegister(String fromCurrency, String toCurrency, Double total, Double price) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.total = total;
        this.price = price;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public Double getTotal() {
        return total;
    }

    public Double getPrice() {
        return price;
    }

}
