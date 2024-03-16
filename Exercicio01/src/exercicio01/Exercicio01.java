/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio01;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        int faturamentoJaneiro = 1500;
        int faturamentoFevereiro = 4500;
        int faturamentoMarco = 9800;
        int faturamentoTrimestre = faturamentoJaneiro + faturamentoFevereiro + faturamentoMarco;
        System.out.println("O Faturamento do trimestre e: " + faturamentoTrimestre);

        System.out.println("---------------------------------------------");

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o faturamento de janeiro: ");
        int faturamento01 = scan.nextInt();

        System.out.print("Digite o faturamento de fevereiro: ");
        int faturamento02 = scan.nextInt();

        System.out.print("Digite o faturamento de março: ");
        int faturamento03 = scan.nextInt();
        
        System.out.println("O Resultado é " + (faturamento01 + faturamento02 + faturamento03));

    }

}
