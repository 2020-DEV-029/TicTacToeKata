package com.tictactoe.kata.game;

import org.springframework.stereotype.Component;

/**
 * Tic Tac Toe game processing class that calculate outcome of game based on
 * both player choices.
 * 
 * @author AKS1405
 *
 */
@Component
public class TicTacToeGameProcessor {

	private GAME_STATE[][] board = new GAME_STATE[3][3];

	private GAME_STATE winner = GAME_STATE.BLANK;

	// Initialize board array with blank state of game in constructor
	public TicTacToeGameProcessor() {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				board[row][col] = GAME_STATE.BLANK;
			}
		}
	}
	
	/**
	 * Mark cross in game board and change state of that square to cross and return
	 * boolean if state changes successfully
	 * 
	 * @param row
	 * @param col
	 * @return boolean
	 */
	public boolean markCross(int row, int col) {
		return mark(row, col, GAME_STATE.CROSS);
	}


	/**
	 * Mark circle in game board and change state of that square to circle and
	 * return boolean if state changes successfully
	 * 
	 * @param row
	 * @param col
	 * @return
	 */
	public boolean markCircle(int row, int col) {
		return mark(row, col, GAME_STATE.CIRCLE);
	}
	
	/**
	 * Mark cross in game board and change state of that square to cross and return
	 * boolean if state changes successfully
	 * 
	 * @param row
	 * @param col
	 * @param gameState
	 * @return boolean
	 */
	private boolean mark(int row, int col, GAME_STATE gameState) {
		if (board[row][col] == GAME_STATE.BLANK) {
			board[row][col] = gameState;

			// Checks whether winner has been found post every players chance of marking
			setWinner(row, col, gameState);
			return true;
		}
		return false;
	}

	/**
	 * This method finds winner after each player plays and marks O or X based on
	 * condition of winner based on Tic Tac Toe game rules
	 * 
	 * @param row
	 * @param col
	 * @param gameState
	 */
	public void setWinner(int row, int col, GAME_STATE gameState) {
		validateThreeSameStateInRow(row, gameState);
		validateThreeSameStateInColumn(col, gameState);
	}

	/**
	 * This method returns state of winner of any time
	 * 
	 * @return GAME_STATE the winner
	 */
	public GAME_STATE getWinner() {
		return this.winner;
	}

	/**
	 * This method finds that if one row has same sign and changes winner state to
	 * that sign like O or X
	 * 
	 * @param row
	 * @param gameState
	 */
	private void validateThreeSameStateInRow(int row, GAME_STATE gameState) {
		for (int col = 0; col < board.length; col++) {
			if (board[row][col] != gameState) {
				break;
			}

			if (col == 2) {
				winner = gameState;
			}
		}
	}
	
	/**
	 * This method finds that if one column has same sign and changes winner state
	 * to that sign like O or X
	 * 
	 * @param col
	 * @param gameState
	 */
	private void validateThreeSameStateInColumn(int col, GAME_STATE gameState) {
		for (int row = 0; row < board.length; row++) {
			if (board[row][col] != gameState) {
				break;
			}

			if (row == 2) {
				winner = gameState;
			}
		}
	}

	
	/**
	 * This method gives current state of board at any time
	 * 
	 * @return GAME_STATE[][]
	 */
	public GAME_STATE[][] getBoard() {
		return this.board;
	}

	/**
	 * This method finds whether at any location on board is marked with circle or
	 * not
	 * 
	 * @param row
	 * @param col
	 * @return boolean
	 */
	public boolean isCircle(int row, int col) {
		return board[row][col] == GAME_STATE.CIRCLE;
	}

	/**
	 * This method finds whether at any location on board is marked with circle or
	 * not
	 * 
	 * @param row
	 * @param col
	 * @return boolean
	 */
	public boolean isCross(int row, int col) {
		return board[row][col] == GAME_STATE.CROSS;
	}

	/**
	 * This method used to check whether winner has been found after every chance
	 * played by player. If state of winner is changed from Blank to Cicrle and
	 * Cross we can say that one of player has won the game.
	 * 
	 * @return boolean
	 */
	public boolean isFinished() {
		return this.winner != GAME_STATE.BLANK;
	}
}
