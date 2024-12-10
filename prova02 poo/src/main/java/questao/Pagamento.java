/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao;

/**
 *
 * @author gbez
 */
public class Pagamento {

    Comanda comanda;

    public Pagamento(Comanda comanda) {
        if (comanda == null) {
            throw new IllegalArgumentException("Comanda não pode ser nula.");
        }
        this.comanda = comanda;
    }

    public float calcularTotalComanda() {
        float valorComanda = comanda.calcularValorComanda();
        return valorComanda - calcularDesconto();
    }

    public void pagar(float valorPago) {
        if (valorPago <= 0) {
            throw new IllegalArgumentException("Valor de pagamento deve ser maior que zero.");
        }

        float totalComanda = calcularTotalComanda();
        if (valorPago < totalComanda) {
            throw new IllegalArgumentException("Valor pago é insuficiente.");
        }

        System.out.println("Pagamento realizado com sucesso!");
    }

    public float calcularDesconto() {
        float valorComanda = comanda.calcularValorComanda();
        if (valorComanda > 50) {
            return valorComanda * 0.05f;
        }
        return 0; 
    }

    public Comanda getComanda() {
        return comanda;
    }

    public void setComanda(Comanda comanda) {
        if (comanda == null) {
            throw new IllegalArgumentException("Comanda não pode ser nula.");
        }
        this.comanda = comanda;
    }
}