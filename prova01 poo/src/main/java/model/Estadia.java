package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 
 * @author gbez
 */
public class Estadia {
    
    private Periodo periodo;
    private int quantidadeDias;

    /**
     * representa a diaria
     * @param periodo
     * @param quantidadeDias
     * @return 
     */
    public Periodo Diaria(Periodo periodo, int quantidadeDias){
         setPeriodo(periodo);
         setQuantidadeDias(quantidadeDias);
}

    Estadia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /**
     * método calcula o preço a ser pago nos períodos de Baixa,media e alta temporada
     * @return 
     */
    public float precoPagar(){
    float valorDiaria = 150.00f;

        switch (periodo) {
            case BAIXA_TEMPORADA:
                valorDiaria -= (valorDiaria*(30 * 100));
                break;
            case ALTA_TEMPORADA:
                valorDiaria += (valorDiaria*(20 * 100));; 
                break;
            case MEDIA_TEMPORADA:
                break;
        }
        return valorDiaria;
   }
    
    /**
     * método setter do atributo "periodo"
     * @param periodo 
     */
    public void setPeriodo(Periodo periodo){
    if(periodo == null || periodo.trim.equals("")) {
            throw new IllegalArgumentException("Período não pode estar vazio");
    }
   } 
    /**
     * método setter do atributo "quantidadeDias"
     * @param quantidadeDias 
     */
    public void setQuantidadeDias(int quantidadeDias){
    if(quantidadeDias <= 0) {
            throw new IllegalArgumentException("Período não pode estar vazio");
    }
    if(periodo == ALTA_TEMPORADA, quantidadeDias <= 4){
       throw new IllegalArgumentException("Período deve ser no mínimo 5 dias"); 
   }
  }
  /**
   * método getter do atributo "quantidadeDias"
   * @return 
   */ 
   public int getQuantidadeDias(){
   return quantidadeDias;
   } 
   
   /**
    * método getter do atributo "periodo"
    * @return 
    */
   public Periodo getPeriodo(){
   return periodo;
   }
}



