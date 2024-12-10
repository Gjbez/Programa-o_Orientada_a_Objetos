/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gbez
 */
public class Bairro {
    
    private String nome;
    private double coeficienteIptu;

    
    public void setNome(String nome) {
        if(nome == null) {
            throw new IllegalArgumentException("nome precisa ser preenchido ");
        }
        this.nome = nome;
    }

    public void setCoeficienteIptu(double coeficienteIptu) {
        if(coeficienteIptu <= 0) {
            throw new IllegalArgumentException("valor incorreto para coeficiente: " + coeficienteIptu);
        }
        this.coeficienteIptu = coeficienteIptu;
    }

    public String getNome() {
        return nome;
    }

    public double getCoeficienteIptu() {
        return coeficienteIptu;
    }
    
}
