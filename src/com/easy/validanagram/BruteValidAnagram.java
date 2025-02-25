package com.easy.validanagram;

import java.util.Arrays;

//Given two strings s and t, return true if t is anagram of s, and false otherwise.
//Input: s = "anagram", t = "nagaram" Output: true
//Input: s = "rat", t = "car" Output: false

public class BruteValidAnagram {
	private static boolean checkValidAnagram(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}
		char[] word1 = s.toCharArray();
		char[] word2 = t.toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);
		
		if (new String(word1).equals(new String(word2))) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		boolean isValid = checkValidAnagram(s, t);
		System.out.println(isValid);
	}
}
//Time Complexity:O(N log N)
//Space Complexity :O(N)