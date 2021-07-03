/*
*Reverse.java
*N Varadi
*25 11 2020
*/

public class Reverse{

	private String word;
	private String newWord;
	private StringBuffer strBuff;

	public Reverse(){

		word = "";
		newWord = "";
		strBuff = new StringBuffer();
	}


	public void setWord(String word){
		this.word = word;
	}


	public void compute(){

		for(int i = word.length()-1; i>=0; i--){
			strBuff.append(word.charAt(i));
		}

		newWord = strBuff.toString();
	}


	public String getNewWord(){
		return newWord;
	}

}
