/**
 I swear I, for the most part don't know what I am doing for now all
 * I know  is I am trying to create an interface
 */

package game;

import java.awt.*;
import javax.swing.*;




/**
 *
 * @author meep
 */
public class HangmanPanel extends JPanel 
{
  char [] charsAvailable;
  char [] charsUsed;
  char [] charsGuessed;
  /**
   * holds the input box and submit button
   */
  JPanel panel1 = new JPanel();
  /**
   * holds the letters 
   */
  
  JPanel panel2 = new JPanel();
  JButton submitButton = new JButton("Submit");
  
  
  //________________Images____________
  
  ImageIcon start,i1,i2,i3,i4,i5,i6,i7,end,current;
  
  
   ///////////////////////////////////// 
  
  
  
    HangmanPanel (){
    //first lets create a wordgenerator object   
        
        super(new GridLayout(4,1));//3 rows 1 column
        
        
        
    wordgenerator word = new wordgenerator(); //this is the word
    
    
    
    
    
    
         JLabel j = new JLabel(" Yay I finally buil the thing,"+
                  "this makes me very happy.",JLabel.CENTER);
    add(j)  ;
       
       
        wordToJLabel(word);//this builds the empty JLabels and is
        //latter used for the painting the char to its space.
        
        
        
        
       //input box + submit button
        JTextField textField = new JTextField(5);
        
        panel1.add(textField);
        panel1.add(submitButton);
        add(panel1);
pics();          

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
   
    panel2.setPreferredSize(new Dimension(600 , 50));
       
       
    String theword = wordpassed.toString(); //wordgenerator --> String
      
    char charArray []= theword.toCharArray(); //word to char array
     setCharsAvailable(charArray); // tells the program the characters in word
    
   JLabel JLabelArray [] = new JLabel[charArray.length] ; //creates jlabelarray
   
   int n = 0; //used on loop below
   
   
   //creates JLabels
   while (n < charArray.length)
   {
       
       //adds the spaces might delete if presents issue later
       JLabelArray[n] =  new JLabel("-");
       panel2.add(JLabelArray[n]);
       
       
       
       
       n ++; // add plus two ensures space in between is not overriden
add(panel2);
       
   }
    
    }//end wordToJLabel
   
   
   public void game ()
   { 
           /**chars that can be used in the array 
            * 
            */
      char [] gameCharsAvailable = new char[charsAvailable.length] ;
      gameCharsAvailable = getCharsAvailable();
      
      /**
       * chars that have been used
       * used to count game progress
       */
  char [] gamecharsUsed = new char[charsAvailable.length * 3] ;
         
  /**
   * correct guesses
   * 
   */
  
  char [] gamecharsGuessed= new char[charsAvailable.length ] ;
      /**
       * when correct guesses equals this game ends
       */
   int youwin = charsAvailable.length;
   
   
   while (gamecharsGuessed.length != youwin){
   
   
   
   } 
   
   }//end class game  
   
   
   //____________________set image icons to respective pic_________________
   
   void pics(){
   start = new ImageIcon("start.png");
   i1 = new ImageIcon("1.png");
   i2 = new ImageIcon("2.png");
   i3 = new ImageIcon("3.png");
   i4 = new ImageIcon("4.png");
   i5 = new ImageIcon("5.png");
   i6 = new ImageIcon("6.png");
   i7 = new ImageIcon("7.png");
   end = new ImageIcon("end.png");
   
   int si=3;
   
   
   switch(si){
       
       case 0: current = new ImageIcon("start.png");
           break;
       case 1: current = new ImageIcon("1.png");
           break;
       case 2: current = new ImageIcon("2.png");
           break;
       case 3: current = new ImageIcon("3.png");
           break;
       case 4: current = new ImageIcon("4.png");
           break;
       case 5: current = new ImageIcon("5.png");
           break;
       case 6: current = new ImageIcon("6.png");
           break;
       case 7: current = new ImageIcon("7.png");
           break;
       case 8: current = new ImageIcon("end.png");
           break;
       
       
   
   default: current = new ImageIcon("start.png"); ;   
       break;
            
    }//end switch
   JLabel thes = new JLabel(current);
   add(thes);
   
   
  
   }

   
   
   
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
   
  //------------------------------  compare array
    
    
    
    
    
}//end HangmanPanel class


/* code that may be useful

//repainting
{
this.validate();
this.repaint();
}               





*/