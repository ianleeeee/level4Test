package level4Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class anagramFinder {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter the word you would like to find anagrams for:");
		String word = key.nextLine();
		// word is the input value
		findAnagrams(word);
	}

	public static void findAnagrams(String word) {
		ArrayList<String> grams = new ArrayList<String>();
		try {
			BufferedReader read = new BufferedReader(new FileReader("words.txt"));
			String currentLine = null;
			while ((currentLine = read.readLine()) != null) {
				String a = "";
				String b = "";
				// currentLine is the current line of text file
				if(currentLine.equals(word)){
					//this is here so the word doesn't add itself to its anagrams
				}
				else{
				char [] wordArr = word.toCharArray();
				Arrays.sort(wordArr);
				char [] lineArr = currentLine.toCharArray();
				Arrays.sort(lineArr);
				for(char wa: wordArr){
					a+=wa;
				}
				for(char la: lineArr){
					b+=la;
				}
				if(a.equalsIgnoreCase(b)){
					grams.add(currentLine);
				}
			}}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The anagrams for " + word+ " are: ");
		for(String aGram:grams){
			System.out.println(aGram);
		}
	}
}