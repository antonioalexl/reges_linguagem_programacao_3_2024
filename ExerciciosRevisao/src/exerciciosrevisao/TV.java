/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosrevisao;

/**
 *
 * @author anton
 */
public class TV {
    public boolean ligado;
    public int canal;
    public int volume;

  

    public void ligarDesligar() {
        if (ligado) {
            System.out.println("A TV foi desligada.");
            ligado = false;
        } else {
            System.out.println("A TV foi ligada.");
            ligado = true;
        }
    }

    public void aumentarVolume() {
        if (ligado && volume < 10) {
            volume++;
            System.out.println("Volume aumentado para " + volume);
        } else {
            System.out.println("O volume não pode ser aumentado.");
        }
    }

    public void reduzirVolume() {
        if (ligado && volume > 0) {
            volume--;
            System.out.println("Volume reduzido para " + volume);
        } else {
            System.out.println("O volume não pode ser reduzido.");
        }
    }

    public void trocarCanal(int novoCanal) {
        if (ligado && novoCanal >= 1 && novoCanal <= 50) {
            canal = novoCanal;
            System.out.println("Canal trocado para " + canal);
        } else {
            System.out.println("Canal inválido.");
        }
    }

    
}
