package com.dao;

import com.model.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {

     List<Student> findStudent();
}
