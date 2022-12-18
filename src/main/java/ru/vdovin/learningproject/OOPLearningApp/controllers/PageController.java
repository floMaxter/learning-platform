package ru.vdovin.learningproject.OOPLearningApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.vdovin.learningproject.OOPLearningApp.models.task.Task;
import ru.vdovin.learningproject.OOPLearningApp.services.TaskService;

@Controller
public class PageController {

    private final TaskService taskService;

    @Autowired
    public PageController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/logo")
    public String helloPage1() {
        return "css/page1";
    }

    @GetMapping("/admin")
    public String showPageAdmin() {
        return "redirect:/administrator/people";
    }

    @GetMapping("/les1")
    public String showPage2() {
        return "css/page2";
    }

    @GetMapping("/les2")
    public String showPage3() {
        return "css/page3";
    }

    @GetMapping("/les3")
    public String showPage4() {
        return "css/page4";
    }

    @GetMapping("/les4")
    public String showPage5() {
        return "css/page5";
    }

    @GetMapping("/les5")
    public String showPage6(Model model) {
        model.addAttribute("task", new Task());

        return "css/page6";
    }

    @PostMapping("/les5")
    public String checkExercisePage6(@ModelAttribute("task") Task task, Model model) {
        Task taskFromBd = taskService.findByName("page6");

        if(taskFromBd.getAnswers().equals(task.getAnswers()))
            return "css/result";

        return "css/page6";
    }

    @GetMapping("/lessons")
    public String listAllLessons() {
        return "css/listAllLessons";
    }
}
