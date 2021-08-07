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
public class CodeReviewer {
    private static CodeReviewer instance = new CodeReviewer();

    private CodeReviewer() {}

    public static CodeReviewer getInstance() {
        return instance;
    }
    
    public String receiveAndApproveCode(String author) {
        return "O código do autor = "+author+ " foi aprovado - " + ProductionEnvironment.getInstance().receiveCode();
    }
}
