/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.unicid.repository;

import com.example.unicid.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lprates
 */

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{
    
}
