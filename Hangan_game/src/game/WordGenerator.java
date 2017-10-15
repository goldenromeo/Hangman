/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;

import java.util.Random;
/**
 *
 * @author meep
 */
public class WordGenerator
{
    private String hangmanWord;

    //The following array contains all the words that will be used on hangman game
    //also known as the random words
    //all the words should be 9 letters long to make things easier

    private static String wordlist [] = new String [] {"ABANDONED","ABOLITION","ABRUPTION"
            ,"ACADEMIES","ACCEPTANT","ACCESSORY","ACCIDENTS","ACCLAIMED","ACCORDION","ACCOUTERS","ACTIVATED","ACTIVATOR",
            "ACTIVISTS","ADAPTABLE","ADDICTION","ADHESIVES","ADMISSION","ADOPTABLE","ADORNMENT","ADSORBENT",
            "ADULTHOOD","ADVANTAGE","ADVENTURE","ADVERTISE","AEROBATIC","AEROPLANE",
            "AEROSPACE","AUDIENCES","BALLERINA","BALLGAMES","BALLROOMS","BREAKFAST","CHECKBOOK"
            ,"CHECKLIST","PANORAMIC","NEIGHBOUR","NANOMETER","MUSHROOMS","MISTYPING","MOSQUITOS","MOTORBIKE",
            "MAGNIFIER","MUSKETEER","ZOOKEEPER","WHISTLING","WATERLESS",
            "VALENTINE","UNPACKING","UNPLUGGED","UNCHANGED","TYPOGRAPH","TRAINWAYS",
            "TRAVELLER","SURFBOARD","SYMBOLISM","SUSPENDED","SUBROGATE","SUGARCANE",
            "SUGARCOAT"};

    // constructor, this is the preffered method
    WordGenerator()
    {
        Random random = new Random(); //creates a Random object
        //sets a random word from wordlist.
        setHangmanWord(wordlist[random.nextInt(wordlist.length)]) ;
    }

    /**
     * @return the hangmanWord
     */
    private String getHangmanWord() {
        return hangmanWord;
    }

    /**
     * @param hangmanWord the hangmanWord to set
     */
    private void setHangmanWord(String hangmanWord) {
        this.hangmanWord = hangmanWord;
    }

    public int lenght() {
        return hangmanWord.length();
    }
    
    /**
     * toString method
     * this method is used when printing a WordGenerator object.
     *
     * @return returns the string stored within the object.
    */
    @Override
    public String toString ()
    {
        return this.getHangmanWord();
    }

    public char[] toCharArray ()
    {
        return hangmanWord.toCharArray();
    }
 
 
    public boolean contains (char x)
    {
        return hangmanWord.contains(Character.toString(x));
    }
 
 
    public boolean isFirstchar (char x)
    {
        return x == hangmanWord.charAt(0);
    }

    public int [] chartAt (char x)
    {
        int [] meh =  new int [9];
        int correct= 0;

        String neh= Character.toString(x);
    
        if(hangmanWord.contains(neh))
        {
            for(int pi =0; pi < meh.length ; pi++ )
            {
                if (hangmanWord.charAt(pi) == x)
                {
                meh[correct] = pi;
                correct++;
                }
            }
        }
        return meh;
    }

    public char theCharAt (int n)
    {
        return hangmanWord.charAt(n);
    }
 
    public String theCharAt_String (int n)
    {
        return  Character.toString(hangmanWord.charAt(n));
    }
}


