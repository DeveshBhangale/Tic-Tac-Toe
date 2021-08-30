package com.bridgelabz.tictactoe;

import java.util.Scanner;


public class TicTacToeGame {	
	public char player;
	public char computer;
	public int turn = 0;
	char []board = new char[10];
	
	public char[] createBoard() {
		
		for(int i=1;i<board.length;i++) {
			board[i] = '_';
		}
		return board;
	}
	
	public void showBoard() {
		for(int i=1;i<board.length;i++) {
			if(i==3 || i ==6 || i ==9) {
				System.out.print(board[i]+"\n");
				continue;
			}
			System.out.print(board[i] + "|");
		}
		System.out.println("\n");
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
		int index;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\nEnter the index to set value from 1 to 9: ");
			index = sc.nextInt();
			if(index>0 && index < 10) {
				if(checkIndex(index)) {					
					return index;
				}
				else {
					showBoard();
					System.out.println("Entered Index is not Free");
					}
			}
			else 
				System.out.println("Invalid Index");
			
		}

	}

	public boolean checkFreeSpace() {
		int size = board.length;
		for(int i=1;i<size;i++) {
			if(board[i] == '_') {
				return true;
			}
		}
		return false;
	}

	public void makeMove(int index) {
		if(turn == 0) {
			board[index] = player;
			turn = 1;
		}
		else
			board[index] = computer;
	}

	public void toss() {
		double toss = (Math.random()*10)%2;
		if(toss < 0.5) {
			System.out.println("You've won the toss");
			turn = 0;
		}
		else {
			System.out.println("Computer has won the toss");
			turn = 1;
		}
	}

	public void computerMove() {
		System.out.println("Computer's turn");
		if(checkComputerWin()) {
			System.out.println("Computer Won");
		}
		else if (checkOpponentWin()){			
			turn = 0;
		}
		else {
			if(board[1] == '_' || board[3] == '_' || board[7] == '_' || board[9] == '_') {
				if(board[1] == '_') board[1] = computer;
				else if (board[3] == '_')  board[3] = computer;
				else if (board[7] == '_')  board[7] = computer;
				else board[9] = computer;
			}
			else if(board[5] == '_') board[5] = computer;
			else {
				if(board[2] == '_') board[2] = computer;
				else if (board[4] == '_')  board[4] = computer;
				else if (board[6] == '_')  board[6] = computer;
				else board[8] = computer;
			}
			turn = 0;
		}
	}

	public boolean checkWin() {
		if(board[1] == board[2] && board[2] == board[3] && board[3]!= '_') return true;
		else if(board[1] == board[5] && board[5] == board[9] && board[9]!= '_') return true;
		else if(board[1] == board[4] && board[4] == board[7] && board[7]!= '_') return true;
		else if(board[2] == board[5] && board[5] == board[8] && board[8]!= '_') return true;
		else if(board[3] == board[5] && board[5] == board[7] && board[7]!= '_') return true;
		else if(board[3] == board[6] && board[6] == board[9] && board[9]!= '_') return true;
		else if(board[4] == board[5] && board[5] == board[6] && board[6]!= '_') return true;
		else if(board[7] == board[8] && board[8] == board[9] && board[9]!= '_') return true;
		return false;
	}
	private boolean checkComputerWin() {
		int size = board.length;
		for(int i=1;i<size;i++) {
			if(board[i] == '_') {
				board[i] = computer;
				if(checkWin()) return true;
				else board[i] = '_';
			}
		}		
		return false;
	}
	private boolean checkOpponentWin() {
		int size = board.length;
		for(int i=1;i<size;i++) {
			if(board[i] == '_') {
				board[i] = player;
				if(checkWin()) {
					makeMove(i);
					return true;
				}
				else board[i] = '_';
			}
		}		
		return false;
	}
}
