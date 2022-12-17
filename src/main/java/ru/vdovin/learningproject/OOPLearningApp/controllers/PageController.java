package ru.vdovin.learningproject.OOPLearningApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.vdovin.learningproject.OOPLearningApp.repositories.task.TaskRepository;

@Controller
@RequestMapping("/logo")
public class PageController {
    private final TaskRepository taskRepository;

    @Autowired
    public PageController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping()
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
    public String showPage6() {
        return "css/page6";
    }

    @GetMapping("/lessons")
    public String listAllLessons() {
        return "css/listAllLessons";
    }
}
