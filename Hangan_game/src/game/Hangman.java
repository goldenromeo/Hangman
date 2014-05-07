/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author meep
 */
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame frame = new JFrame("Hangman");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
        frame.getContentPane().add(new HangmanPanel());
        
        
        frame.pack();
        frame.setVisible(true);
        
   
 
    

    

     }
    
    
   public void newGame(){
        
        new HangmanPanel();
    
    }
    
    
}



