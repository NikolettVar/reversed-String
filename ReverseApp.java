/*
*ReverseApp.java
*N Varadi
*25 11 2020
*/

import javax.swing.*;

public class ReverseApp{
	public static void main(String args[]){

		String word;
		String newWord;

		Reverse myReverse = new Reverse();

		word = JOptionPane.showInputDialog(null, "Please enter a word");
		myReverse.setWord(word);

		myReverse.compute();
		newWord = myReverse.getNewWord();

		JOptionPane.showMessageDialog(null, "Your word was: " + word + " and your word reversed is: " + newWord);
	}
}