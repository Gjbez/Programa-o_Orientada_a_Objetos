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
public class Couvert extends Item {
    
    public Couvert(String nome, float valor) {
        super(nome, valor);
    }
    
    @Override
    public String ImprimirItem(){
    String dado = "";
        dado += "o valor do Couvert de hoje é R$" + getValor();
        return dado;
    }   
}
