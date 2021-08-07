/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at9.interpreter;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author vitor.marcelino
 */
public class InterpretadorDeDesconto implements IInterpretadorExpressao {
    
    private IInterpretadorExpressao interpretadorInicial;

    public InterpretadorDeDesconto(String contexto) {
        List<String> elementos = Arrays.asList(contexto.split(" "));
        
        if(elementos.size() != 3) {
            throw new IllegalArgumentException("Expressão inválida, devem exisitr apenas 3 elementos separados por espaço em branco");
        }
        
        double valor = Double.parseDouble(elementos.get(0));
        String expressao = elementos.get(1);
        double porcentagem = new Porcentagem(elementos.get(2)).interpretar();
        double valorPorcentagemDesconto = valor * porcentagem;
        
        if(!expressao.equals("-")) {
            throw new IllegalArgumentException("Expressão inválida, somente aceito a operação de subtração");
        }
        
        interpretadorInicial = new Subtracao(valor, valorPorcentagemDesconto);
    }

    @Override
    public double interpretar() {
        return interpretadorInicial.interpretar();
    }
}
