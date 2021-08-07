/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at9.mediator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vitor.marcelino
 */
public class DeveloperJRTest {
    
    @Test
    public void testSendCodeToProductio_Approve() {
        DeveloperJR devJR = new DeveloperJR();
        var result = devJR.sendCodeToProduction("Vitor");
        System.out.println(result);
        assertEquals("O código do autor = Vitor foi aprovado - O código está no ambiente de produção", result);
    }
    
}
