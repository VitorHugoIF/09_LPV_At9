/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at9.interpreter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vitor.marcelino
 */
public class InterpretadorExpressaoTest {
    
    @Test
    public void testDeveCalcularDesconto() {
        IInterpretadorExpressao interpretador = new InterpretadorDeDesconto("100 - 10%");
        assertEquals(90.0, interpretador.interpretar());
    }
    
    @Test
    public void testDeveRetornarExcessaoNumeroElementos() {
        try {
            IInterpretadorExpressao interpretador = new InterpretadorDeDesconto("100- 10%");
            assertEquals(90.0, interpretador.interpretar());
            fail();
        } catch(IllegalArgumentException e) {
            assertEquals("Expressão inválida, devem exisitr apenas 3 elementos separados por espaço em branco", e.getMessage());
        }
    }
    
    @Test
    public void testDeveRetornarExcessaoPorcentagem() {
        try {
            IInterpretadorExpressao interpretador = new InterpretadorDeDesconto("100 - 10");
            assertEquals(90.0, interpretador.interpretar());
            fail();
        } catch(IllegalArgumentException e) {
            assertEquals("Expressão inválida, porcentagem inválida", e.getMessage());
        }
    }
    
    @Test
    public void testDeveRetornarExcessaoOperacao() {
        try {
            IInterpretadorExpressao interpretador = new InterpretadorDeDesconto("100 + 10%");
            assertEquals(110.0, interpretador.interpretar());
            fail();
        } catch(IllegalArgumentException e) {
            assertEquals("Expressão inválida, somente aceito a operação de subtração", e.getMessage());
        }
    }
}
