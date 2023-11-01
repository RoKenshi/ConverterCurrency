package org.example.service;

import com.google.gson.Gson;
import org.example.model.Rates;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class RatesGetterFromFile implements RatesGetter {

    private static final String FILE_PATH = "./src/main/resources/opt/quoter2.json";
    @Override
    public Rates getCurrentRates() throws FileNotFoundException {
        Gson gson = new Gson();
        BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));

        return gson.fromJson(br, Rates.class);
    }
}
