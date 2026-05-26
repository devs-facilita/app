package com.clinica.app.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity // Diz ao Java: "Essa classe vira uma tabela no banco"
@Table(name = "leads") // Nome da tabela no seu Postgres
@Data // Abreviação do Lombok para criar getters/setters automaticamente
public class Lead {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String telefone;
    private String status; // Ex: "FECHADO" ou "PENDENTE"
}