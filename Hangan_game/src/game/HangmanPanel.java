/**
 I swear I, for the most part don't know what I am doing for now all
 * I know  is I am trying to create an interface
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
    //first lets create a wordgenerator object     
    wordgenerator word = new wordgenerator();
    
        


        
    }//end constructor
    
    
      
    
   private void wordtochars(wordgenerator wordpassed ){
    
    
    String theword = wordpassed.toString();
    int index = 0;
       
    
    char charArray []= theword.toCharArray();
    
   JLabel JLabelArray [];
   int n = 0;
   
   while (n < charArray.length)
   {
   }
    
    }
    
    
    
    
    
}//end HangmanPanel class



