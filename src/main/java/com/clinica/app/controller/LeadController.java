package com.clinica.app.controller;

import com.clinica.app.model.Lead;
import com.clinica.app.service.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Controller para lidar com as requisições HTTP
//@RestController: indica que esta classe é um controlador REST
//@RequestMapping("/api/leads"): indica que o endpoint para esta API é /api/leads
@RestController
@RequestMapping("/api/leads")
public class LeadController {

    //Injeção de dependência do LeadService
    @Autowired
    private LeadService service;

    //Endpoint para listar todos os leads
    @GetMapping("/pendentes")
    public List<Lead> listarPendentes() {
        //Método para buscar todos os leads pendentes
        //Retorna a lista de leads pendentes
        return service.buscarPendentes();
    }
}
