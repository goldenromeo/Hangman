/**
things are working better 
images and comparison needed
*/

package game;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;







/**
 *
 * @author meep
 */
public class HangmanPanel extends JPanel 
{
  char [] charsAvailable;
  
  /**
   * holds the input box and submit button
   */
  JPanel panel1 = new JPanel();
  /**
   * holds the letters 
   */
  
  JPanel panel2 = new JPanel();
  JButton submitButton ;
  
  
  //________________Images____________
          
        
        ImageIcon image0 = new ImageIcon(getClass().getResource("i0.png"));
        ImageIcon image1 = new ImageIcon(getClass().getResource("i1.png"));
        ImageIcon image2 = new ImageIcon(getClass().getResource("i2.png"));
        ImageIcon image3 = new ImageIcon(getClass().getResource("i3.png"));
        ImageIcon image4 = new ImageIcon(getClass().getResource("i4.png"));
        ImageIcon image5 = new ImageIcon(getClass().getResource("i5.png"));
        ImageIcon image6 = new ImageIcon(getClass().getResource("i6.png"));
        ImageIcon image7 = new ImageIcon(getClass().getResource("i7.png"));
        ImageIcon image8 = new ImageIcon(getClass().getResource("i8.png"));
        
        ImageIcon current = new ImageIcon(getClass().getResource("i0.png")); 
        JLabel pics = new JLabel(current);
        
        
        
        
//______________ end pics  
   


  
  
  //    create a wordgenerator object and text field items and compare
  
  JTextField textField = new JTextField(" ",10);//text field
  
  String textFieldValue;
      wordgenerator word = new wordgenerator(); //this is the word
//      compareArray compare = new compareArray();
JLabel JLabelArray [];  
   ///////////////////////////////////// 
  
  int guessed=0;//amount of items guessed only used to know when to say good job
   int failed=0;//used to determine picture shown
    HangmanPanel (){
        
       
    //first lets set layout
        
        super(new GridLayout(2,1));//4 rows 1 column
        //enabled on demo
        System.out.println(word.toString());
        
        
        
        
        
        

      
    
    
    
    
    ////////////////////////Welcome
         JLabel j = new JLabel(" Hi, to play enter the key you think "+
                  "is right and press enter\n Or click the submit button.",JLabel.CENTER);
    add(j)  ;
       
       
    //////////////////////end Welcome 
    
    
    
        wordToJLabel(word);//this builds the empty JLabels and is
        //latter used for the painting the char to its space.

        
       //input box + submit button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ButtonListener());
        
        
        textField.addActionListener(new ButtonListener());
        panel1.add(textField);
        panel1.add(submitButton);
        add(panel1);


        
        
         
       
       
        
    }    
    
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
   
    panel2.setPreferredSize(new Dimension(400 , 50));
       
       
    String theword = wordpassed.toString(); //wordgenerator --> String
      
    char charArray []= theword.toCharArray(); //word to char array
      
    
    JLabelArray  = new JLabel[charArray.length] ; //creates jlabelarray
   
   int n = 0; //used on loop below
   
   
   //creates JLabels
   while (n < charArray.length)
   {
       
       //adds the "-" characters that hold the space for the actual letter
       JLabelArray[n] =  new JLabel("-");
       panel2.add(JLabelArray[n]);
       
       
       n ++; // used above
}// end while loop
   //add pics here
   
   pics.setPreferredSize(new Dimension(300,300));
   add(pics);
   
   
   
   
   
   
   
   
   
   add(panel2);
   
    ////// set arrays to do something with this
    
