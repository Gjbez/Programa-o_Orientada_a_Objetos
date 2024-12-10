/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author gbez
 */
public class Circulo extends FormulaGeometrica {
    
    public float raio;
    
    public Circulo(float raio) {
        setRaio(raio);
    }
    
    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override //sobrescrita de método
    public float area() {
       return (float) (Math.PI * Math.pow(raio, 2));
    }

    @Override //sobrescrita de método
    public float perimetro() {
       return 2 * (float)Math.PI * raio;
    }

   
}
