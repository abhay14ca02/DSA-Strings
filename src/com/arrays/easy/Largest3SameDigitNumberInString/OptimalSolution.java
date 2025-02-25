package com.arrays.easy.Largest3SameDigitNumberInString;

//You are given a string num representing a large integer. An integer is good if it meets the following conditions:
//It is a substring of num with length 3.
//It consists of only one unique digit.
//Return the maximum good integer as a string or an empty string "" if no such integer exists.
public class OptimalSolution {

	private static String largestGoodInteger(String num) {
		String result = "";

		int n = num.length();
		char maxChar = ' ';
		for (int i = 2; i < n; i++) {
			if (num.charAt(i) == num.charAt(i - 1) && num.charAt(i) == num.charAt(i - 2)) {
				maxChar = (char) Math.max(maxChar, num.charAt(i));
			}
		}
		if (maxChar == ' ') {
			return "";
		}
		result = new String(new char[] { maxChar, maxChar, maxChar });
		return result;
	}

	public static void main(String[] args) {
		String num = "679997132339";
		String result = largestGoodInteger(num);
		System.out.println(result);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)