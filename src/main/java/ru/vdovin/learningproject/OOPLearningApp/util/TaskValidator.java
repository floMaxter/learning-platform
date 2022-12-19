package ru.vdovin.learningproject.OOPLearningApp.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.vdovin.learningproject.OOPLearningApp.exception.AnswerException;
import ru.vdovin.learningproject.OOPLearningApp.models.task.Task;
import ru.vdovin.learningproject.OOPLearningApp.services.TaskService;

import java.util.Objects;

@Component
public class TaskValidator implements Validator {

    private final TaskService taskService;

    @Autowired
    public TaskValidator(TaskService taskService) {
        this.taskService = taskService;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Task.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Task task = (Task) target;

        try {
            taskService.findByName(task.getName());
        } catch (UsernameNotFoundException ignored) {
            errors.rejectValue("name", "", "Не существует задания с таким названием");
        }
    }

    public void validateAnswer(Object target, Errors errors) {
        Task task = (Task) target;
        Task correctTask = taskService.findByName(task.getName());

        String userResponse = task.getAnswers().replace("\r\n", "<br>");

        try {
            if(!Objects.equals(correctTask.getAnswers(), userResponse))
                throw new AnswerException("Ой, похоже вы допустили ошибку, попробуйте еще раз.");
        } catch (AnswerException ex) {
            errors.rejectValue("answers", "", ex.getMessage());
        }
    }
}
