package org.example.modelo;

import java.math.BigDecimal;

public class Funcionario extends FuncionarioBase {
    public Funcionario(String nome, String endereco, BigDecimal salario, Setor setor, Cargo cargo) {
        super(nome, endereco, salario, setor, cargo);
    }
}