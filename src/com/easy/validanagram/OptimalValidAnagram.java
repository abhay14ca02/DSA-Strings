package com.easy.validanagram;
//Given two strings s and t, return true if t is anagram of s, and false otherwise.
//Input: s = "anagram", t = "nagaram" Output: true
//Input: s = "rat", t = "car" Output: false
public class OptimalValidAnagram {
	private static boolean checkValidAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] freq = new int[26];
		for (char ch : s.toCharArray()) {
			freq[ch - 'a']++;
		}
		for (char ch : t.toCharArray()) {
			freq[ch - 'a']--;
		}
		for (int i : freq) {
			if (i != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "rat";
		String t = "car";
		boolean isValid = checkValidAnagram(s, t);
		System.out.println(isValid);
	}
}
//Time complexity: O(N)
//Space complexity: O(26) i.e, or Constant