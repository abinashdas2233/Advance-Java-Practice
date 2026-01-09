package com.example;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class laptop {
    @Id
    int no;
    String Brand;
    @ManyToOne
    student st;
    public laptop() {
    }
    public laptop(int no, String brand, student st) {
        this.no = no;
        Brand = brand;
        this.st = st;
    }
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getBrand() {
        return Brand;
    }
    public void setBrand(String brand) {
        Brand = brand;
    }
    public student getSt() {
        return st;
    }
    public void setSt(student st) {
        this.st = st;
    }
    @Override
    public String toString() {
        return "laptop [no=" + no + ", Brand=" + Brand + ", st=" + st + "]";
    }
    
}