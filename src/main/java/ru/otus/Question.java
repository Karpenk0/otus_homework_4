package ru.otus;

public class Question {
    private final Answer[] answers;
    private final int rightAnswerIndex;
    private final String questionText;
    private UserInput input = new UserInput();
    private UserOutput output = new UserOutput();

    public Question(Answer[] answers, int rightAnswerIndex, String questionText) {
        this.answers = answers;
        this.rightAnswerIndex = rightAnswerIndex;
        this.questionText = questionText;
    }

    public int getAnswers() {
        return this.answers.length;  // правильно ли написано Геттер чтобы получить длину массива с ответами?
    }

    public boolean ask() {
        System.out.println(questionText);
        for (int i = 0; i < answers.length; i++) {
            System.out.println(answers[i].getText());

        }

        int userAnswer = input.readInput("Введите ответ: ");
        if (userAnswer == rightAnswerIndex) {
            output.print("Верно");
            return true;
        } else {
            output.print("Не верно");
            output.print("Правильный ответ " + rightAnswerIndex);
            return false;
        }


    }
}
