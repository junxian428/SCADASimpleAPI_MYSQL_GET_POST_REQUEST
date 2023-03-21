package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.SCADALog;
import com.example.demo.repository.SCADARepository;
import com.example.demo.service.SCADAService;

@RestController
public class SCADAController {
    @Autowired
    private SCADARepository scadaRepository;

    @Autowired
    private SCADAService scadaService;

    @GetMapping("/SCADALog")
    public List<SCADALog> getAllProducts() {
        return scadaRepository.findAll();
    }

    @PostMapping("/PostSCADA")
    public void add(@RequestBody SCADALog scadaLog) {
      //        stockService.save(stock);
      scadaService.save(scadaLog);
    }
}