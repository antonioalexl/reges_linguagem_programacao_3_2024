/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaencapsulamento;

/**
 *
 * @author anton
 */
public class Pessoa {

    public String nome;
    public String documento;
    public String endereco;
    public String tipoPessoa;

    public void setNome(String valor) {
        this.nome = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setDocumento(String valor) {
        if (valor.length() > 11) {
            this.tipoPessoa = "Juridica";
        } else if (valor.length() == 11) {
            this.tipoPessoa = "Fisica";
        } else {
            this.tipoPessoa = "Documento Inválido";
        }
        this.documento = valor + " BRASIL";

    }
    
    public String getDocumento(){
        return this.documento;
       }
    public String getTipoPessoa(){
        
        return this.tipoPessoa;
    }

}
