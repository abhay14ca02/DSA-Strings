package com.arrays.easyCheckifAllAsAppearsBeforeAllBs;

public class OptimalSolution {

	private static boolean checkString(String s) {
		return !s.contains("ba");
	}

	public static void main(String[] args) {
		String s = "aaabbb";
		boolean check = checkString(s);
		System.out.println(check);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)