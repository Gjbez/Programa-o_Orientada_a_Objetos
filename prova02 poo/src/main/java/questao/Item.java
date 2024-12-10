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
public abstract class Item {
    
    private String nome;
    private float valor;
    
    public Item(String nome, float valor){
    setNome(nome);
    setValor(valor);
    }
    
    public abstract String ImprimirItem();
    

    public void setNome(String nome) {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Nome da Comida não pode ser vazio");
        }
        this.nome = nome;
    }

    public void setValor(float valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor da Comida deve ser maior que 0"); 
        }
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }
    
    
}
