package br.com.itau.letscode.converter.factory;

import br.com.itau.letscode.converter.impl.ConversionWithValidation;
import br.com.itau.letscode.currency.*;

import java.util.Map;
import java.util.Optional;

public class ConversionFactory {

    private final Map<Integer, ConversionWithValidation> convertibleMap = Map.of(
            1, new Dollar(),
            2, new Euro(),
            3, new ArgentinianPeso(),
            4, new ChileanPeso(),
            5, new PoundSterling(),
            6, new Yen()
    );

    public ConversionWithValidation create(int conversionKey) {
        return Optional.ofNullable(this.convertibleMap.get(conversionKey))
                .orElseThrow(() -> new IllegalArgumentException("Falha ao acessar a chave = " + conversionKey + "."));
    }

}
