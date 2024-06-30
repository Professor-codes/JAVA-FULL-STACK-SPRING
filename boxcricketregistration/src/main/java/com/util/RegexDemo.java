package com.util;

public class RegexDemo {
	public static void main(String[] args) {
		
		String alphabetRegex = "[A-Za-z]+";
		
		String name = "Maxtom";
		
		// matches (String method to compare REGEX)
		// if regex match return TRUE
		// else return FALSE
		System.out.println(name.matches(alphabetRegex));
	}
}
