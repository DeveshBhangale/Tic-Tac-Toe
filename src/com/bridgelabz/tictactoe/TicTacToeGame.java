package com.bridgelabz.tictactoe;

public class TicTacToeGame {
	
	char []board = new char[10];
	
	public void board() {
		for(int i=1;i<board.length;i++) {
			board[i] = ' ';
		}
	}
}
