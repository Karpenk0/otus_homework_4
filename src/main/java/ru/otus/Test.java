package ru.otus;

public class Test {
    private Question[] questions;
    private int rightAnswersCount;
    private int wrongCount;


    public Test(Question[] questions) {
        this.questions = questions;
    }

    public void passTest() {
        for (int i = 0; i < questions.length; i++) {
            if (questions[i].ask() == true) {
                rightAnswersCount++;
            }else wrongCount++;
        }
        System.out.println("Результат: правильно " + rightAnswersCount + ", неправильно " + wrongCount);
    }
}



