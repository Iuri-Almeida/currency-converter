package br.com.itau.letscode;

import br.com.itau.letscode.converter.impl.ConversionWithValidation;
import br.com.itau.letscode.converter.factory.ConversionFactory;
import br.com.itau.letscode.model.CurrencyRegister;
import br.com.itau.letscode.service.ColorService;
import br.com.itau.letscode.service.RegisterService;
import br.com.itau.letscode.ui.UI;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ColorService colorService = new ColorService();
        RegisterService registerService = new RegisterService();

        boolean stop;
        do {
            try {
                UI.clearConsole();
                UI.printBanner();

                colorService.yellow("Digite o valor em reais: R$ ");
                double value = readDouble(sc);

                UI.printConversionMenu();

                colorService.green("\n\n-> ");
                int conversionKey = readInteger(sc);

                ConversionWithValidation currency = getCurrency(conversionKey);
                registerService.addRegister(new CurrencyRegister("BRL", currency.getCurrency(), value, currency.getPrice()));

                double result = currency.convert(value);

                UI.printResult(value, currency.getIOF(value), currency.getOperatingFee(value), currency.getCurrency(), result);

            } catch (IllegalArgumentException e) {
                colorService.red("\n" + e.getMessage());
                colorService.red("\nAperte ENTER para continuar");
                sc.nextLine();
                sc.nextLine();
            }

            boolean seeHistory = checkUserAnswer(sc, "\nVocê deseja ver o histórico? (S/N) ");
            if (seeHistory) {
                UI.printHistory(registerService.getRegisters());
            }

            stop = checkUserAnswer(sc, "\nVocê deseja continuar? (S/N) ");

        } while (stop);

        sc.close();
    }

    private static double readDouble(Scanner sc) {
        try {
            return Double.parseDouble(sc.next());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Falha lendo o valor digitado.");
        }
    }

    private static int readInteger(Scanner sc) {
        try {
            return Integer.parseInt(sc.next());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Falha lendo o valor digitado.");
        }
    }

    private static ConversionWithValidation getCurrency(int conversionKey) {
        return new ConversionFactory().create(conversionKey);
    }

    private static boolean checkUserAnswer(Scanner sc, String txt) {
        String answer = validateUserAnswer(sc, txt);
        return answer.startsWith("S");
    }

    private static String validateUserAnswer(Scanner sc, String txt) {
        String answer;
        do {
            new ColorService().purple(txt);
            answer = sc.next().toUpperCase();
        } while (!answer.startsWith("S") && !answer.startsWith("N"));

        return answer;
    }

}
