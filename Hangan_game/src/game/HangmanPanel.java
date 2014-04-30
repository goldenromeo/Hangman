/**
 I swear I, for the most part don't know what I am doing for now all
 * I know  is I am trying to create an interface
 */

package game;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.imageio.*;
import java.io.*;
import java.awt.image.*;




/**
 *
 * @author meep
 */
public class HangmanPanel extends JPanel 
{
  char [] charsAvailable;
  char [] charsUsed;
  char [] charsGuessed;
  
  
    HangmanPanel (){
    //first lets create a wordgenerator object   
        
    wordgenerator word = new wordgenerator(); //this is the word
    
    
         JLabel j = new JLabel("Yay I finally buil the thing, "+
                  "this actually made me happy. ");
       this.add(j)  ;
       
       
        wordToJLabel(word);//this builds the empty JLabels and is
        //latter used for the painting the char to its space.
        
        
        
        
        //might use or might not use on keyboard press event
        JTextField textField = new JTextField(5);
        this.add(textField);
          

        //play the game 
        game();
        
        
        
    }//end constructor
    
    
      /**
       * When called this method will convert 
       * the wordgenerator objects to JLabels 
       * the JLabels objects are created and painted
       * first in first out for convenience.
       * 
       * the conversion is done in the following form
       * wordgenerator --> String --> char array --> JLabel.
       * 
       * 
       * @param wordpassed the wordgenerator object passed
       */
    
   private void wordToJLabel(wordgenerator wordpassed ){
    
    
    String theword = wordpassed.toString(); //wordgenerator --> String
      
    char charArray []= theword.toCharArray(); //word to char array
     setCharsAvailable(charArray); // tells the program the characters in word
    
   JLabel JLabelArray [] = new JLabel[charArray.length * 2] ; //creates jlabelarray
   
   int n = 0; //used on loop below
   
   
   //creates JLabels
   while (n < charArray.length)
   {
       
       //adds the spaces might delete if presents issue later
       JLabelArray[n] =  new JLabel("-");
       this.add(JLabelArray[n]);
       
       
       
       //adds spaces between characters
       JLabelArray[n + 1] =  new JLabel("     ");
       this.add(JLabelArray[n+1]);
       

       n = n+ 2; // add plus two ensures space in between is not overriden

       
   }
    
    }//end wordToJLabel
   
   
   public void game ()
   { 
           
      char [] gameCharsAvailable = new char[charsAvailable.length] ;
      gameCharsAvailable = getCharsAvailable();
      
  char [] gamecharsUsed = new char[charsAvailable.length * 3] ;
      
      
  char [] gamecharsGuessed= new char[charsAvailable.length ] ;
      

   
   int youwin = charsAvailable.length;
   
   
   while (gamecharsGuessed.length != youwin){} 
   
   
   
   
   
   }//end class game  
         

   
   
   
   ///////////////////////// Getters and Setters ///////////////
   
   
   /**
     * @return the charsAvailable
     */
    private char [] getCharsAvailable() {
        return charsAvailable;
    }

    /**
     * @return the charsUsed
     */
    private char[] getCharsUsed() {
        return charsUsed;
    }

    /**
     * @return the charsGuessed
     */
    private char[] getCharsGuessed() {
        return charsGuessed;
    }

    /**
     * @param charsAvailable the charsAvailable to set
     */
    private void setCharsAvailable(char[] charsAvailable) {
        this.charsAvailable = charsAvailable;
    }

    /**
     * @param charsUsed the charsUsed to set
     */
    private void setCharsUsed(char[] charsUsed) {
        this.charsUsed = charsUsed;
    }

    /**
     * @param charsGuessed the charsGuessed to set
     */
    private void setCharsGuessed(char[] charsGuessed) {
        this.charsGuessed = charsGuessed;
    }
   
    
    
    
    
    
}//end HangmanPanel class


/* code that may be useful

//repainting
{
this.validate();
this.repaint();
}               





*/