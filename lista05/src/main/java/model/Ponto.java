/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gbez
 */
public class Ponto {

    private int x;
    private int y;

    public Ponto() {
        x = 0;
        y = 0;
    }

    public Ponto(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Quadrante identificarQuadrante() {

        if (x > 0 && y > 0) {
            return Quadrante.PRIMEIRO;
            
        } else if (x < 0 && y > 0) {
            return Quadrante.SEGUNDO;
            
        } else if (x < 0 && y < 0) {
            return Quadrante.TERCEIRO;
            
        } else if (x > 0 && y < 0) {
            return Quadrante.QUARTO;
        }
        return Quadrante.NENHUM;
    }

    public boolean estaincididoSobreX() {
        if (this.x == 0){
        return true;
        }
        return false;
    }

    public boolean estaincididoSobreY() {
        if (this.y == 0){
        return true;
        }
        return false;
    }

    public double calcularDistancia(Ponto ponto) {
        int difx = ponto.getX() - this.getX();
        int dify = ponto.getY() - this.getY();
        
        double difxquadrado = Math.pow(difx, 2);
        double difyquadrado = Math.pow(dify, 2);
        
        double soma = difxquadrado + difyquadrado;
        
        return Math.sqrt(soma);
    }

    public double calcularDistancia(Ponto p1, Ponto p2) {
        int difx = p2.getX() - p1.getX();
        int dify = p2.getY() - p1.getY();
        
        double difxquadrado = Math.pow(difx, 2);
        double difyquadrado = Math.pow(dify, 2);
        
        double soma = difxquadrado + difyquadrado;
        
        return Math.sqrt(soma);
    }

}
