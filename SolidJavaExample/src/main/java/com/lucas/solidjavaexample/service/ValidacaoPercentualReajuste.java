/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.solidjavaexample.service;

import com.lucas.solidjavaexample.exception.ValidacaoException;
import com.lucas.solidjavaexample.model.Funcionario;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author lucas
 */
public class ValidacaoPercentualReajuste implements ValidacaoReajuste {
	
    @Override
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        
        BigDecimal salarioAtual = funcionario.getSalario();
        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
        
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
    }

}
