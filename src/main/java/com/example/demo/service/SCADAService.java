package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.SCADALog;
import com.example.demo.repository.SCADARepository;

@Service
public class SCADAService {
    @Autowired
    private SCADARepository scadaRepository;

  

    public void save(SCADALog scadaLog) {
        scadaRepository.save(scadaLog);
    }
}
