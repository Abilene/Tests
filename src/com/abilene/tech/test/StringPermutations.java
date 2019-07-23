package com.abilene.tech.test;

/**
 * @author Abilene Franquez
 *
 */
public class StringPermutations {
	
	private static void permutation(String string) {
		String initial = "";
		permutation(initial, string);
	}

	private static void permutation(String initial, String string) {
		// TODO Auto-generated method stub
		int stLen = string.length();
		
		if(stLen==0) System.out.println(initial);
		else {
			for(int i=0; i < stLen; i++) {
				// a, bcd - ab, cd - abc,d -> abd, c 
				permutation(initial + string.charAt(i), string.substring(0,i) + string.substring(i+1,stLen));
			}
		}
	}
	
	public static void main(String args[]) {
		String str = "abcd";
		permutation(str);
	}
}
