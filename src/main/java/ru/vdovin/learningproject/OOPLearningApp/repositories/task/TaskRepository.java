package ru.vdovin.learningproject.OOPLearningApp.repositories.task;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vdovin.learningproject.OOPLearningApp.models.task.Task;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
    Optional<Task> findByName(String name);
}
