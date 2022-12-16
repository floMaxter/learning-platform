package ru.vdovin.learningproject.OOPLearningApp.repositories.task;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vdovin.learningproject.OOPLearningApp.models.task.Task;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
