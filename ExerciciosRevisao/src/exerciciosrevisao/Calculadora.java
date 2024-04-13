/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosrevisao;

/**
 *
 * @author anton
 */
import java.util.Scanner;

public class Calculadora {

    public int soma(int v1, int v2) {
        return v1 + v2;
    }

    public void somaImpressao(int v1, int v2) {
        int total = v1 + v2;
        System.out.println("Soma: " + total);
    }

    public void somaUsuario() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        int v1 = scan.nextInt();

        System.out.println("Digite um numero");
        int v2 = scan.nextInt();

        int total = v1 + v2;
        System.out.println("Soma: " + total);
    }

    public int subtracao(int v1, int v2) {
        return v1 - v2;
    }

    public int divisao(int v1, int v2) {
        return v1 / v2;
    }

    public int multiplicacao(int v1, int v2) {
        return v1 * v2;
    }

}
