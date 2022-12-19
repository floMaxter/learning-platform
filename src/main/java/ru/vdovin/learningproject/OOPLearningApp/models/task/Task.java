package ru.vdovin.learningproject.OOPLearningApp.models.task;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Task")
public class Task {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Lesson name should not be empty")
    @Size(min = 2, max = 30, message = "Lesson name should be between 2 and 30 character")
    @Column(name = "name")
    private String name;

    @Column(name = "answers")
    @NotEmpty(message = "Answer should not be empty")
    private String answers;

    public Task() {
    }

    public Task(String name, String answers) {
        this.name = name;
        this.answers = answers;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAnswers() {
        return answers;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", answers='" + answers + '\'' +
                '}';
    }
}
