package kh.edu.numfit.controller;

import kh.edu.numfit.model.WorkerExperiencesModel;
import kh.edu.numfit.service.WorkerExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WorkerController {
    @Autowired
    private WorkerExperienceService workerservice;
//    display list of worker
    @GetMapping("/worker")
    public String viewWorker(Model model){
        model.addAttribute("listWorker",workerservice.getWorkerExperience());
        return "worker";
    }
    @PostMapping("/addWorker")
    public String addWorker(@ModelAttribute("worker")WorkerExperiencesModel workerExperiencesModel){
        System.out.println("new worker is : "+workerExperiencesModel);
        return "redirect:/worker";
    }
   @PostMapping("/updateWorker")
    public String updateWorker(@ModelAttribute("EDIT_WORKER") WorkerExperiencesModel workerExperiencesModel){
       System.out.println("update worker is "+workerExperiencesModel);
       workerservice.updateWorker(workerExperiencesModel);
       return "redirect:/worker";
   }
   @GetMapping("/update-worker/{id}")
    public ModelAndView editWorker(@PathVariable("id") int id){
        WorkerExperiencesModel updateWorker = workerservice.getWorkerById(id);
       System.out.println("edit worker : "+updateWorker);
       ModelAndView modelAndView = new ModelAndView("/worker/update-worker");
       modelAndView.addObject("Edit_worker",updateWorker);
       return modelAndView;
   }
   @GetMapping("/delete-worker/{id}")
    public String deleteworker(@PathVariable("id") int id){
        workerservice.getWorkerById(id);
        return "redirect:/worker";
   }
}
