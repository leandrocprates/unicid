/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.unicid.service;

import com.example.unicid.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.unicid.repository.AlunoRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lprates
 */

@Service
public class AlunoService {
    
    @Autowired
    AlunoRepository alunoRepository ; 
    
    public List<Aluno> buscarAlunos(){
        return alunoRepository.findAll(); 
    }
    
    public void salvarAluno(Aluno aluno){
        alunoRepository.save(aluno);
    }

}
