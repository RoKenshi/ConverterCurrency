package org.example.service;

public class UserInteraction {
    private final UserInput userInput;

    public UserInteraction(UserInput userInput) {
        this.userInput = userInput;
    }

    public int getIntUserInput(String prompt) {
        userInput.showToUser(prompt);
        String input = userInput.getFromUser();
        return Integer.parseInt(input);
    }
    public String getStringUserInput(String prompt) {
        userInput.showToUser(prompt);
        return userInput.getFromUser();
    }
}
