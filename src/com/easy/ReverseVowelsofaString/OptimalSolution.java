package com.easy.ReverseVowelsofaString;

public class OptimalSolution {

	private static String reverseVowels(String str) {
		int n = str.length();
		int i = 0;
		int j = n - 1;
		// Convert the input string to a character array for easy manipulation.
		char[] characters = str.toCharArray();
		while (i < j) {
			if (!isVowel(characters[i]))
				i++;
			else if (!isVowel(characters[j]))
				j--;
			else {
				char temp = characters[i];
				characters[i] = characters[j];
				characters[j] = temp;
				i++;
				j--;
			}
		}
		return String.valueOf(characters);
	}

	static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U';
	}

	public static void main(String[] args) {
		String str = "leetcode";
		String reverse = reverseVowels(str);
		System.out.println(reverse);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(N)
