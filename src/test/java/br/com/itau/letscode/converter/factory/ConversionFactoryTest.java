package br.com.itau.letscode.converter.factory;

import br.com.itau.letscode.converter.impl.ConversionWithValidation;
import br.com.itau.letscode.currency.*;
import org.junit.jupiter.api.*;

class ConversionFactoryTest {

    static ConversionFactory conversionFactory;
    static int invalidKey;
    static int validKey;

    @BeforeAll
    static void setUp() {
        conversionFactory = new ConversionFactory();
        invalidKey = 8;
        validKey = 1;
    }

    @Test
    void createShouldConvertKeyToConvertWithValidation() {
        ConversionWithValidation dollar = conversionFactory.create(1);
        ConversionWithValidation euro = conversionFactory.create(2);
        ConversionWithValidation argentineanPeso = conversionFactory.create(3);
        ConversionWithValidation chileanPeso = conversionFactory.create(4);
        ConversionWithValidation poundSterling = conversionFactory.create(5);
        ConversionWithValidation yen = conversionFactory.create(6);

        Assertions.assertEquals(dollar.getClass(), Dollar.class);
        Assertions.assertEquals(euro.getClass(), Euro.class);
        Assertions.assertEquals(argentineanPeso.getClass(), ArgentinianPeso.class);
        Assertions.assertEquals(chileanPeso.getClass(), ChileanPeso.class);
        Assertions.assertEquals(poundSterling.getClass(), PoundSterling.class);
        Assertions.assertEquals(yen.getClass(), Yen.class);
    }

    @Test
    void createShouldThrownExceptionWhenInvalidKey() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            conversionFactory.create(invalidKey);
        });
    }

    @Test
    void createDoesNotThrownExceptionWhenValidKey() {
        Assertions.assertDoesNotThrow( () -> {
            conversionFactory.create(validKey);
        });
    }
}