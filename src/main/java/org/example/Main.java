package org.example;


import org.example.model.QouterDTO;
import org.example.model.Wallet;
import org.example.service.ConverterCurrencyService;
import org.example.service.InputDataService;
import org.example.util.QuoterLoader;


import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    private static final String FILE_PATH = "./src/main/resources/opt/quoter2.json";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double sum = InputDataService.getSum(scanner);

        Wallet wallet = new Wallet(sum);

        String currencyType = InputDataService.getCurrencyType(scanner);


        try {

            QouterDTO qouterDTO = QuoterLoader.readJson(FILE_PATH);
            ConverterCurrencyService converterCurrency = new ConverterCurrencyService(qouterDTO);
            double total = converterCurrency.convertCurrency(wallet, currencyType);

            System.out.printf("У вас на счету %s %s", total, currencyType);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}