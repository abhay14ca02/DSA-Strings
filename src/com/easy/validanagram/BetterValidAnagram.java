package com.easy.validanagram;

import java.util.HashMap;
import java.util.Map;
//Given two strings s and t, return true if t is anagram of s, and false otherwise.
//Input: s = "anagram", t = "nagaram" Output: true
//Input: s = "rat", t = "car" Output: false
public class BetterValidAnagram {

	private static boolean checkValidAnagram(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}
		Map<Character, Integer> count1 = new HashMap<Character, Integer>();
		Map<Character, Integer> count2 = new HashMap<Character, Integer>();
		count1 = frequencyCount(s);
		count2 = frequencyCount(t);

		return count1.equals(count2) ? true : false;
	}

	private static Map<Character, Integer> frequencyCount(String str) {

		Map<Character, Integer> count = new HashMap<Character, Integer>();

		for (char ch : str.toCharArray()) {
			if (count.containsKey(ch)) {
				count.put(ch, count.get(ch) + 1);
			} else {
				count.put(ch, 1);
			}
		}

		return count;
	}
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		boolean isValid = checkValidAnagram(s, t);
		System.out.println(isValid);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(K) where K is number of unique characters
