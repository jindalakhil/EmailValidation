package com.capg.email;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
	public static void main(String[] args) {
		System.out.println("Welcome to the Email validator");
		Scanner sc = new Scanner(System.in);
		Pattern pincode = Pattern.compile("^abc{1}([-+-.]{0,1}[a-zA-z0-9]{3})?@[a-z]{2,}\\.[a-z]{2,4}(\\.[a-z]{2})?$");
		System.out.println("Enter the email");
		String pattern = sc.nextLine();
		Matcher matcher = pincode.matcher(pattern);
		boolean isFound = matcher.find();
		if(isFound)
			System.out.println("Patter found");
		else
			System.out.println("Patter not found");
		sc.close();
	}
}
