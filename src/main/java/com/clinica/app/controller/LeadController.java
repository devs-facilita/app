package com.clinica.app.controller;

import com.clinica.app.model.Lead;
import com.clinica.app.repository.LeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/leads")
public class LeadController {

    @Autowired
    private LeadRepository repository;

    @GetMapping
    public List<Lead> listarTodos() {
        return repository.findAll();
    }
}
