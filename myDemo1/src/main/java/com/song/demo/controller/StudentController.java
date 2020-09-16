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
    public ResultMsg save(@RequestBody Student student){
        Student entity = studentService.save(student);
        if(null!=entity){
            return ResultMsg.SUCCESS;
        }else{
            return ResultMsg.FAIL;
        }
    }

    @PutMapping(path = "/update")
    public ResultMsg update(@RequestBody Student student){
        Student entity = studentService.update(student);
        if(null!=entity){
            return ResultMsg.SUCCESS;
        }else{
            return ResultMsg.FAIL;
        }
    }



    @PutMapping(path = "/update_deleted_by_id")
    public ResultMsg updateDeleteById(@RequestParam Boolean deleted,@RequestParam Long id){
        Integer count = studentService.updateDeleteById(deleted, id);
        if(null!=count&&count.intValue()>0){
            return ResultMsg.SUCCESS;
        }else{
            return ResultMsg.FAIL;
        }
    }


    @DeleteMapping(path = "/delete")
    public void delete(@RequestBody Student student){
        studentService.delete(student);
    }


}
