package ru.vdovin.learningproject.OOPLearningApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/logo")
    public String helloPage1() {
        return "css/page1";
    }

    @GetMapping("/admin")
    public String showPageAdmin() {
        return "css/adminPage";
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
}
