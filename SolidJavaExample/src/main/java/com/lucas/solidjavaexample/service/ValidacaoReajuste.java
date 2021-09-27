/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.solidjavaexample.service;

import com.lucas.solidjavaexample.model.Funcionario;
import java.math.BigDecimal;

/**
 *
 * @author lucas
 */
public interface ValidacaoReajuste {
	
    void validar(Funcionario funcionario, BigDecimal aumento);

}
