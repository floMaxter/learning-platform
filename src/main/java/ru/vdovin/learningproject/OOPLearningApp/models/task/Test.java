package ru.vdovin.learningproject.OOPLearningApp.models.task;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Test {
    private ArrayList<Boolean> testAnswers;

    public Test() {
    }

    public Test(ArrayList<Boolean> testAnswers) {
        this.testAnswers = testAnswers;
    }

    public List<Boolean> getTestAnswers() {
        return testAnswers;
    }

    public Boolean getCurrentTestAnswer(int questionNumber) {
        return testAnswers.get(questionNumber);
    }

    public void setTestAnswers(ArrayList<Boolean> testAnswers) {
        this.testAnswers = testAnswers;
    }

    public void setCurrentTestAnswer(int questionNumber, boolean checked) {
        this.testAnswers.set(questionNumber, checked);
    }
}
