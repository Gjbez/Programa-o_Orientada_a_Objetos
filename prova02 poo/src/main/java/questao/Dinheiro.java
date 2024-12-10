/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao;

/**
 *
 * @author gbez
 */
public class Dinheiro extends Pagamento {

    private float valorPago;

    public Dinheiro(Comanda comanda, float valorPago) {
        super(comanda);
        if (valorPago <= 0) {
            throw new IllegalArgumentException("Valor pago deve ser maior que zero.");
        }
        this.valorPago = valorPago;
    }

    @Override
    public float calcularDesconto() {
        float valorComanda = comanda.calcularValorComanda();
        return valorComanda * 0.10f; 
    }

    public float calcularTroco() {
        float totalComanda = calcularTotalComanda();
        if (valorPago < totalComanda) {
            throw new IllegalArgumentException("Valor pago é insuficiente para cobrir o valor total da comanda.");
        }
        return valorPago - totalComanda;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        if (valorPago <= 0) {
            throw new IllegalArgumentException("Valor pago deve ser maior que zero.");
        }
        this.valorPago = valorPago;
    }
}