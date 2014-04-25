/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hangman;
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
            
            String wordlist [] = new String [] {"meep","hello","time",
                "person", "year","day","company","party","hello","awesome",
                "yay", "beautiful","love","princess", "chips","frozen",
                "marshall","river", "bank","chicken","soup", "street",
                "dancer","couple","music","life","fans","confidence",
                "coffee","world","hello","light","day","hill","father",
            "mother","new","granfather","child","dog","vannesa",
            "friend", "song","dream","young","live","laugh","love","dalila",
            "free","radio","plan","eyes","life","heart","smile", "lost",
            "world","red","blue","wide","cage","around","turn","lightyear",
            "spoilers","doctor","Sherlock","space","taste", "now","time",
            "pandora","cinema","class","lifetime","favorite","movie",
            "everything","thousand","fascinatining","running","always",
            "running", "thriller", "hollywood","treasure","stars", 
            "science","fiction","drama","romance","flower","summer",
            "guess", "wonderful", "action","control","show","baby",
            "root","vocals","beep","boop","nyan","cat","marbles",
            "more","you", "make","me","java","rain","email","we","hug",
            "mission","control","airplane","farewell","faraway","titanium",
            "sticks","stones","bulletproof","bath","body","work",
            "sweet","sight","promise","feel","waste","myself","rice","treat",
            "cereal","product","wild","deny","fire","break","leave","original",
            "diet","sugar","salt","elizabeth","iron","marshmallow","flavor",
            "one","corn","syrup","bestfriend","right","wrong","move","separate",
            "way","close","lie","hide","true","truth","return","deserve","give",
            "orange","apple","Iphone", "Android","computer","plum","purple",
            "painting","DiCaprio","moon","google","atom","facebook","twitter"};
    
            
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


