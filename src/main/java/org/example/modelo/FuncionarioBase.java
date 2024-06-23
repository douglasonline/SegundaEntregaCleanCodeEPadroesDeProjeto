package org.example.modelo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public abstract class FuncionarioBase {
    private String nome;
    private List<String> telefones;
    private String endereco;
    private double salario;
    private Setor setor;
    private Cargo cargo;

    public FuncionarioBase(String nome, String endereco, double salario, Setor setor, Cargo cargo) {
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
        this.setor = setor;
        this.cargo = cargo;
        this.telefones = new ArrayList<>();
    }

    public void addTelefone(String telefone) {
        this.telefones.add(telefone);
    }

}

