package com.song.demo.repository;

import com.song.demo.bean.ApplicationConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ApplicationConfigRepository extends JpaRepository<ApplicationConfig,Long> {
}
