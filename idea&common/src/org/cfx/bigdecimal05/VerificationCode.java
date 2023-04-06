package org.cfx.bigdecimal05;

import java.util.Random;

/**
 * @author RTX 9090
 */
public class VerificationCode {
    public static void main(String[] args) {
        int codeLength = 8; // Change this to the desired length of the code
        String code = generateCode(codeLength);
        System.out.println("Verification code: " + code);

        String code2 = generateCode2(10);
        System.out.println("Verification code: " + code2);
    }

    public static String generateCode(int length) {
        String chars = "123456789abcdefghijklmnpqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());
            sb.append(chars.charAt(index));
        }
        return sb.toString();
    }

    public static String generateCode2(int length) {
        Random random = new Random();
        StringBuilder codeBuilder = new StringBuilder();
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String characters = uppercaseLetters + lowercaseLetters + numbers;

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            codeBuilder.append(randomChar);
        }

        return codeBuilder.toString();
    }

}

