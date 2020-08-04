package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		char[] digits = Long.toString(num).toCharArray();
		long sum = 0;
		for(char c: digits) {
			sum += powerOf(Integer.parseInt(Character.toString(c)),digits.length);
		}
		
		return (num == sum);
	}
	
	private static int powerOf(int in, int length) {
		int out = 1;
		for(int i = 0; i < length; i++)
			out *= in;
		return out;
	}
}
