package com.arrays.easy.LargestOddNumberInString;

//You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) 
//that is a non-empty substring of num, or an empty string "" if no odd integer exists.
public class OptimalSolution {
	private static String largestOddNumber(String num) {
		int n = num.length();
		for (int i = n - 1; i >= 0; i--) {
			int ch = num.charAt(i) - '0';
			if (ch % 2 != 0) {
				return num.substring(0, i + 1);
			}
		}
		return "";
	}

	public static void main(String[] args) {
		String num = "35427";
		String result = largestOddNumber(num);
		System.out.println(result);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)