package com.example;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class project {
    @Id
    private int pid;
    private String project;
    @ManyToMany
    private List<employee>pr;
    public project() {
    }
    public project(int pid, String project, List<employee> pr) {
        this.pid = pid;
        this.project = project;
        this.pr = pr;
    }
    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getProject() {
        return project;
    }
    public void setProject(String project) {
        this.project = project;
    }
    public List<employee> getPr() {
        return pr;
    }
    public void setPr(List<employee> pr) {
        this.pr = pr;
    }
    @Override
    public String toString() {
        return "project [pid=" + pid + ", project=" + project + ", pr=" + pr + "]";
    }
    
    


}
