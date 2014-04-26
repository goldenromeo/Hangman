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
    
    
    while ( index < theword.length())
    {
        
        char [] theleters = new char [20];
        
    
        
        // char[n]= theword.charAt( (index - 1) ); this doesn't work ill try to fix tomorow
        
        
        index++;
        
    }
    
    
    
    }
    
    
    
    
    
}//end HangmanPanel class



