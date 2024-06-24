package org.example.Servicos;

import org.example.modelo.FuncionarioBase;
import org.example.modelo.FuncionarioTerceirizado;

import java.math.BigDecimal;

public class ReajusteServico {
    public boolean reajustarSalario(FuncionarioBase funcionario, BigDecimal percentual) {
        if (funcionario instanceof FuncionarioTerceirizado) {
            System.out.println("Reajuste não aplicável para funcionários terceirizados.");
            return false;
        }

        // Calculando o novo salário usando BigDecimal
        BigDecimal novoSalario = funcionario.getSalario().multiply(BigDecimal.ONE.add(percentual.divide(BigDecimal.valueOf(100))));
        funcionario.setSalario(novoSalario);
        return true;
    }
}