package com.gestioncomputador.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_computadora")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Computadora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String procesador;
    private String ram;
    private String discoDuro;
}
