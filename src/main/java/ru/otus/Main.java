package ru.otus;

public class Main {
    public static void main(String[] args) {
        Answer q1_answer1 = new Answer("1. cs");
        Answer q1_answer2 = new Answer("2. java");
        Answer q1_answer3 = new Answer("3. class");
        Answer q1_answer4 = new Answer("4. exe");
        Answer q2_answer1=new Answer("1. commit");
        Answer q2_answer2=new Answer("2. push");
        Answer q2_answer3=new Answer("3. clone");
        Answer q2_answer4=new Answer("4. copy");
        Answer q3_answer1=new Answer("1. while");
        Answer q3_answer2=new Answer("2. for");
        Answer q3_answer3=new Answer("3. loop");
        Answer q4_answer1=new Answer("1. Ссылочные (объектные)");
        Answer q4_answer2=new Answer("2. Примитивные");
        Answer q4_answer3=new Answer("3. Примитивные, ссылочные (объектные)");
        Answer q4_answer4=new Answer("4. Переменные, постоянные");
        Answer q4_answer5=new Answer("5. Переменные, примитивные");
        Answer q5_answer1=new Answer("1. Изменяемый состав элементов разных типов");
        Answer q5_answer2=new Answer("2. Фиксированное количество элементов одного типа");
        Answer q5_answer3=new Answer("3. Изменяемый состав элементов одного типа");
        Answer q5_answer4=new Answer("4. Фиксированное количество элементов разных типов");


        Question q1 = new Question(new Answer[]{q1_answer1, q1_answer2, q1_answer3, q1_answer4}, 2, "В файл с каким расширением компилируется java-файл?");
        Question q2=new Question(new Answer[]{q2_answer1,q2_answer2,q2_answer3,q2_answer4},3,"С помощью какой команды git можно получить полную копию удаленного репозитория?");
        Question q3=new Question(new Answer[]{q3_answer1,q3_answer2,q3_answer3}, 1,"Какой применяется цикл, когда не известно количество итераций?");
        Question q4=new Question(new Answer[]{q4_answer1,q4_answer2,q4_answer3,q4_answer4,q4_answer5},3,"На какие группы делятся типы данных в языке Java?");
        Question q5=new Question(new Answer[]{q5_answer1,q5_answer2,q5_answer3,q5_answer4,q4_answer5},2,"Для массивов в Java верно");
        Test test1 = new Test(new Question[]{q1,q2,q3,q4,q5});

        test1.passTest();


    }
}
