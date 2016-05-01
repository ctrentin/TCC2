/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bottest;

import org.alicebot.ab.*;

/**
 *
 * @author trentin
 * 
 * Classe para testar o chatterbot passando por linha de comando
 * Deste modo, o resultado é apresentado no Console
 * 
 */
public class bottest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String botname = "carlosbot";
        String pathAIML = "src/resources";
                
        Bot bot = new Bot(botname, pathAIML);
        
        Chat chatSession = new Chat(bot);
        //chatSession.chat();
        
        String resposta = chatSession.multisentenceRespond("asdhasda");
        System.out.println(resposta);
                
    }
    
}
