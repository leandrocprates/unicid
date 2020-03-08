/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.unicid.controller;

import com.example.unicid.model.Aluno;
import com.example.unicid.service.AlunoService;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * localhost:9090/h2-console - Para ver banco de dados H2
 * 
 * localhost:9090/listar - para listar todos os alunos do banco de dados 
 * 
 * localhost:9090/incluir - para incluir alunos no banco de dados 
 * 
 * 
 * insert into Aluno(id,data,endereco,nome) values (1,now(), 'avenida paulista 400', 'Leandro') ; 
 * 
 * insert into Aluno(id,data,endereco,nome) values (2,now(), 'avenida angelica 777 ', 'Ariane') ; 
 * 
 * select *from Aluno ; 
 * 
 * 
 */

@CrossOrigin
@RestController
public class AlunoController {
    
    @Autowired
    AlunoService alunoService ; 
    
    @RequestMapping(value="/ok", method = RequestMethod.GET )
    public String retornoTeste(){
        return "OK";
    }
    
    @RequestMapping(value="/listar" , method = RequestMethod.GET )
    public List<Aluno> buscarAlunos(){
        return alunoService.buscarAlunos();
    }


    /*
    Modelo de Request com o postman

    url:   localhost:9090/incluirhash
    header : Content-Type : application/json

    {
        "variavel1":"valor1",
        "variavel2":"valor2"
    }
    */

    @RequestMapping(value="/incluirhash" , method = RequestMethod.POST )
    public void buscarAlunos(@RequestBody HashMap<String , String > hash ){
        System.out.println("Dentro da funcao de hash") ; 
        System.out.println( hash.keySet().toString() ) ;
    }


    /*
    Modelo de Request com o postman

    url:   localhost:9090/incluirstring
    header : Content-Type : text/plain

    */
    @RequestMapping(value="/incluirstring" , method = RequestMethod.POST )
    public void enviarString(@RequestBody String valor){
        System.out.println("Incluir valor string ") ;
         System.out.println(valor) ;
    }

    /*
    Modelo de Request com o postman para inclusao de registro 
    
    url:   localhost:9090/incluir    
    header : Content-Type : application/json
    
    body ; 
    
    {
	"nome" : "postman",
	"endereco" : "endereco postmans" , 
	"data" : "2020-08-19T20:34:28"
    } 
    
    */
    @RequestMapping(value="/incluir" , method = RequestMethod.POST )
    public void buscarAlunos(@RequestBody Aluno aluno ){
        System.out.println("Dentro da funcao de Aluno") ; 
        System.out.println(aluno.toString());
        alunoService.salvarAluno(aluno);
    }

}
