package org.example;

import org.example.model.Rates;
import org.example.model.UserWallet;
import org.example.service.*;

import java.io.FileNotFoundException;

public class QouterApp {

    RatesGetter ratesGetter;
    UserInput userInput;
    UserInteraction userInteraction;

    UserWallet userWallet;

    public QouterApp(RatesGetter ratesGetter, UserInput userInput,
                     UserInteraction userInteraction, UserWallet userWallet) {
        this.ratesGetter = ratesGetter;
        this.userInput = userInput;
        this.userInteraction = userInteraction;
        this.userWallet = userWallet;
    }

    void run() {

        try {
            userWallet.setBalance(
                    this.userInteraction.getIntUserInput("Введите сумму для конвертации")
            );
            if (userWallet.getBalance() < 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            System.out.println("Баланс не может быть отрицательным");
            System.exit(0);
        }

        try {
            userWallet.setTypeQouter(
                    this.userInteraction.getStringUserInput("Введите валюту в которую будем конвертировать")
            );
            if (!userWallet.getTypeQouter().equals("usd") && userWallet.getTypeQouter().equals("eur")) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Неверный формат валюты");
            System.exit(0);
        }


            Rates rates = ratesGetter.getCurrentRates();
            ConverterCurrencyService converterCurrencyService = new ConverterCurrencyService(rates);

            Double answer = converterCurrencyService.convertCurrency(userWallet);
            System.out.println(answer);


    }
}
