package ru.vdovin.learningproject.OOPLearningApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.vdovin.learningproject.OOPLearningApp.models.task.Task;
import ru.vdovin.learningproject.OOPLearningApp.models.task.Test;
import ru.vdovin.learningproject.OOPLearningApp.util.TaskValidator;

@Controller
public class PageController {

    private final TaskValidator taskValidator;

    @Autowired
    public PageController(TaskValidator taskValidator) {
        this.taskValidator = taskValidator;
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

    @PostMapping("/les3")
    public String checkExercisePage4(@ModelAttribute("test") Test test,
                                     @ModelAttribute("task") Task task,
                                     BindingResult bindingResult) {
        task.setName("page4");

        taskValidator.validate(task, bindingResult);
        taskValidator.validateTest(test, bindingResult);

        if(bindingResult.hasErrors())
            return "css/page4";

        return "redirect:/les4";
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
    public String checkExercisePage6(@ModelAttribute("task") Task task,
                                     BindingResult bindingResult) {
        task.setName("page6");

        taskValidator.validate(task, bindingResult);
        taskValidator.validateAnswer(task, bindingResult);

        if(bindingResult.hasErrors())
            return "css/page6";

        return "css/result";
    }

    @GetMapping("/lessons")
    public String listAllLessons() {
        return "css/listAllLessons";
    }
}
