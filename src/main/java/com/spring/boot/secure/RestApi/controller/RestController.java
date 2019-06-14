/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.boot.secure.RestApi.controller;

import com.spring.boot.secure.RestApi.model.Student;
import com.spring.boot.secure.RestApi.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author john
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/api")
public class RestController {
    
    @Autowired
    private StudentService studentService;
    
    @RequestMapping(value = "/student/all")
    public List<Student> findAll(){
        return this.studentService.getAll();
    }
}
