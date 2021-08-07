/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at9.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author vitor.marcelino
 */
public class Porcentagem implements IInterpretadorExpressao{
    
    private String porcentagem;

    public Porcentagem(String porcentagem) {
        this.porcentagem = porcentagem;
    }

    public String getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(String porcentagem) {
        this.porcentagem = porcentagem;
    }
    
    @Override
    public double interpretar() {
        Pattern p = Pattern.compile("^([0-9]+)(\\W)");
        Matcher m = p.matcher(this.porcentagem);
        
        if (m.find()){
            double numero = Double.parseDouble(m.group(1));
            return numero/100;
        }
        
        throw new IllegalArgumentException("Expressão inválida, porcentagem inválida");
    }
    
}
