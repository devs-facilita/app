package com.clinica.app.repository;

import com.clinica.app.model.Lead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeadRepository extends JpaRepository<Lead, Long> {
    // Aqui, o Spring já cria todos os comandos de busca para você automaticamente!
}