package br.com.itau.letscode.service;

import br.com.itau.letscode.model.CurrencyRegister;

import java.util.ArrayList;
import java.util.List;

public class RegisterService {

    private final List<CurrencyRegister> registers = new ArrayList<>();

    public List<CurrencyRegister> getRegisters() {
        return this.registers;
    }

    public void addRegister(CurrencyRegister currencyRegister) {
        this.registers.add(currencyRegister);
    }
}
