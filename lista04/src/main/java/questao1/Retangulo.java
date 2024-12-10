/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1;

/**
 *
 * @author gbez
 */
public class Retangulo {

    private int altura;
    private int comprimento;

    /**
     * cria uma instancia de um retângulo vazio
     */
    public Retangulo() {
    }
    //   altura = 0;
    //   comprimento = 0;

    /**
     *
     * @param altura
     * @param comprimento
     */
    public Retangulo(int altura, int comprimento) {
        setAltura(altura);
        setComprimento(comprimento);
    }

    public void setAltura(int altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("valor incorreto para altura: " + altura);
        }
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setComprimento(int comprimento) {
        if (comprimento <= 0) {
            throw new IllegalArgumentException("valor incorreto para comprimento: " + comprimento);
        }
        this.comprimento = comprimento;
    }

    public int getComprimento() {
        return comprimento;
    }

    /**
     * calcula o perimetro do retangulo
     *
     * @return
     */
    public int calcularPerimetro() {
        return (comprimento + comprimento + altura + altura);

    }

    /**
     * calcula área do retangulo
     *
     * @return
     */
    public int calcularArea() {
        return (comprimento * altura);
    }
}
