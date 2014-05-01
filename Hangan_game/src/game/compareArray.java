/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;

/*
 * First version.
 * Written 04/30/14
 * By: JohnBoland
 */
public class compareArray {

	
	 void compareArray() {
		
	//Gets a random Word from array.
	wordgenerator Specs = new wordgenerator(); 			
	String TrueWord = Specs.toString(); 

	//Develop into seperate class.	
		char TruWArray[]= new char[TrueWord.length()];

		for(int i=0; i < TrueWord.length(); i++ ){

			TruWArray[i]= TrueWord.charAt(i);	
		}
		
//---------------------------------
		char Display[]= new char[TrueWord.length()];

		for(int i=0; i < TrueWord.length(); i++ ){

			Display[i]= '-';	
		}
		
//----------------------------------

char guessedChar = 'n'; //MODIFY
		

		
		char Guessed[]= new char[1];

		for(int i=0; i < 1; i++ ){

			Guessed[i]= guessedChar;	
		}
		
//----------------------------------
int CorrectGuess = 0;
		
		for(int i=0; i < TrueWord.length(); i++)
	{
			
		if (Guessed[0] == TruWArray[i]){
			Display[i] = Guessed[0];			
			CorrectGuess++;
			}
		else
		{
			
		}
		
	}//FOR LOOP
		
		
//---FULL PRINT OF RESULTS -------------------------------
		// Print the array values
		System.out.println ("GuessedArray");
		for (char value : Guessed)
		System.out.print (value);

		System.out.println (" ");


		System.out.println ("TrueWordArray");
		for (char value : TruWArray)
		System.out.print (value);


		System.out.println (" ");

		
		System.out.println ("DisplayArray");
		for (char value : Display)
		System.out.print (value);		


		System.out.println (" ");

		
		
		System.out.println ("CorrectGuess \n" + CorrectGuess);
		
	}
}