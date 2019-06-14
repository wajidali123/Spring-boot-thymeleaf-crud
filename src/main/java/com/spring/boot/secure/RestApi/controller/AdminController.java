/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.boot.secure.RestApi.controller;

import com.spring.boot.secure.RestApi.model.Student;
import com.spring.boot.secure.RestApi.service.StudentService;
import com.sun.java.swing.plaf.windows.resources.windows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author john
 */
@Controller
@RequestMapping("/")
public class AdminController {
    
    @Autowired
    private StudentService studentService;
    
   @RequestMapping(value="/login")
   public String login(){
       return "login";
   }
   
   @RequestMapping("/user/students")
   public String getAllStudents(Model model){
       model.addAttribute("students", this.studentService.getAll());
       return "students";
   }
   
   @RequestMapping("/user/delete/{id}")
   public String delete(@PathVariable long id){
       this.studentService.delete(id);
       return "redirect:/user/students";
   }
   
   @RequestMapping("/user/new")
   public String newStudent(){
       return "save";
   }
   
   @RequestMapping("/user/update/{id}")
   public String update(@PathVariable long id, Model model, Student student){
       student = this.studentService.findOne(id);
       model.addAttribute("student", student);
       return "update";
   }
   
   @RequestMapping(value = "/user/new", method = RequestMethod.POST, 
            consumes = {"application/x-www-form-urlencoded"})
   public String newStudenSave(Student student){
       this.studentService.save(student);
       return "redirect:/user/students";
   }
   
   @RequestMapping(value = "/user/update/{id}", method = RequestMethod.POST, 
            consumes = {"application/x-www-form-urlencoded"})
   public String updateStudent(@PathVariable long id, Student student, Model model){
       this.studentService.save(student);
       return "redirect:/user/students";
   }
   
   @RequestMapping(value = "/user/new/{id}",method = RequestMethod.POST, 
            consumes = {"application/x-www-form-urlencoded"})
   public String student(Student student){
       this.studentService.save(student);
       return "redirect:/user/students";
   }
    
}
