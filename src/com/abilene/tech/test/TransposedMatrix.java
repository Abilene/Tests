package com.abilene.tech.test;

import java.util.Scanner;

import com.abilene.tech.test.print.Print2DMatrix;
import com.abilene.tech.test.validation.InputValidation;

/** Write a function that receives a matrix and return its transposed one (manually)
 * @author Abilene Franquez
 *
 */
public class TransposedMatrix {
	
	static void transpose(int row, int column, int[][] matrix){
		// Print the first matrix
		System.out.println("Your matrix is:");
		Print2DMatrix.print(row, column, matrix);
		// Create a new matrix with new size
		int[][] transposedMatrix = new int[column][row];
		for(int i=0; i<column; i++){
			  for(int j=0; j<row; j++){
				transposedMatrix[i][j] = matrix[j][i];
			  }
			}
		// Now print the transposed matrix
		System.out.println("---------------------------");
		System.out.println("The transposed matrix is:");
		Print2DMatrix.print(column, row, transposedMatrix);
	}

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		boolean isInteger = false;
		// Need to verify you only type in integer values
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
		// set matrix size
		int[][] matrix = new int[row][column];
		// pass matrix elements - at this time I don-t care if they-re numbers or not
		System.out.println("Enter matrix elements");
		for(int i=0; i<row; i++){
			  for(int j=0; j<column; j++){
				System.out.println("Element in position:["+i+","+j+"]");
				int temp = scan.nextInt();
				matrix[i][j]= temp;
			  }
			}
		
		scan.close();
		transpose(row, column, matrix );
		}
}
