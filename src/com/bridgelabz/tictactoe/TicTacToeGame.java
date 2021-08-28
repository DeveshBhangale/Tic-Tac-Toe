package com.bridgelabz.tictactoe;

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
	
	
	public void setIndex(int index) {
		if(index>0 && index < 10) {
			if(checkIndex(index)) {
				board[index] = player;
				showBoard();
			}
			else {
				System.out.println("Entered Index is not Free");
				showBoard();}
		}
		else 
			System.out.println("Invalid Index");
		
	}
}
