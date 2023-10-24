package org.example.service;

import org.example.model.Wallet;

public interface Convertable {
    Double convertCurrency(Wallet balance, String currencyType);
}
