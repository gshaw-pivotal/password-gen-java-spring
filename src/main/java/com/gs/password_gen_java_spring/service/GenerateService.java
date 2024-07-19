package com.gs.password_gen_java_spring.service;

import com.gs.password_gen_java_spring.model.GenerateRequest;

import java.util.Random;

public class GenerateService {

    private final String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";

    private final String  upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private final String  specialCharacters = "!@#$%^&*-_?";

    private final int specialCharacterCount = 11;

    public String generate(GenerateRequest request) {
        Random random = new Random();

        StringBuilder generatedPasswordBuilder = new StringBuilder();

        int charType;

        for (int i = 0; i < request.getLength(); i++) {
            if (i == 0 && request.isStartWithLetterOrNumber()) {
                charType = random.nextInt(3);
            } else {
                charType = random.nextInt(4);
            }

            switch (charType) {
                case 0:
                    //Lowercase letter
                    generatedPasswordBuilder.append(lowerCaseLetters.charAt(random.nextInt(26)));
                    break;
                case 1:
                    //Uppercase letter
                    generatedPasswordBuilder.append(upperCaseLetters.charAt(random.nextInt(26)));
                    break;
                case 2:
                    //Number
                    generatedPasswordBuilder.append(random.nextInt(10));
                    break;
                case 3:
                    //Special char
                    generatedPasswordBuilder.append(specialCharacters.charAt(random.nextInt(specialCharacterCount)));
                    break;
            }
        }

        return generatedPasswordBuilder.toString();
    }
}
