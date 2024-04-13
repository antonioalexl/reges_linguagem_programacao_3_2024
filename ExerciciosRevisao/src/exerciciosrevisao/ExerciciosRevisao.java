/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosrevisao;

/**
 *
 * @author anton
 */
public class ExerciciosRevisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Exercicios exec = new Exercicios();
        exec.verificarNumero(8);
        
        exec.imprimirNumero(10, 30);
        
        
        Calculadora calc = new Calculadora();
        System.out.println(calc.soma(500, 100));
        calc.somaImpressao(5, 10);
        
        calc.somaUsuario();
        
        
        Cliente cli = new Cliente();
        cli.Nome = "Gonzaguinha";
        cli.Idade = 120;
        cli.Saldo = 120;
        cli.Endereco = "Rua da Reges";
        
        cli.RealizarCompra(100);
        cli.RealizarCompra(200);
        
        cli.Imprimir();
         
    }
    
}
