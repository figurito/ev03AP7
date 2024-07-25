package com.proyecto1.adso288.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * Clase para Crear la Entidad de la Aplicación
 */
@Entity
@Data
public class Aprendiz {
    @Id
    @Column (name="Id aprendiz")
    private Long iduser;
    @Column (name="Nombres", nullable=false, length =10)
    private String nombre;
    @Column (nullable=false)
    private String apellido;
    @Column (unique=true, nullable=false)
    private String email;
    
}
