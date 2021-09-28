/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.solidjavaexample.service.promocao;

import com.lucas.solidjavaexample.exception.ValidacaoException;
import com.lucas.solidjavaexample.model.Cargo;
import com.lucas.solidjavaexample.model.Funcionario;

/**
 *
 * @author lucas
 */
public class PromocaoService {
    
    public void promover (Funcionario funcionario, boolean metaBatida) {
        
        Cargo cargoAtual = funcionario.getDadosPessoais().getCargo();
        
        if (Cargo.GERENTE == funcionario.getDadosPessoais().getCargo()) {
            throw new ValidacaoException("Gerentes não podem ser promovidos!");
        }
        
        if (metaBatida) {
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        } else {
            throw new ValidacaoException("Funcionário não bateu a meta!");
        }
    }
}
