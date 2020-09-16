package com.song.demo.service.impl;

import com.song.demo.bean.Student;
import com.song.demo.repository.StudentRepository;
import com.song.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void delete(Student student) {
        studentRepository.delete(student);
    }

    @Override
    public Student update(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Integer updateDeleteById(Boolean deleted, Long id) {
        return studentRepository.updateDeletedById(deleted,id);
    }

    @Override
    public List<Student> findAll() {
        Student student=new Student();
        student.setDeleted(false);
        Example<Student> example=Example.of(student);
        return studentRepository.findAll(example);
    }
}
