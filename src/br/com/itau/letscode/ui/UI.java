package br.com.itau.letscode.ui;

import br.com.itau.letscode.model.CurrencyRegister;
import br.com.itau.letscode.service.ColorService;

import java.io.IOException;
import java.util.List;

public class UI {

    private static final ColorService colorService = new ColorService();

    // https://stackoverflow.com/questions/2979383/how-to-clear-the-console
    public static void clearConsole() {
        try {
            windowsConsole();
        } catch (IOException | InterruptedException e) {
            linuxDistro();
        }
    }

    private static void windowsConsole() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    private static void linuxDistro() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void printConversionMenu() {
        colorService.green("\nDigite a moeda de destino:");
        colorService.green("\n1. Dólar");
        colorService.green("\n2. Euro");
        colorService.green("\n3. Peso Argentino");
        colorService.green("\n4. Peso Chileno");
        colorService.green("\n5. Libra Esterlina");
        colorService.green("\n6. Iene Japonês");
    }

    public static void printBanner() {
        colorService.blue(
                "\n,--.   ,--.                     \n" +
                "|  | ,-'  '-.  ,--,--. ,--.,--. \n" +
                "|  | '-.  .-' ' ,-.  | |  ||  | \n" +
                "|  |   |  |   \\ '-'  | '  ''  ' \n" +
                "`--'   `--'    `--`--'  `----'  \n\n"
        );
    }

    public static void printResult(double value, double iof, double operatingFee, String currency, double result) {
        colorService.cyan(String.format("\nValor em reais   -> R$ %.2f\n" +
                "IOF              -> R$ %.2f\n" +
                "Taxa de operação -> R$ %.2f\n" +
                "—-----------------------------\n" +
                "Total convertido -> %s %.2f\n\n", value, iof, operatingFee, currency, result
        ));
    }

    public static void printHistory(List<CurrencyRegister> registers) {
        int count = 1;
        for (CurrencyRegister register : registers) {
            System.out.println(String.format("%d. \nFROM: %s \nTO: %s \nTOTAL: R$ %.2f \nPRICE: R$ %.2f\n",
                    count, register.getFromCurrency(), register.getToCurrency(), register.getTotal(), register.getPrice()));
            count++;
        }
    }
}
