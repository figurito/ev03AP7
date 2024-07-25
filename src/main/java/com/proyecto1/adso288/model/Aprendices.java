package com.proyecto1.adso288.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 *
 * Clase para Crear la Entidad de la Aplicación
 */
@Entity
@Data
public class Aprendices {
    @Id
    @Column
    private Long iduser;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String email;
    
}
