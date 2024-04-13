/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosrevisao;

/**
 *
 * @author anton
 */
public class Exercicios {

    /*
    Escreva um programa que recebe um número 
    inteiro como entrada e verifica se é positivo, negativo ou zero. Use a estrutura de controle if/else.
     */
    public void verificarNumero(int valor) {
        if (valor < 0) {
            System.out.println("Numero Negativo");
        } else if (valor > 0) {
            System.out.println("Numero positivo");

        } else {

            System.out.println("Numero 0");
        }

    }

    /*Escreva um programa que recebe dois números inteiros como entrada e imprime todos os números inteiros entre eles,
    inclusive. Use a estrutura de repetição for.*/
    public void imprimirNumero(int valor1, int valor2) {
        
        for (int i = valor1; i <= valor2; i++) {
            System.out.println("Numero: " + i);
        }
    }

}
