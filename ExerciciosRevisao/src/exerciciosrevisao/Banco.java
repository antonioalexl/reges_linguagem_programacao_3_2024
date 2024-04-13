/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosrevisao;

/**
 *
 * @author anton
 */
public class Banco {
    public double saldo;



    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Erro: Saldo insuficiente para realizar o saque.");
            }
        } else {
            System.out.println("Erro: Valor inválido para saque.");
        }
    }

    public void transferir(double valor, Banco destino) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                destino.depositar(valor);
                System.out.println("Transferência de R$" + valor + " realizada com sucesso.");
            } else {
                System.out.println("Erro: Saldo insuficiente para realizar a transferência.");
            }
        } else {
            System.out.println("Erro: Valor inválido para transferência.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}
