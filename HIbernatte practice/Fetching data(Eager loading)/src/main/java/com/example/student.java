package com.example;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class student {
    @Id
    int rollno;
    String name;
    @OneToMany(fetch = FetchType.EAGER)
    List<laptop>al;
    public student() {
    }
    public student(int rollno, String name, List<laptop> al) {
        this.rollno = rollno;
        this.name = name;
        this.al = al;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<laptop> getAl() {
        return al;
    }
    public void setAl(List<laptop> al) {
        this.al = al;
    }
    @Override
    public String toString() {
        return "student [rollno=" + rollno + ", name=" + name + ", al=" + al + "]";
    }
    

}
