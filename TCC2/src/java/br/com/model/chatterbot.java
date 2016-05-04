/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;

/**
 *
 * @author trentin
 */
public class chatterbot {
    
    private String name;
    private int id;
    private Chat chatSession;

    public chatterbot(String name, int id) {
        this.name = name;
        this.id = id;
        
        String pathAIML = "src/resources";
        
        Bot bot = new Bot(name, pathAIML);
        
        this.chatSession = new Chat(bot, false);        
    }
    
    public Chat getChat() {
        return this.chatSession;
    }
    
    public int getId() {
        return this.id;
    }
    
}
