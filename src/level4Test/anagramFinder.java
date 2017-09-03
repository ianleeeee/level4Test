package level4Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
//i don't think i ever learned how to get text files into variables that i can compare input to
public class anagramFinder {
	public static void main(String[] args) throws IOException {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter your word:");
		String test = key.nextLine();
		findAnagrams(test);
		
	}
	public static void findAnagrams(String input) throws IOException {
		//add all anagrams to String array, then print them all out at the end
		//String [] anagrams = new String[];
		FileReader words = new FileReader("words.txt");
		BufferedReader read = new BufferedReader(words);
		System.out.println("Anagrams:");
		for (int i = 0; i < 235887; i++) {
			if(read.readLine().matches(input)) {
				System.out.println(read.readLine());
			}
		}
		

	}

}
