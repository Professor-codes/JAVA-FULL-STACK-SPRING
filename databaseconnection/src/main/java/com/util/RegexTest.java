package com.util;

public class RegexTest {
	public static void main(String[] args) {
		// String email_regex = "[a-z0-9]+@[a-z]{5,7}+\\.[a-z]{2,3}";
		// String password_regex =
		// "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[.@*$#].*[.@*$#])[a-zA-Z0-9.@*$#]+$";
		String price_regex = "\\$\\d+\\.\\d{2}";

		// String email = "username@gmail.com";
		// String password = ".123abcAB@C";
		String price = "$674.35";

		// System.out.println(email.matches(email_regex));
		// System.out.println(password.matches(password_regex));
		System.out.println(price.matches(price_regex));
	}

}
