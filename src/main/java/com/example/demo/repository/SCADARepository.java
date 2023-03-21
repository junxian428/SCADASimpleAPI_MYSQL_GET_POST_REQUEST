package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.SCADALog;

public interface SCADARepository extends JpaRepository<SCADALog, Integer> {
    List<SCADALog> findAll();
  

}