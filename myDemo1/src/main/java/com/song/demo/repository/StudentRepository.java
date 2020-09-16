package com.song.demo.repository;

import com.song.demo.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    @Transactional
    @Modifying
    @Query("update Student set  deleted=:deleted where id=:id")
    Integer updateDeletedById(Boolean deleted,Long id);

}