       setCharsAvailable(charArray);// tells the program the characters in word
       
   
   
    
   
   
   
   
    
    }//end wordToJLabel
   
   

   
   
   
   ///////////////////////// Getters and Setters ///////////////
   
   
   /**
     * @return the charsAvailable
     */
    private char [] getCharsAvailable() {
        return charsAvailable;
    }

    
    
    /**
     * @param charsAvailable the charsAvailable to set
     */
    private void setCharsAvailable(char[] charsAvailable) {
        this.charsAvailable = charsAvailable;
    }

    

   
  //------------------------------  listener
    
    
     private class ButtonListener extends JPanel implements ActionListener{
    char [] charsAvailableChecker = getCharsAvailable();//chars available in value
            
        
            int [] theCheckerInt;
            char theCheckerChar;
             int whileLoopInt=0;
        
         
             
             
             
         
         @Override
        public void actionPerformed (ActionEvent event){
 textFieldValue = textField.getText();
               
               textField.setText("");
  char[] textFieldValueChar= textFieldValue.toCharArray();
  theCheckerChar = textFieldValueChar[0];
  
  try{  
  
  
  if (word.contains(textFieldValueChar[0])){
  //compare(word,textFieldValueChar[0])            ;
             //System.out.println(Arrays.toString(word.chartAt(textFieldValueChar[0])) +"oooo \n"
                //     + " \nb " + word.toString() + " \nc " + word.isFirstchar(textFieldValueChar[0])
             //);
             
  }        
             
if (word.contains(textFieldValueChar[0])){//if one if value is it
                          whileLoopInt=0;//don't delte ensures no out of bound exception
             
    if(word.isFirstchar(textFieldValueChar[0])){//checks if first letter
          
    JLabelArray[0].setText(word.theCharAt_String(0));
    
          
    }else{ //
    }//ends checking if first letter. below checks if other letter
        
    theCheckerInt = word.chartAt(theCheckerChar);
    
    for(int f: theCheckerInt ){
    
        if(theCheckerChar == word.theCharAt(whileLoopInt) && whileLoopInt <9   ){
        
         JLabelArray[whileLoopInt].setText(word.theCharAt_String(whileLoopInt));
        guessed++;
        }
        else{
        
        }
        
        whileLoopInt++;
        
    }//end for loop
         
             
             
  }else {//System.out.println("keep trying");
failed++;
}//ends first "if"  

  
            
  
        
        
        
        
        
        
        textField.setText("");
        
  }  catch (ArrayIndexOutOfBoundsException e) {

        //System.out.println("Sorry the program broke");

    }  //end try
           ImageChecker();
           //     System.out.println("guessed  "+ guessed);
             //System.out.println("failed:   " +failed);
  
  if (guessed == 9){
  JOptionPane.showMessageDialog(this, "Eggs are not supposed to be green.\n And"
          + " you won, congrats. \n\t I don't know what to say I "
          + "didn't expect you here.\n Have a Good day the game will close"
          + " after you press OK for your convenience.");
  
  
      
   FooWindow fooey = new FooWindow();
    fooey.pullThePlug();
  
  }else{
  if (failed == 8){
  JOptionPane.showMessageDialog(this, "Eggs are not supposed to be green.\n And"
          + " you lost, hahaha. \n\t I don't know what to say I "
          + "didn't expect you here.\n Do you accept you lost"
          + " ?");
  
  
      
   FooWindow fooey = new FooWindow();
    fooey.pullThePlug();
  
  
  
  
  
  
  }}
  
    }//end action performed dont erase
        
        
        
        void ImageChecker(){
            
            switch(failed){
case 0: current = new ImageIcon(getClass().getResource("i0.png"));
    break;
case 1: current = new ImageIcon(getClass().getResource("i1.png"));
    break;
case 2: current = new ImageIcon(getClass().getResource("i2.png"));
    break;
case 3: current = new ImageIcon(getClass().getResource("i3.png"));
    break;
case 4: current = new ImageIcon(getClass().getResource("i4.png"));
    break;
case 5: current = new ImageIcon(getClass().getResource("i5.png"));
    break;
case 6: current = new ImageIcon(getClass().getResource("i6.png"));
    break;
case 7: current = new ImageIcon(getClass().getResource("i7.png"));
    break;
case 8:  current = new ImageIcon(getClass().getResource("i8.png"));
    break;
        
        default: current = new ImageIcon(getClass().getResource("i0.png")); 
    break;
        }
        
        pics.setIcon(current);
        repaint();
        
        
        
        
        }
        
        
        
        
        
        
  }//end listener
     
     
      public class FooWindow extends JFrame {
        public FooWindow() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(5, 5, 400, 300);  // yeah yeah, this is an example ;P
            setVisible(true);
        }
        public void pullThePlug() {
                WindowEvent wev = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
                Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev);
        }
    }
        

      
      
      
      

}//end HangmanPanel class

           