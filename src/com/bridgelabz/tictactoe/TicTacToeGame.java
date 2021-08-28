package com.bridgelabz.tictactoe;

public class TicTacToeGame {	
	private static char player;
	private static char computer;
	
	public char[] createBoard() {
		char []board = new char[10];
		for(int i=1;i<board.length;i++) {
			board[i] = ' ';
		}
		return board;
	}
	
	public void setInput(char player) {
		setPlayer(player);
		if(getPlayer() == 'X') {
			setPlayer('O');
		}
		else
			setPlayer('X');
		
		
	}

	public static char getComputer() {
		return computer;
	}

	public static void setComputer(char computer) {
		TicTacToeGame.computer = computer;
	}

	public char getPlayer() {
		return player;
	}

	public void setPlayer(char player) {
		TicTacToeGame.player = player;
	}
}
