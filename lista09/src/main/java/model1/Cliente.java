/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model1;

/**
 *
 * @author gbez
 */
public class Cliente {
    
    private String nome;
    private String endereco;

    public Cliente(String nome, String endereco) {
        setNome(nome);
        setEndereco(endereco);
    }
    
    public void setNome(String nome) {
         if(nome.isBlank()){
        throw new IllegalArgumentException("Nome deve ser preenchido");
        }
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
         if(endereco.isBlank()){
        throw new IllegalArgumentException("Endereço deve ser preenchido");
        }
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
    
}
