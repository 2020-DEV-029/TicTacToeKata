package com.tictactoe.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.tictactoe.kata.game.TicTacToeGameProcessor;

/**
 * 
 * @author AKS1405
 *
 */
public class TicTacToeKataApplicationTests {
	private TicTacToeGameProcessor ticTacToe;

	@Before
	public void setUp() {
		ticTacToe = new TicTacToeGameProcessor();
	}

	@Test
	public void testCrossMarking() {
		ticTacToe.markCross(0, 1);

		assertEquals(true, ticTacToe.isCross(0, 1));
	}

	@Test
	public void testMarkCrossOnBlank() {
		boolean crossPlaced = ticTacToe.markCross(1, 2);

		assertEquals(true, crossPlaced);
	}

	@Test
	public void testMarkingCrossOverExistingMarkedCross() {
		ticTacToe.markCross(2, 1);
		boolean crossPlaced = ticTacToe.markCross(2, 1);

		assertEquals(false, crossPlaced);
	}	
}