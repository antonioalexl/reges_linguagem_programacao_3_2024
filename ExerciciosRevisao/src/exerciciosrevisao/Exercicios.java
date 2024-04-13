/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosrevisao;

import java.util.Random;
import java.util.Scanner;

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

    public void adivinhacao() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativas = 10;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar um número entre 1 e 100.");

        while (tentativas > 0) {
            System.out.println("Você tem " + tentativas + " tentativas.");
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();

            if (palpite < 1 || palpite > 100) {
                System.out.println("Por favor, digite um número entre 1 e 100.");
                continue;
            }

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número " + numeroAleatorio + "!");
                return; // Encerra o programa
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");
            }

            tentativas--;
        }

        System.out.println("Você perdeu! O número correto era: " + numeroAleatorio);

    }

    //pode ser feito usando o for incrementando de dois em dois
    public void tabuadaPares() {
        for (int i = 1; i <= 100; i += 2) { // Loop pelos números ímpares de 1 a 100
            System.out.println("Tabuada do " + i + ":");

            for (int j = 1; j <= 10; j++) { // Loop para calcular e imprimir a tabuada
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println(); // Adiciona uma linha em branco entre as tabuadas
        }
    }

    //pode ser feito usando o operador mod
    public void tabuadaPares2() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) { // Verifica se o número é ímpar usando o operador módulo
                System.out.println("Tabuada do " + i + ":");

                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " x " + j + " = " + (i * j));
                }

                System.out.println(); // Adiciona uma linha em branco entre as tabuadas
            }
        }
    }
}
