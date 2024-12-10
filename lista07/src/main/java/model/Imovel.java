/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gbez
 */
public class Imovel {
    
    private String endereco;
    private int area;
    private Finalidade finalidade;
    private Bairro bairro;
    

    public double calcularIptu(){
    
        if(area <= 100){
            return area = 500;
        }
        else if(area > 100 && area <= 400){
            return area = 1000;
        }
        else if(area > 400){
            return area *= 2.55;      
        }
        return area;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setArea(int area) {
        if(area <= 0) {
            throw new IllegalArgumentException("valor incorreto para area: " + area);
        }
        this.area = area;
    }
    
    public void setBairro(Bairro bairro) {
        if(bairro == null) {
            throw new IllegalArgumentException("bairro precisa ser preenchido ");
        }
        this.bairro = bairro;
    }
    
    public void setFinalidade(Finalidade finalidade) {
        if(finalidade == null) {
            throw new IllegalArgumentException("finalidade precisa ser preenchida ");
        }
        this.finalidade = finalidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getArea() {
        return area;
    }
    
    public Bairro getBairro(Bairro bairro){
        return bairro;
    }
    
    public Finalidade getFinalidade(Finalidade finalidade){
        return finalidade;
    }
    
}
