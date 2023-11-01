package org.example.service;

import java.util.Scanner;

public class UserInputImpl implements UserInput {
    @Override
    public void showToUser(String message) {
        System.out.println(message);
    }

    @Override
    public String getFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
