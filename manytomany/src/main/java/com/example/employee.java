package com.example;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;





@Entity
public class employee {
    @Id
    private int id;
    private String name;
    @ManyToMany
    private List<project> pl;
    public employee() {
    }
    public employee(int id, String name, List<project> pl) {
        this.id = id;
        this.name = name;
        this.pl = pl;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<project> getPl() {
        return pl;
    }
    public void setPl(List<project> pl) {
        this.pl = pl;
    }
    @Override
    public String toString() {
        return "employee [id=" + id + ", name=" + name + ", pl=" + pl + "]";
    }
    


}
