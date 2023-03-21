package kh.edu.numfit.service;

import kh.edu.numfit.model.WorkerExperiencesModel;
import kh.edu.numfit.repository.WorkerExperience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerExperienceService {
    @Autowired
    //call worker repository
    private WorkerExperience workerExperience;
    public List<WorkerExperiencesModel> getWorkerExperience(){
        return workerExperience.findAll();
    }
    public WorkerExperiencesModel getWorkerById(int teachercode){
        return workerExperience.findById(teachercode).get();
    }
    public WorkerExperiencesModel updateWorker(WorkerExperiencesModel workerExperiencesModel){
        return workerExperience.save(workerExperiencesModel);

    }
    public void deleteWorkerById( int teachercode){
        workerExperience.deleteById(teachercode);
    }

}
