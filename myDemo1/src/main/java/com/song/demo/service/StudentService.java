package com.song.demo.service;

import com.song.demo.bean.Student;

import java.util.List;

public interface StudentService {

    Student save(Student student);

    void delete(Student student);

    Student update(Student student);

    List<Student> findAll();



}
