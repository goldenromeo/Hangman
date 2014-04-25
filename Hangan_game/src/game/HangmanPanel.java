/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;

import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;
import java.awt.image.*;




/**
 *
 * @author meep
 */
public class HangmanPanel extends JPanel {
  //*  
       // String meep ;
   // meep = new String (wordgenerator.generateWord());
    // */
    
    HangmanPanel (){
         
      int again;
      do 
      {
        
game();
         again = JOptionPane.showConfirmDialog (null, "Would you like to play?");
      }
      while (again == JOptionPane.YES_OPTION);



        
    }//end constructor
    
    
    
    
    
 
    
    
    public void game (){
    
        
        String word = new wordgenerator().toString();
        int i = 0, wordLength = word.length();
        
        while (wordLength > i)
        {
           createtop();
            //createmiddle();
           //createbottom();
        
        
        
        
        }
        
        
    }
    
    /** createtop() creates the banner 
     * the banner is beautiful
     * that's all it does
     * 
     */
    
  public void createtop(){ 
  
      BufferedImage img = null;
try {
    img = ImageIO.read(new File("banner.png"));
} catch (IOException e) {
}
      
      
  
  
  }  
    
    
    
    
    
    
        
    
    
}//end HangmanPanel class



