package org.example.service;

import org.example.model.Rates;

import java.io.FileNotFoundException;

public interface RatesGetter {
    Rates getCurrentRates() throws FileNotFoundException;
}
