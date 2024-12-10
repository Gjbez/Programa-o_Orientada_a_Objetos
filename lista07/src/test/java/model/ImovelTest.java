/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package model;

import java.text.DecimalFormat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class ImovelTest {
    
    public ImovelTest() {
    }
    
    private static Imovel i;
    private static Bairro b;
    private static DecimalFormat df;
    
    @BeforeAll
    public void inicializarSistema() {
    i = new Imovel();
    b = new Bairro();
    df = new DecimalFormat("0.00");
    }
    
    @Test
    public void testImovel1() throws Exception {
    i.setArea(-5);
    }
    
    @Test
    public void testImovel2(){
    i.setArea(400);
    i.setFinalidade(Finalidade.RESIDENCIAL);
    b.setCoeficienteIptu(1);
    i.setBairro(b);
    assertEquals(400, i.calcularIptu());
    }
    
    // assertEquals(i.identificarFaixaIrpf(),FaixaIrpf.PRIMEIRA);
    //assertEquals(df.format(calcularIrpf()), "0.00");
}
