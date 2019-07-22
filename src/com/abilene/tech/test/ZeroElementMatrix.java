package com.abilene.tech.test;

import java.util.Arrays;
import java.util.Scanner;

import com.abilene.tech.test.print.Print2DMatrix;
import com.abilene.tech.test.validation.InputValidation;

/**Write a function such that if an element in an MxN matrix is 0, 
 * its entire row and column are set to 0 and then printed out
 * @author Abilene Franquez
 *
 */
public class ZeroElementMatrix {

	private static void convertToZero(int row, int column, int[][] matrix) {
		// We may need a new matrix if we find a zero in matrix
		int[][] zeroedMatrix = new int[row][column];
		fillAll(matrix, zeroedMatrix, row, column);

		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				if(matrix[i][j] == 0 ) {
					// first fill out all rows in zeroedMatrix
					fillRows(zeroedMatrix, i, column);
					// then fill out all columns in zeroedMatrix
					fillColumns(zeroedMatrix, j, row);
				}
			}
		}
		
		System.out.println("The new matrix is:");
		Print2DMatrix.print(row, column, zeroedMatrix);
	}
	
	private static void fillRows(int[][] matrix,int i, int c) {
		for(int k=0; k<c; k++) {
			matrix[i][k] = 0;
		}
	}
	
	private static void fillColumns(int[][] matrix,int j, int r) {
		for(int k=0; k<r; k++) {
			matrix[k][j] = 0;
		}
	}
	
	private static void fillAll(int[][] original, int[][] copy, int r, int c) {
		for(int i=0; i<r;i++) {
			for(int j=0; j<c;j++) {
				copy[i][j] = original[i][j];
			}
		}
		
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		boolean isInteger = false;
		
		do {
			System.out.println("Enter row size");
			isInteger = InputValidation.isIntegerValue(scan, scan.hasNextInt());
		}while(!isInteger);
		int row = scan.nextInt();

		do{
			System.out.println("Enter column size");
			isInteger = InputValidation.isIntegerValue(scan, scan.hasNextInt());
		}while(!isInteger);
		int column = scan.nextInt();
		
		int[][] matrix = new int[row][column];
		// Now I do care if they-re integers or not D:
		System.out.println("Enter matrix elements");
		for(int i=0; i<row; i++){
			  for(int j=0; j<column; j++){
				  do{
					  System.out.println("Element in position:["+i+","+j+"]");
					  isInteger = InputValidation.isIntegerValue(scan, scan.hasNextInt());
					}while(!isInteger);
				int temp = scan.nextInt();
				matrix[i][j]= temp;
			  }
			}
		scan.close();
		convertToZero(row, column, matrix);
		}
}
