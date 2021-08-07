/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at9.interpreter;

/**
 *
 * @author vitor.marcelino
 */
public class Subtracao  implements IInterpretadorExpressao {
    private double x;
    private double y;

    public Subtracao (double elementoEsquerda, double elementoDireita) {
        x = elementoEsquerda;
        y = elementoDireita;
    }

    public double interpretar() {
        return x - y;
    }
}
