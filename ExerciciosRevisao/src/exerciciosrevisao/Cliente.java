/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosrevisao;

/**
 *
 *
 * Escreva uma classe em Java que representa um cliente de uma loja. A classe
 * deve ter atributos como nome, idade, endereço e saldo, além de métodos para
 * realizar uma compra (recebendo o valor como parâmetro) e imprimir os dados do
 * cliente. No método realizar compra, é importante verificar se o cliente
 * possui saldo, caso não tenha saldo, imprima a mensagem "Saldo insuficiente
 * para realizar a compra." caso consiga prosseguir com a compra, imprima a
 * mensagem: "Compra realizada com sucesso!" *
 */
public class Cliente {

    public String Nome;
    public int Idade;
    public double Saldo;
    public String Endereco;

    public void RealizarCompra(double valor) {
        if (Saldo > valor) {
            System.out.println("Compra realizada com sucesso!");
            this.Saldo = this.Saldo - valor;
        } else {
            System.out.println("Saldo insuficiente!");

        }
    }

    public void Imprimir() {
        System.out.println("Nome " + Nome);
        System.out.println("Idade " + Idade);
        System.out.println("Saldo " + Saldo);
        System.out.println("Endereco " + Endereco);

    }

}
