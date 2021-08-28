package com.bridgelabz.tictactoe;

public class TicTacToeGame {	
	private static char player;
	private static char computer;
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
		setPlayer(player);
		setComputer((getPlayer() == 'X') ? 'O': 'X');
	}

	public char getComputer() {
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
