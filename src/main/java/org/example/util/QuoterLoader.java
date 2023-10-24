package org.example.util;


import com.google.gson.Gson;
import org.example.model.QouterDTO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class QuoterLoader{

    private QuoterLoader(){};

    public static QouterDTO readJson(String filename) throws FileNotFoundException {

        Gson gson = new Gson();
        BufferedReader br = new BufferedReader(new FileReader(filename));

        return gson.fromJson(br, QouterDTO.class);
    }

}
