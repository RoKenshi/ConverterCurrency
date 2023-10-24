package org.example.service;

import java.util.Scanner;

public class InputDataService {
    public static String getCurrencyType(Scanner scanner) {
        System.out.println("Выберите валюту для конвертации: usd, eur) ");
        String currencyType = scanner.nextLine();
        if (!currencyType.equals("usd") && !currencyType.equals("eur")) {
            throw new IllegalArgumentException("There is no such currency type");
        }
        return currencyType;
    }

    public static Double getSum(Scanner scanner) {
        System.out.println("Введите сумму для обмена: ");
        Double sum = scanner.nextDouble();
        if (sum <= 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        scanner.nextLine();
        return sum;
    }
}
