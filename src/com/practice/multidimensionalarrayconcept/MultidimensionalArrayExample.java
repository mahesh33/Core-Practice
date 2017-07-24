package com.practice.multidimensionalarrayconcept;
/*
 * /*  0 1 2
     0 X| | 
       -+-+-
     1  |W|O
       -+-+-
     2 X| |O
*/

public class MultidimensionalArrayExample {
public static void main(String[] args) {
	
	char [][] board = new char [3][3];
	
	board [0][0] =  'X';
	board [1][1] =  'W';
	board [1][2] =  'O';
	board [2][0] =  'X';
	board [2][2] =  'O';
	
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Array: " + i + "," + j + " = " + board[i][j] + "   ");
			}
			System.out.println();
		}
	
}
}
