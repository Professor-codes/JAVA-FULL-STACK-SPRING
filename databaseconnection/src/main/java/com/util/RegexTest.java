package com.util;

public class RegexTest {
    public static void main(String[] args) {
        // String email_regex = "[a-z0-9]+@[a-z]{5,7}+\\.[a-z]{2,3}";
        String password_regex = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[.@*$#].*[.@*$#])[a-zA-Z0-9.@*$#]+$";

        // String email = "username@gmail.com";
        String password = ".123abcAB@C";
        
        // System.out.println(email.matches(email_regex));
        System.out.println(password.matches(password_regex));
    }

}
