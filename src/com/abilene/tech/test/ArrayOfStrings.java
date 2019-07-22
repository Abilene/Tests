package com.abilene.tech.test;

import java.util.Scanner;

/**
 * @author Abilene Franquez
 *
 */
public class ArrayOfStrings {
	
	public static void main(String args[]) {
		args = new String[6];
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter array of strings - fixed");
		for(int i=0; i < 6;i++) {
			args[i] = scanner.nextLine();
		}
		System.out.println("Enter a string to find");
		String toFind = scanner.nextLine();
		scanner.close();
		findPosition(args, toFind);
	}

	private static void findPosition(String[] args, String toFind) {
		int index = 0;
		for (String string : args) {
			if(toFind.equals(string)) {
				System.out.println("Found at position: " + index);
				return;
			}
			index++;
		}
		
	}
}
