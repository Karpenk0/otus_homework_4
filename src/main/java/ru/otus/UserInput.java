package ru.otus;

import java.util.Scanner;

public class UserInput {
    private Scanner sc = new Scanner(System.in);
    // private Question AnswerIndex;
    //int maxAnswerIndex = AnswerIndex.getAnswers(); // При вызове гетера, выдаёт исключение, наверное потому что ансверс, ещё не проинициализирована.

    public int readInput(String message) {
        System.out.println(message);
        int userInput;
        // цикл проверки правильности ввода
        while (true) {
            if (sc.hasNextInt()) {
                int input = sc.nextInt();
                if (input < 5 && input > 0) {
                    userInput = input;
                    break;

                } else {

                    System.out.println("Вы ввели не допустимое число\n" + "Введите число от " + 1 + " до " + 4 /*maxAnswerIndex*/);
                }
            } else {

                System.out.println("Вы ввели не число \n" + "Введите число от " + 1 + " до " + 4/*maxAnswerIndex*/);
                sc.next();
            }
        }

        return userInput;
    }
}
