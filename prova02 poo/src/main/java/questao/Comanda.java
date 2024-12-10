/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao;
 
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gbez
 */
public class Comanda {

    private TipoBuffet tipobuffet;
    private ArrayList<Item> item;

    public Comanda(TipoBuffet tipobuffet) {
        item = new ArrayList<>();
        setTipobuffet(tipobuffet);
    }

    public float calcularValorComanda() {

        float valorc = 0;

        for (Item it : getItem()) {
            if (getTipobuffet() == TipoBuffet.LIVRE) {
                if (it instanceof Bebida || it instanceof Couvert) {
                    valorc += it.getValor();
                }
            } else {
                valorc += it.getValor();
            }
        }
        if(getTipobuffet() == TipoBuffet.LIVRE){
        return valorc + 30;
        }
        
        return valorc;
    }

    public void incluirItem(Item i) throws IllegalArgumentException {
        if (i == null) {
            throw new IllegalArgumentException("Item inválido");
        }
        item.add(i);
    }

    private Item buscar(String nome, float valor) {
        for (Item i : getItem()) {
            if (i.getValor() == valor && i.getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return null;
    }

    public void removerItem(String nome, float valor) {
        Item removeritem = buscar(nome, valor);
        if (removeritem == null) {
            throw new IllegalArgumentException("Item deve ser informado");
        }
        item.remove(removeritem);
    }

    public void setTipobuffet(TipoBuffet tipobuffet) {
        if (tipobuffet == null) {
            throw new IllegalArgumentException("Tipo do Buffet deve ser informado");
        }
        this.tipobuffet = tipobuffet;
    }

    public TipoBuffet getTipobuffet() {
        return tipobuffet;
    }

    public ArrayList<Item> getItem() {
        return item;
    }
}
