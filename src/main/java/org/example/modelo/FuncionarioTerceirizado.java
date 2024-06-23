package org.example.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FuncionarioTerceirizado extends FuncionarioBase {
    private String empresaContratada;
    private int tempoPrevistoPermanencia;

    public FuncionarioTerceirizado(String nome, String endereco, double salario, Setor setor, Cargo cargo, String empresaContratada, int tempoPrevistoPermanencia) {
        super(nome, endereco, salario, setor, cargo);
        this.empresaContratada = empresaContratada;
        this.tempoPrevistoPermanencia = tempoPrevistoPermanencia;
    }
}


