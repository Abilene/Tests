package com.abilene.tech.test;

import java.util.Scanner;

import com.abilene.tech.test.validation.InputValidation;

public class Sum {
	
	private static void compute(double k) {
		double sum = 0, count =0;
		
		for(int i=1; i<=k; i++) {
			count += Math.pow(-1, i + 1) / (2*i - 1);
		}
		
		sum = 4 * count;
		System.out.println("Total sum is: " + sum);
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		boolean isLessThan = false;
		double k = 0;
		double maxValue = Math.pow(10, 6);
		do{
			System.out.println("Enter k value");
			boolean isInteger = InputValidation.isIntegerValue(scan, scan.hasNextDouble());
			if(isInteger) {
				k = scan.nextDouble();
				if(k<=maxValue) isLessThan = true;
				else System.out.println("K max value is 10^6");
			}
			
		}while(!isLessThan);
		scan.close();
		
		System.out.println("Start computing for k=" + k);
		compute(k);
	}
}
