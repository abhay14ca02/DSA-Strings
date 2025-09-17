package com.easy.validword;

public class BruteValidWord {

	private static boolean isValidWord(String word) {

		return word.length() >= 3 && word.chars().allMatch(Character::isLetterOrDigit) &&
		        word.chars().anyMatch(c -> isVowel((char) c)) &&
		        word.chars().anyMatch(c -> isConsonant((char) c));
		  }

		  private static boolean isVowel(char c) {
		    return "aeiouAEIOU".indexOf(c) != -1;
		  }

		  private static boolean isConsonant(char c) {
		    return Character.isLetter(c) && !isVowel(c);
		
	}

	public static void main(String[] args) {
		String word = "234AAdas";
		boolean isValid = isValidWord(word);
		System.out.println(isValid);
	}
}
