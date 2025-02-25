package com.arrays.medium.ReverseWordsinaString;

public class OptimalSolution {

	private static String reverseWords(String words) {
		String temp = words.trim();
		String[] arr = temp.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {
			String str = arr[i];
			if (str.isBlank())
				continue;
			sb.append(str);
			if (i != 0)
				sb.append(" "); // add space for each character, except the last
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String words = "  hello world  ";
		String result = reverseWords(words);
		System.out.println(result);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(N)