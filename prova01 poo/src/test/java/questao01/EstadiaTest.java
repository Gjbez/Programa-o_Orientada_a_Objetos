/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package questao01;

import model.Estadia;
import model.Periodo;
import java.text.DecimalFormat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gbez
 */
public class EstadiaTest {
    
    private static Periodo p;
    private static Estadia e;
    private static DecimalFormat df;
    
    @BeforeAll
    public static void setUpclass() {
    e = new Estadia(Periodo periodo, quantidadeDias);
    p = new Periodo();
    df = new DecimalFormat("0.00");
    }
    
    @Test
    public void Caso1() {
    e.setPeriodo(p.ALTA_TEMPORADA);
    e.setQuantidadeDias(8);
    assertEquals(df.format(e.precoPagar()), "1411,20");
    }
    
    @Test
    public void Caso2() {
    e.setPeriodo(p.MEDIA_TEMPORADA);
    e.setQuantidadeDias(1);
    assertEquals(df.format(e.precoPagar()), "157,50");
    }
    
    @Test
    public void Caso3() {
    e.setPeriodo(p.BAIXA_TEMPORADA);
    e.setQuantidadeDias(5);
    assertEquals(df.format(e.precoPagar()), "525,00");
    }
    
    @Test
    public void Caso4() {
    e.setPeriodo(p.BAIXA_TEMPORADA);
    e.setQuantidadeDias(1);
    assertEquals(df.format(e.precoPagar()), "110,25");
    }
    
    @Test
    public void Caso5() {
    e.setPeriodo(p.MEDIA_TEMPORADA);
    e.setQuantidadeDias(3);
    assertEquals(df.format(e.precoPagar()), "450,00");
    }
    
}
