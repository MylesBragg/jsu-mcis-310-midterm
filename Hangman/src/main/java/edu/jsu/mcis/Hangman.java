package edu.jsu.mcis;

import java.util.*;

public class Hangman {
	private char[] allLetters;
    public enum Result { WIN, LOSE, NONE };
    private String word;
    private List<Character> usedLetters;
    
    public Hangman() {
		allLetters = new char[26];
		createallLetters();
        word = "";
        usedLetters = new ArrayList<Character>();
    }
	
	public void createallLetters()
	{
	allLetters[0] = 'a';
	allLetters[1] = 'b';
	allLetters[2] = 'c';
	allLetters[3] = 'd';
	allLetters[4] = 'e';
	allLetters[5] = 'f';
	allLetters[6] = 'g';
	allLetters[7] = 'h';
	allLetters[8] = 'i';
	allLetters[9] = 'j';
	allLetters[10] = 'k';
	allLetters[11] = 'l';
	allLetters[12] = 'm';
	allLetters[13] = 'n';
	allLetters[14] = 'o';
	allLetters[15] = 'p';
	allLetters[16] = 'q';
	allLetters[17] = 'r';
	allLetters[18] = 's';
	allLetters[19] = 't';
	allLetters[20] = 'u';
	allLetters[21] = 'v';
	allLetters[22] = 'w';
	allLetters[23] = 'x';
	allLetters[24] = 'y';
	allLetters[25] = 'z';
	}
	
    
    public void setWord(String word) {
        this.word = word;
    }
    
    public boolean available(char c) {
		for(int i = 0; i < 26; i++){
			if (allLetters[i] == c)
			return true;
			}
		return false;
    }
    
    public int guess(char c) {
	int count = 0;
	for (i = 0; i <word.length; i++)
		if(Character.valueOf(word.charAt(i)).equals(c))
		count = count;
		else 
		count++;
		if (count = 5)
		result = Result.Lose;
		return 2;
		}
    
    public Result getResult() {
        return Result.NONE;
    }
    
}















