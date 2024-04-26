/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciopraticar;

/**
 *
 * @author anton
 */
public class CalculadoraArea {
    // Método para calcular a área do círculo
    public  double calcularAreaCirculo(double raio) {
        return Math.PI * raio * raio;
    }

    // Método para calcular a área do quadrado
    public  double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    // Método para calcular a área do retângulo
    public  double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }

    // Método para calcular a área do triângulo
    public  double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

}