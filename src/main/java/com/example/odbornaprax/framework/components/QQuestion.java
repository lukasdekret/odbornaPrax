package com.example.odbornaprax.framework.components;

public class QQuestion {
    private String question;
    private String [] answers;
    private int index;
    private QToggleGroup answerButtons;
    public QQuestion(String question, String[] answers, int index) {
        this.question = question;
        this.answers = answers;
        this.index = index;
    }

    public QToggleGroup getAnswerButtons() {
        return answerButtons;
    }

    public void setAnswerButtons(QToggleGroup answerButtons) {
        this.answerButtons = answerButtons;
    }

    public int getIndex() {
        return index;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        return answers;
    }
}
