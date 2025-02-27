package com.arrays.easyCheckifAllAsAppearsBeforeAllBs;

public class BetterSolution {
	private static boolean checkString(String s) {
		int n = s.length();
		int i = 0;
		int j = n - 1;
		while (i < n && s.charAt(i) == 'a') {
			i++;
		}
		while (j >= 0 && s.charAt(j) == 'b') {
			j--;
		}
		return i >= j;
	}

	public static void main(String[] args) {
		String s = "aaabbb";
		boolean check = checkString(s);
		System.out.println(check);
	}
}
//Time Complexity : O(N) + O(N) --> O(N)
//Space Complexity : O(1)