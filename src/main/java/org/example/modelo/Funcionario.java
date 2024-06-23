package org.example.modelo;

public class Funcionario extends FuncionarioBase {
    public Funcionario(String nome, String endereco, double salario, Setor setor, Cargo cargo) {
        super(nome, endereco, salario, setor, cargo);
    }
}