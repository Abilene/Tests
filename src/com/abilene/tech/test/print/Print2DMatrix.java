package com.abilene.tech.test.print;

public class Print2DMatrix {

	public static void print(int row, int column, int[][] matrix) {
		for(int i=0; i<row; i++){
			System.out.print("[ ");
			  for(int j=0; j<column; j++){
				System.out.print(matrix[i][j]+ " ");
			  }
				System.out.println("]");
			}
	}
}
