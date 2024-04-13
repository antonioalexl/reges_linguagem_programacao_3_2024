/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosrevisao;

/**
 *
 * @author anton
 */
public class Funcionario {
    public String nome;
    public String cargo;
    public double salario;
    public String departamento;

 

    public void aumentarSalario(double aumento) {
        salario += aumento;
        System.out.println("O salário de " + nome + " foi aumentado para R$" + salario);
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$" + salario);
        System.out.println("Departamento: " + departamento);
    }
}