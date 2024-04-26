/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciopraticar;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class CalculadoraMediaPonderada {

    public double calcularMediaPonderada() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as notas e pesos das três provas:");

        System.out.print("Nota da primeira prova: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Peso da primeira prova: ");
        double peso1 = scanner.nextDouble();

        System.out.print("Nota da segunda prova: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Peso da segunda prova: ");
        double peso2 = scanner.nextDouble();

        System.out.print("Nota da terceira prova: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Peso da terceira prova: ");
        double peso3 = scanner.nextDouble();

        // Calcula a média ponderada das notas usando a fórmula: (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3)
        double somaPonderada = nota1 * peso1 + nota2 * peso2 + nota3 * peso3;
        double somaPesos = peso1 + peso2 + peso3;
        double mediaPonderada = somaPonderada / somaPesos;

        scanner.close();

        return mediaPonderada;
    }

}

