package kh.edu.numfit.service;

import kh.edu.numfit.model.Task;
import kh.edu.numfit.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;
    public List<Task> taskList(){
        return taskRepository.findAll();
    }
    public Task edit(Task task){
        return taskRepository.save(task);
    }
    public void delete(int id){
        taskRepository.deleteById(id);
    }
}
