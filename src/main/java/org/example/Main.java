package org.example;

import org.example.modelo.*;
import org.example.Servicos.ReajusteServico;

public class Main {
    public static void main(String[] args) {
        Funcionario func1 = criarFuncionario("Alice", "Rua A", 3000.0, Setor.DESENVOLVIMENTO, Cargo.PLENO, "1234-5678");
        FuncionarioTerceirizado func2 = criarFuncionarioTerceirizado("Bob", "Rua B", 2500.0, Setor.DEVOPS, Cargo.JUNIOR, "Empresa XYZ", 12, "8765-4321");

        ReajusteServico reajusteServico = new ReajusteServico();

        aplicarReajuste(func1, 10, reajusteServico);
        aplicarReajuste(func2, 10, reajusteServico);
    }

    private static Funcionario criarFuncionario(String nome, String endereco, double salario, Setor setor, Cargo cargo, String telefone) {
        Funcionario funcionario = new Funcionario(nome, endereco, salario, setor, cargo);
        funcionario.addTelefone(telefone);
        return funcionario;
    }

    private static FuncionarioTerceirizado criarFuncionarioTerceirizado(String nome, String endereco, double salario, Setor setor, Cargo cargo, String empresaContratada, int tempoPrevistoPermanencia, String telefone) {
        FuncionarioTerceirizado funcionario = new FuncionarioTerceirizado(nome, endereco, salario, setor, cargo, empresaContratada, tempoPrevistoPermanencia);
        funcionario.addTelefone(telefone);
        return funcionario;
    }

    private static void aplicarReajuste(FuncionarioBase funcionario, double percentual, ReajusteServico reajusteServico) {
        boolean reajusteAplicado = reajusteServico.reajustarSalario(funcionario, percentual);
        if (reajusteAplicado) {
            System.out.println("Salário após reajuste: " + funcionario.getSalario());
        }
    }
}