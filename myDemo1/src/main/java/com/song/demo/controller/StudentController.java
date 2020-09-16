package com.song.demo.controller;

import com.song.demo.bean.Student;
import com.song.demo.common.ResultMsg;
import com.song.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping(path = "/find_all")
    public ResultMsg findAll(){
        List<Student> all = studentService.findAll();
        ResultMsg result=ResultMsg.successResult(all);
        return result;
    }

    @PostMapping(path = "/save")
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }


}
