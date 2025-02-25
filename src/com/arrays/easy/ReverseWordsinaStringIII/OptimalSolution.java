package com.arrays.easy.ReverseWordsinaStringIII;

public class OptimalSolution {
	private static String reverseWords(String s) {
		StringBuilder result = new StringBuilder();
		String[] words = s.split(" ");
		// Iterating through each word in the array
		for (String word : words) {
			// For each word, reverse it by iterating from the end to the start
			for (int i = word.length() - 1; i >= 0; --i) {
				// Append each character to result
				result.append(word.charAt(i));
			}
			// After reversing, add a space to separate the words
			result.append(" ");
		}
		// Return the string representation of result
		// We exclude the last space using substring to match the required output
		return result.substring(0, result.length() - 1);
	}

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		String reverse = reverseWords(s);
		System.out.println(reverse);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(N)