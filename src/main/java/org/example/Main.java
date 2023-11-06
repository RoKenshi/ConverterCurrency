package org.example;

import org.example.model.UserWallet;
import org.example.service.*;

public class Main {



    public static void main(String[] args) {
        RatesGetter ratesGetter = new RatesGetterFromFile();
        UserInput userInput = new UserInputImpl();
        UserInteraction userInteraction = new UserInteraction(userInput);
        UserWallet userWallet = new UserWallet();
        new QouterApp(ratesGetter, userInput, userInteraction, userWallet)
                .run();
    }

}