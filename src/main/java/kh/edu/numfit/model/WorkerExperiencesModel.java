package kh.edu.numfit.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

@Table(name = "tblWorkerExperience")
public class WorkerExperiencesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int exid;
    @Column(name = "from_date")
    Date fromdate ;
    @Column(name = "to_date")
    Date todate;
    @Column(name = "organization")
    private String organization;
    @Column(name = "position")
    private String position;
    @Column(name = "responsibility")
    private String responsibility;
    @Column(name = "achievment")
    private String achievement;
    @Column(name = "teacher_code")
    private int teachercode;

    @Override
    public String toString() {
        return "WorkerExperiencesModel{" +
                "exid=" + exid +
                ", fromdate=" + fromdate +
                ", todate=" + todate +
                ", organization='" + organization + '\'' +
                ", position='" + position + '\'' +
                ", responsibility='" + responsibility + '\'' +
                ", achievement='" + achievement + '\'' +
                ", teachercode=" + teachercode +
                '}';
    }
}
