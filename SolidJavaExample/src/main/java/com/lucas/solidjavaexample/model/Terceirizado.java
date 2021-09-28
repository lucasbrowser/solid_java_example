/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.solidjavaexample.model;

import java.math.BigDecimal;

/**
 *
 * @author lucas
 */
public class Terceirizado {
    
    private DadosPessoais dadosPessoais;
    private String empresa;

    public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario, String empresa) {
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
        this.empresa = empresa;
    }
    
    
    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }
    
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    
    
}
