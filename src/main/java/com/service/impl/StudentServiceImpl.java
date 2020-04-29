package com.service.impl;
import com.dao.StudentMapper;
import com.model.pojo.Student;
import com.service.IStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> findStudent() {

        List<Student> list = studentMapper.findStudent();
        System.out.println("service层的list"+list);

        return list;
    }
}
