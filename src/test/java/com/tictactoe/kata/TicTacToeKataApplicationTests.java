package com.tictactoe.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.tictactoe.kata.game.GAME_STATE;
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

	@Test
	public void testCircleMarking() {
		ticTacToe.markCircle(0, 1);

		assertEquals(true, ticTacToe.isCircle(0, 1));
	}

	@Test
	public void testMarkCircleOnBlank() {
		boolean circlePlaced = ticTacToe.markCircle(1, 2);

		assertEquals(true, circlePlaced);
	}

	@Test
	public void testMarkingCircleOverExistingMarkedCircle() {
		ticTacToe.markCircle(2, 2);
		boolean circlePlaced = ticTacToe.markCircle(2, 2);

		assertEquals(false, circlePlaced);
	}

	@Test
	public void testMarkingCircleOverExistingMarkedCross() {
		ticTacToe.markCross(2, 2);
		boolean circlePlaced = ticTacToe.markCircle(2, 2);

		assertEquals(false, circlePlaced);
	}

	@Test
	public void testMarkingCrossOverExistingMarkedCircle() {
		ticTacToe.markCircle(2, 1);
		boolean crossPlaced = ticTacToe.markCross(2, 1);

		assertEquals(false, crossPlaced);
	}

	@Test
	public void testThreeCircleMarkedInARowWins() {
		ticTacToe.markCircle(0, 0);
		ticTacToe.markCircle(0, 1);
		ticTacToe.markCircle(0, 2);
		assertEquals(GAME_STATE.CIRCLE, ticTacToe.getWinner());
		assertEquals(true, ticTacToe.isFinished());
	}
	
	@Test
	public void testThreeCrossMarkedInARowWins() {
		ticTacToe.markCross(0, 0);
		ticTacToe.markCross(0, 1);
		ticTacToe.markCross(0, 2);
		assertEquals(GAME_STATE.CROSS, ticTacToe.getWinner());
		assertEquals(true, ticTacToe.isFinished());
	}
	
	@Test
    public void testThreeCircleMarkedInAColWins() {
    	ticTacToe.markCircle(0, 0);
    	ticTacToe.markCircle(1, 0);
    	ticTacToe.markCircle(2, 0);
    	assertEquals(GAME_STATE.CIRCLE, ticTacToe.getWinner());
        assertEquals(true, ticTacToe.isFinished());
    }
	
	@Test
    public void testThreeCrossMarkedInAColWins() {
    	ticTacToe.markCross(0, 0);
    	ticTacToe.markCross(1, 0);
    	ticTacToe.markCross(2, 0);
    	assertEquals(GAME_STATE.CROSS, ticTacToe.getWinner());
        assertEquals(true, ticTacToe.isFinished());
    }
	
	@Test
    public void testThreeCircleMarkedDiagonally() {
    	ticTacToe.markCircle(0, 0);
    	ticTacToe.markCircle(1, 1);
    	ticTacToe.markCircle(2, 2);
    	assertEquals(GAME_STATE.CIRCLE, ticTacToe.getWinner());
        assertEquals(true, ticTacToe.isFinished());
    }
	
	@Test
    public void testThreeCrossMarkedDiagonally() {
    	ticTacToe.markCross(0, 0);
    	ticTacToe.markCross(1, 1);
    	ticTacToe.markCross(2, 2);
    	assertEquals(GAME_STATE.CROSS, ticTacToe.getWinner());
        assertEquals(true, ticTacToe.isFinished());
    }
	
	@Test
    public void testThreeCircleMarkedAntiDiagonally() {
    	ticTacToe.markCircle(0, 2);
    	ticTacToe.markCircle(1, 1);
    	ticTacToe.markCircle(2, 0);
    	assertEquals(GAME_STATE.CIRCLE, ticTacToe.getWinner());
        assertEquals(true, ticTacToe.isFinished());
    }
	
	@Test
    public void testThreeCrossMarkedAntiDiagonally() {
    	ticTacToe.markCross(0, 2);
    	ticTacToe.markCross(1, 1);
    	ticTacToe.markCross(2, 0);
    	assertEquals(GAME_STATE.CROSS, ticTacToe.getWinner());
        assertEquals(true, ticTacToe.isFinished());
    }
}