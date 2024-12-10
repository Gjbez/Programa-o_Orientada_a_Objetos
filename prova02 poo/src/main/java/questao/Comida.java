/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao;

import javax.swing.JOptionPane;

/**
 *
 * @author gbez
 */
public class Comida extends Item{
    
    public Comida(String nome, float valor) {
        super(nome, valor);
    }
    
    @Override
    public String ImprimirItem(){
    String dado = "";
        dado += "o valor do " + getNome() + " de hoje é R$" + getValor();
        return dado;
    }   
    
}
