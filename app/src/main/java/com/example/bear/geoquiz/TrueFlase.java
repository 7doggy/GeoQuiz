package com.example.bear.geoquiz;

/**
 * Created by bear on 15-11-8.
 */
public class TrueFlase {
    private int question;
    private boolean tureQuestion;

    public TrueFlase(int question, boolean tureQuestion) {
        this.question = question;
        this.tureQuestion = tureQuestion;
    }

    public boolean isTureQuestion() {
        return tureQuestion;
    }

    public void setTureQuestion(boolean tureQuestion) {
        this.tureQuestion = tureQuestion;
    }

    public int getQuestion() {
        return question;
    }

    public void setQuestion(int question) {
        this.question = question;
    }
}
