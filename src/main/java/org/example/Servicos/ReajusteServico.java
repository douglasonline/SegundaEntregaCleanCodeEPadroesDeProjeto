package org.example.Servicos;

import org.example.modelo.FuncionarioBase;
import org.example.modelo.FuncionarioTerceirizado;

public class ReajusteServico {
    public boolean reajustarSalario(FuncionarioBase funcionario, double percentual) {
        if (funcionario instanceof FuncionarioTerceirizado) {
            System.out.println("Reajuste não aplicável para funcionários terceirizados.");
            return false;
        }
        double novoSalario = funcionario.getSalario() * (1 + percentual / 100);
        funcionario.setSalario(novoSalario);
        return true;
    }
}


