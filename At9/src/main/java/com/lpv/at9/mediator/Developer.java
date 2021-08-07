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
public class Developer {
    public String sendCodeToProduction(String author) {
        return CodeReviewer.getInstance().receiveAndApproveCode(author);
    }
}
