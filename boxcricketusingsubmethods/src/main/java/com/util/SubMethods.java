package com.util;

public class SubMethods {

	public static boolean dataBlank(String data) {
		if (data == null || data.trim().length() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean regexCheck(String data) {
		String alphabetRegex = "[a-zA-Z]+";

		return data.matches(alphabetRegex);
	}


}
