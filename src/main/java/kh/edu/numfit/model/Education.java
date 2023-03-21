package kh.edu.numfit.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tbleducation")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eduid;
    private Date fromdate;
    private Date todate;
    private String university;
    private String country;
    private String degree;
    private String program;
    private String achievement;
    private String teachercode;

    public Education(int eduid, Date fromdate, Date todate, String university, String country, String degree, String program, String achievement, String teachercode) {
        this.eduid = eduid;
        this.fromdate = fromdate;
        this.todate = todate;
        this.university = university;
        this.country = country;
        this.degree = degree;
        this.program = program;
        this.achievement = achievement;
        this.teachercode = teachercode;
    }

    public Education() {

    }

    public int getEduid() {
        return eduid;
    }

    public void setEduid(int eduid) {
        this.eduid = eduid;
    }

    public Date getFromdate() {
        return fromdate;
    }

    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
    }

    public Date getTodate() {
        return todate;
    }

    public void setTodate(Date todate) {
        this.todate = todate;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public String getTeachercode() {
        return teachercode;
    }

    public void setTeachercode(String teachercode) {
        this.teachercode = teachercode;
    }

    @Override
    public String toString() {
        return "Education{" +
                "eduid=" + eduid +
                ", fromdate=" + fromdate +
                ", todate=" + todate +
                ", university='" + university + '\'' +
                ", country='" + country + '\'' +
                ", degree='" + degree + '\'' +
                ", program='" + program + '\'' +
                ", achievement='" + achievement + '\'' +
                ", teachercode='" + teachercode + '\'' +
                '}';
    }
}

