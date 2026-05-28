package com.clinica.app.service;

import com.clinica.app.model.Lead;
import com.clinica.app.repository.LeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Service para lidar com a lógica do negócio
@Service
public class LeadService {

    //Injeção de dependência do LeadRepository
    @Autowired
    private LeadRepository repository;

    //Método para buscar todos os leads pendentes
    public List<Lead> buscarPendentes() {
        //Método para buscar todos os leads pendentes
        return repository.findAll().stream()
                .filter(l -> "PENDENTE".equalsIgnoreCase(l.getStatus()))
                .toList();
    }   
}