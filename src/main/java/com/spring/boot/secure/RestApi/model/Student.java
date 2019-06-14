/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.boot.secure.RestApi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author john
 */
@Entity()
@Table(name = "students")
public class Student {

    public Student() {
    }

    public Student(long id, String fname, String lname, String dept, String degree) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.dept = dept;
        this.degree = degree;
    }
    
    
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "fname")
    private String fname;
    @Column(name = "lname")
    private String lname;
    @Column(name = "dept")
    private String dept;
    @Column(name = "degree")
    private String degree;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", fname=" + fname + ", lname=" + lname + ", dept=" + dept + ", degree=" + degree + '}';
    }
    
    
    
}
