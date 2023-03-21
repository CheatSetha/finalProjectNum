package kh.edu.numfit.controller;

import kh.edu.numfit.model.Task;
import kh.edu.numfit.repository.TaskRepository;
import kh.edu.numfit.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;
    private TaskService taskService;

    @GetMapping
    public String list(Model model) {
        List<Task> tasks = taskRepository.findAll();
        model.addAttribute("tasks", tasks);
        return "list";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") int id, Model model) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid task id"));
        model.addAttribute("task", task);
        return "edit";
    }



    @PostMapping("/save")
    public String save(@ModelAttribute("task") Task task) {
        taskRepository.save(task);
        return "redirect:/list";
    }

    @RequestMapping("/new")
    public String newTask(Model model) {
        model.addAttribute("task", new Task());
        return "edit";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        //Task task = taskRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid task id"));
//        //taskRepository.delete(task);
        taskService.delete(id);
        return "redirect:/list";
    }
}
