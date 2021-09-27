/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.solidjavaexample.service;

import com.lucas.solidjavaexample.exception.ValidacaoException;
import com.lucas.solidjavaexample.model.Funcionario;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author lucas
 */
public class ValidacaoPeriodicidadeEntreReajustes  implements ValidacaoReajuste {
	
    @Override
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDeseUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
        
        if (mesesDeseUltimoReajuste < 6) {
            throw new ValidacaoException("Intervalo entre reajustes deve ser de no minimo 6 meses!");
        }
    }

}
