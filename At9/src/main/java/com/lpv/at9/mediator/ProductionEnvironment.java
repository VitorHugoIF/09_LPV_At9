/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at9.mediator;

/**
 *
 * @author vitor.marcelino
 */
public class ProductionEnvironment implements IEnvironment {
    private static ProductionEnvironment instance = new ProductionEnvironment();

    private ProductionEnvironment() {}

    public static ProductionEnvironment getInstance() {
        return instance;
    } 
    
    @Override
    public String receiveCode() {
        return "O código está no ambiente de produção";
    }
}
