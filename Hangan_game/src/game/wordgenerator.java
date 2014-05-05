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
public class wordgenerator {
    
    private String hangmanWord;
    
    // constructor, this is the preffered method
    wordgenerator(){

                
//The following array contains all the words that will be used on hangman game
            //also known as the random words
            
          String wordlist [] = new String [] {"ABANDONED","ABOLITION","ABRUPTION"
            ,"ACADEMIES","ACCEPTANT","ACCESSORY","ACCIDENTS","ACCLAIMED","ACCORDION","ACCOUTERS","ACTIVATED","ACTIVATOR",
            "ACTIVISTS","ADAPTABLE","ADDICTION","ADHESIVES","ADMISSION","ADOPTABLE","ADORNMENT","ADSORBENT",
            "ADULTHOOD","ADVANTAGE","ADVENTURE","ADVERTISE","AEROBATIC","AEROPLANE",
            "AEROSPACE","AUDIENCES","BALLERINA","BALLGAMES","BALLROOMS","BREAKFAST","CHECKBOOK"
            ,"CHECKLIST","PANORAMIC","NEIGHBOUR","NANOMETER","MUSHROOMS","MISTYPING","MOSQUITOS","MOTORBIKE",
            "MAGNIFIER","MUSKETEER","ZOOKEEPER","WHISTLING","WERWOLVES","WATERLESS",
            "VALENTINE","UNPACKING","UNPLUGGED","UNCHANGED","TYPOGRAPH","TRAINWAYS",
            "TRAVELLER","SURFBOARD","SYMBOLISM","SUSPENDED","SUBROGATE","SUGARCANE",
            "SUGARCOAT"};
    //all the words should be 9 letters long to make things easier
            
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
    
    
/**
 * toString method 
 * this method is used when printing a wordgenerator object.
 *
     * @return returns the string stored within the object.
 */
    @Override
    public String toString (){
    
    
    return this.getHangmanWord();
            
            }
    
    
    
    



}//end of class wordgenerator


