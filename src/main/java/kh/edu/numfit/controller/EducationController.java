package kh.edu.numfit.controller;

import kh.edu.numfit.model.Education;
import kh.edu.numfit.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/education")
public class EducationController {
    @Autowired
    private EducationRepository educationRepository;

    @GetMapping
    public String list(Model model) {
        List<Education> education = educationRepository.findAll();
        model.addAttribute("education", education);
        return "educationlist";
    }
    @PostMapping ("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model) {
       Education education = educationRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid task id"));
        model.addAttribute("educton",education);
        return "editedu";
    }
//    @GetMapping("/editedu")
//    public String getCourse() {
//        return "editedu";
//    }
}

//    @GetMapping("/edit/{id}")
//    public String edit(@PathVariable("id") Long id, Model model) {
//        Task task = taskRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid task id"));
//        model.addAttribute("task", task);
//        return "edit";
//    }
//
//    @PostMapping("/save")
//    public String save(@ModelAttribute("task") Task task) {
//        taskRepository.save(task);
//        return "redirect:/tasks";
//    }
//}




