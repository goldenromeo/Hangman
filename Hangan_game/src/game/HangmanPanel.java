package game;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Rommel
 */
public class HangmanPanel extends JPanel 
{
    char [] charsAvailable;
  
    //holds the input box and submit button
    private JPanel panel1;
    // holds the letters
    private JPanel panel2;
    private JButton submitButton ;

    private ImageIcon current;
    private JLabel pics;

    //    create a WordGenerator object and text field items and compare
    private JTextField textField;//text field
    private String textFieldValue;
    private WordGenerator word; //this is the word
    JLabel JLabelArray [];
  
    int guessed;//amount of items guessed only used to know when to say good job
    int failed;//used to determine picture shown

    HangmanPanel ()
    {
        super(new GridLayout(2,1));
        SetScreen();
    }

    private void SetScreen()
    {
        this.removeAll();
        panel1 = new JPanel();
        panel2 = new JPanel();
        current = new ImageIcon(getClass().getResource("i0.png"));
        pics = new JLabel(current);
        textField = new JTextField(" ",10);
        word = new WordGenerator();
        guessed=0;
        failed=0;

        System.out.println(word.toString());

        //Welcome
        JLabel j = new JLabel(" Hi, to play enter the letter you think "+
                "is right and press enter.",JLabel.CENTER);
        add(j)  ;

        //this builds the empty JLabels and is
        //later used for the painting the char to its space.
        wordToJLabel(word);

        //input box + submit button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ButtonListener());

        textField.addActionListener(new ButtonListener());
        panel1.add(textField);
        panel1.add(submitButton);
        add(panel1);
        revalidate();
        repaint();
    }

    /**
   * When called this method will convert
   * the WordGenerator objects to JLabels
   * the JLabels objects are created and painted
   * first in first out for convenience.
   *
   * the conversion is done in the following form
   * WordGenerator --> String --> char array --> JLabel.
   * @param wordpassed the WordGenerator object passed
   */
   private void wordToJLabel(WordGenerator wordpassed )
   {

        panel2.setPreferredSize(new Dimension(400 , 50));

        String theword = wordpassed.toString(); //WordGenerator --> String
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
        }

        //add pics here
        pics.setPreferredSize(new Dimension(300,300));
        add(pics);
        add(panel2);
        // tells the program the characters in word
        setCharsAvailable(charArray);
    }

    private char [] getCharsAvailable() {
        return charsAvailable;
    }
    private void setCharsAvailable(char[] charsAvailable) {
        this.charsAvailable = charsAvailable;
    }
    
    private class ButtonListener extends JPanel implements ActionListener
    {
        char [] charsAvailableChecker = getCharsAvailable();//chars available in value

        int [] theCheckerInt;
        char theCheckerChar;
        int whileLoopInt=0;

        @Override
        public void actionPerformed (ActionEvent event)
        {
            textFieldValue = textField.getText();
            textField.setText("");
            textFieldValue = textFieldValue.toUpperCase();
            char[] textFieldValueChar= textFieldValue.toCharArray();
            theCheckerChar = textFieldValueChar[0];

            try{
                if (word.contains(textFieldValueChar[0])) //if one if value is it
                {
                    whileLoopInt=0;//don't delete ensures no out of bound exception

                    if(word.isFirstchar(textFieldValueChar[0]))
                    {//checks if first letter
                        JLabelArray[0].setText(word.theCharAt_String(0));
                    }

                    theCheckerInt = word.chartAt(theCheckerChar);

                    String theWord= ""+theCheckerChar;
                    theWord.toUpperCase();

                    for(int f: theCheckerInt )
                    {
                        if(theCheckerChar == word.theCharAt(whileLoopInt) && whileLoopInt <9   )
                        {
                            JLabelArray[whileLoopInt].setText(word.theCharAt_String(whileLoopInt));
                            guessed++;
                        }

                        whileLoopInt++;
                    }
                }
                else
                    failed++;

            textField.setText("");
            }
            catch (ArrayIndexOutOfBoundsException e) { }
            ImageChecker();

        if (guessed == 9)
        {
            JOptionPane.showMessageDialog(this, "Eggs are not supposed to be green.\n And"
                + " you won, congrats. \n\t I don't know what to say I "
                + "didn't expect you here.\n Have a Good day the game will restart"
                + " after you press OK for your convenience.");

            SetScreen();
        }
        else
        {
            if (failed == 8)
            {
                JOptionPane.showMessageDialog(this, "Eggs are not supposed to be green.\n And"
                + " you lost, hahaha. \n\t I don't know what to say I "
                + "didn't expect you here.\n Do you accept you lost"
                + " ?");
                SetScreen();
            }
        }
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
    }
}