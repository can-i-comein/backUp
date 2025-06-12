package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		
		String noToken = "";
		while(st.hasMoreTokens()) {
			noToken += st.nextToken();
		}
		
		return noToken;
	}
	
	public String firstCap(String input) {
		char cap = input.toUpperCase().charAt(0);
		String result = "";
		result += cap;
		for(int i = 1; i < input.length(); i++) {
			result += input.charAt(i);
		}
		
		return result;
	}

	public int findChar(String input, char one) {
		int count = 0;
		for(int i = 0; i < input.length(); i++) {
			if(one == input.charAt(i)) {
				count++;
			}
		}
		return count;
	}
}
