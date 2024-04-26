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
public class Exercicios {

    public void calcular() {

        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite uma sequência de 10 números inteiros:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        System.out.println("A soma dos números é: " + soma);

        scanner.close();
    }

    public boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }

        // Verificando se o número é divisível apenas por 1 e por ele mesmo
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Se for divisível por outro número que não seja 1 ou ele mesmo, não é primo
            }
        }
        return true; // Se não for divisível por nenhum outro número, é primo
    }

    // Um ano bissexto é aquele que é divisível por 4, exceto:
    // - Os anos divisíveis por 100, mas não por 400.
    // Portanto, podemos verificar se o ano atende a essas condições.    
    public boolean verificarAnoBissexto(int ano) {

        boolean divisivelPor4 = ano % 4 == 0;
        boolean divisivelPor100 = ano % 100 == 0;
        boolean divisivelPor400 = ano % 400 == 0;

        // Verifica se o ano é divisível por 4 e não por 100,
        // ou se é divisível por 400, para determinar se é bissexto.
        return (divisivelPor4 && !divisivelPor100) || divisivelPor400;
    }
}
