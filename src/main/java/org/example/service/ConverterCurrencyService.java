package org.example.service;

import org.example.model.Rates;
import org.example.model.UserWallet;

public class ConverterCurrencyService {

    Rates rates;

    public ConverterCurrencyService(Rates rates) {
        this.rates = rates;
    }

    public Double convertCurrency(UserWallet userWallet) {
        Double longNumber = userWallet.getBalance() / typeCurrency(userWallet.getTypeQouter());
        return roundDouble(longNumber);
    }

    private static Double roundDouble(Double longNumber) {
        longNumber = (double) Math.round(longNumber * 100);
        longNumber = longNumber / 100;
        return longNumber;
    }


    public Double typeCurrency(String typeCurrency){
        if(typeCurrency.equals("usd")){
           return rates.getUsd();
        } else if (typeCurrency.equals("eur")){
            return rates.getEur();
        } else {
            throw new IllegalArgumentException();
        }

    }
    
    
}
