/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author gbez
 */
public class Triangulo extends FormulaGeometrica {
    
    public float base;
    public float altura;
    
    public Triangulo(float base, float altura, float lado) {
        setBase(base);
        setAltura(altura);
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float area() {
        return (float) (base*altura)/2;
    }

    @Override
    public float perimetro() {
        float lado = ((base/2) * altura);
        return (float) (2*lado + base);
    }
}

