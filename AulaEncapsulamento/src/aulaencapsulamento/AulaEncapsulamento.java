/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaencapsulamento;

/**
 *
 * @author anton
 */
public class AulaEncapsulamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Pessoa p = new Pessoa();
        p.setNome("Gonzaguinha");

        System.out.println("O nome da pessoa e: " + p.getNome());

        p.setNome("Angelo");

        System.out.println("O nome da pessoa e: " + p.getNome());

        p.setDocumento("55493257726");
        System.out.println("O documento do cidadao e: " + p.getDocumento() + " e uma pessoa: " + p.getTipoPessoa());
        
        System.out.println("--------------------------------------");
        Pessoa p1 = new Pessoa();
        p1.documento = "48709343000156";
        p1.nome  = "Stark Industries";
        p1.tipoPessoa = "Física";
        
         System.out.println("O documento do cidadao e: " + p1.getDocumento() + " e uma pessoa: " + p1.getTipoPessoa());

        

    }

}
