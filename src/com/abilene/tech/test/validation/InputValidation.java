package com.abilene.tech.test.validation;

import java.util.Scanner;

public class InputValidation {

	public static boolean isIntegerValue(Scanner scan, boolean hasNextInt) {
		if(hasNextInt){
			return true;
		}
		else {
			System.out.println("I cannot size the matrix with that value");
			scan.next();
			return false;
		}
	}
}
