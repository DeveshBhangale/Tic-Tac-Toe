package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {	
	public static char player;
	public static char computer;
	char []board = new char[10];
	
	public char[] createBoard() {
		
		for(int i=1;i<board.length;i++) {
			board[i] = '_';
		}
		return board;
	}
	
	public void showBoard() {
		for(int i=1;i<board.length;i++) {
			if(i==4 || i ==7) System.out.println("\n");
			System.out.print(board[i] + " ");
		}
	}
	
	public void setInput(char player) {
		this.player = player;
		this.computer = ((this.player == 'X') ? 'O': 'X');
	}

	public boolean checkIndex(int index) {
		if(board[index] == '_') {
			return true;
		}
		return false;
	}
	
	
	public int checkPosition() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\nEnter the index to set value from 1 to 9: ");
			int index = sc.nextInt();
			if(index>0 && index < 10) {
				if(checkIndex(index)) {
					sc.close();
					return index;
				}
				else {
					System.out.println("Entered Index is not Free");
					}
			}
			else 
				System.out.println("Invalid Index");
			
		}

	}
}
