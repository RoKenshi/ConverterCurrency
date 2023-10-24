package org.example.service;


import org.example.model.Qouter;
import org.example.model.QouterDTO;
import org.example.model.Wallet;

public class ConverterCurrencyService implements Convertable {

    QouterDTO qouterDTO;

    public ConverterCurrencyService(QouterDTO qouterDTO) {
        this.qouterDTO = qouterDTO;
    }

    @Override
    public Double convertCurrency(Wallet balance, String currencyType) {
        Double longNumber = balance.getBalance() / typeCurrency(currencyType);
        return roundDouble(longNumber);
    }

    private static Double roundDouble(Double longNumber) {
        longNumber = (double) Math.round(longNumber * 100);
        longNumber = longNumber / 100;
        return longNumber;
    }


    public Double typeCurrency(String typeCurrency){
        if(typeCurrency.equals("usd")){
           return qouterDTO.getUsd();
        } else if (typeCurrency.equals("eur")){
            return qouterDTO.getEur();
        } else {
            throw new IllegalArgumentException();
        }

    }
    
    
}
