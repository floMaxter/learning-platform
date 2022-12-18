package ru.vdovin.learningproject.OOPLearningApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vdovin.learningproject.OOPLearningApp.models.task.Task;
import ru.vdovin.learningproject.OOPLearningApp.repositories.task.TaskRepository;

import java.util.Optional;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task findByName(String name) {
        Optional<Task> findTask = taskRepository.findByName(name);
        return findTask.orElse(null);
    }
}
