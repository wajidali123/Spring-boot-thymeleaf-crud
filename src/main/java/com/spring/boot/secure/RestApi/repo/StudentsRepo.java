/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.boot.secure.RestApi.repo;

import com.spring.boot.secure.RestApi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author john
 */
@Repository
public interface StudentsRepo extends JpaRepository<Student, Long>{
    
}
