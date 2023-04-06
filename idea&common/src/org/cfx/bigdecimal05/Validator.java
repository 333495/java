package org.cfx.bigdecimal05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {
    public static void main(String[] args) {
        String idNumber = "110101199003077777";
        boolean isValidIdNumber = Validator.validateIdNumber(idNumber);
        System.out.println(isValidIdNumber); // prints true

        String phoneNumber = "13812345678";
        boolean isValidPhoneNumber = Validator.validatePhoneNumber(phoneNumber);
        System.out.println(isValidPhoneNumber); // prints true

        String emailAddress = "1905333495@qq.com";
        boolean isValidEmailAddress = Validator.validateEmailAddress(emailAddress);
        System.out.println(isValidEmailAddress);// prints true

    }
    public static boolean validateIdNumber(String idNumber) {
        String pattern = "^[1-9]\\d{5}(19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[1-2]\\d|3[0-1])\\d{3}[0-9Xx]$";
        return Pattern.matches(pattern, idNumber);
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        String pattern = "^1[3-9]\\d{9}$";
        return Pattern.matches(pattern, phoneNumber);
    }

    public static boolean validateEmailAddress(String emailAddress) {
        String pattern = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        return Pattern.matches(pattern, emailAddress);
    }
}

class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        int guess = -1;

        while (guess != targetNumber) {
            System.out.print("Guess a number: ");
            guess = scanner.nextInt();

            if (guess < targetNumber) {
                System.out.println("Too low!");
            } else if (guess > targetNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("You got it!");
            }
        }
        scanner.close();
    }
}


class GuessingGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetNumber = (int) (Math.random() * 100 ) + 1;
        System.out.println(targetNumber);
        int guess = 0;
        int numGuesses = 0;

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");

            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                numGuesses++;

                if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("You got it! It took you " + numGuesses + " guesses.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
        scanner.close();
    }
}



