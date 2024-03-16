/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;


import java.util.Scanner;
        
public class HelloWorld {

   
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Hello World");
        
        int a = 6; //CRIA A VARIAVEL DE NOME A DO TIPO INT E ATRIBUI O VALOR 6 A ELA
        int b = 5;//CRIA A VARIAVEL DE NOME B DO TIPO INT E ATRIBUI O VALOR 5 A ELA
        
        int resultado = a + b; //CRIA A VARIAVEL DE NOME RESULTADO DO TIPO INT E ATRIBUI A SOMA DO VALOR DE A + B
        
        System.out.println("resultado:" + resultado); //IMPRIME O VALOR DA VARIAVEL RESULTADO NO CONSOLE
        
        
        
        System.out.println("Digite um numero"); // IMPRIME A FRASE DIGITE UM NUMERO NO CONSOLE
        Scanner alface = new Scanner(System.in);  // CRIA UM OBJETO DA CLASSE SCANNER
      
        int c = alface.nextInt(); // RECUPERA O VALOR QUE O USUÁRIO DIGITOU
       
        
        System.out.println("o usuário digitou:" + c); // IMPRIME O VALOR DA VARIAVEL NO CONSOLE
        
    }
    
}
