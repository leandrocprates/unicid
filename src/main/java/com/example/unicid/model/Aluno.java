/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.unicid.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author lprates
 */

@Data
@Entity
public class Aluno {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Column
    private String nome;
    
    @Column
    private String endereco;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;


    @Override
    public String toString() {
        return "Aluno{" + "id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", data=" + data + '}';
    }

    
}
