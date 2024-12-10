/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author gbez
 */
public class Quadrado extends FormulaGeometrica {
    
    public float lado;
    
    public Quadrado(float lado) {
        setLado(lado);
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float area() {
        return (float) Math.pow(lado, 2);
    }

    @Override
    public float perimetro() {
        return (float) lado*4;
    }  
}
