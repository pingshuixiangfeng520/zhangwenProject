package com.service;

import com.model.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IStudentService {
     List<Student> findStudent();
}
