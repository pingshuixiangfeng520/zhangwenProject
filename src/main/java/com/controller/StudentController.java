package com.controller;

import com.model.pojo.Student;
import com.service.IStudentService;
import com.service.impl.StudentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/stu")
public class StudentController {

    @Resource
    private StudentServiceImpl studentService;

    @RequestMapping("/findStudent")
    public ModelAndView findStudent(){
        List<Student> list = studentService.findStudent();

        ModelAndView mv = new ModelAndView();
        mv.addObject("stus",list);
        mv.setViewName("list");

        System.out.println("主分支进行修改==========");

        System.out.println("dev开发进行修改");



        return mv;
    }




}
