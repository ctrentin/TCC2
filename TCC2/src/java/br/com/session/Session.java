/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.session;

import br.com.model.chatterbot;

/**
 *
 * @author trentin
 */
public class Session {
    
    private String id;
    private chatterbot botSession;

    public Session(String id, chatterbot botSession) {
        this.id = id;
        this.botSession = botSession;
    }
    
    
    
}
