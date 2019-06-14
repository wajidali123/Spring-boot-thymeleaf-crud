/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.boot.secure.RestApi.service;

import com.spring.boot.secure.RestApi.model.Student;
import com.spring.boot.secure.RestApi.repo.StudentsRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author john
 */
@Service
public class StudentService {
   @Autowired
   private StudentsRepo studentsRepo;
   
   public List<Student> getAll(){
       return this.studentsRepo.findAll();
   }
   
   public Student findOne(long id){
       return this.studentsRepo.getOne(id);
   }
   
   public List<Student> delete(long id){
       this.studentsRepo.deleteById(id);
       return this.getAll();
   }
   
   public Student save(Student student){
        return this.studentsRepo.save(student);
   }
}
