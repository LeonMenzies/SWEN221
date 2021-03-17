// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a SWEN221 assignment.
// You may not distribute it in any other way without permission.
package swen221.conway;

import swen221.cell.decay.rule.ContinueGenerationRule;
import swen221.cell.decay.rule.HappinessAgeingRule;
import swen221.cell.decay.rule.OverpopulationAgeingRule;
import swen221.cell.decay.rule.UnderpopulationAgeingRule;
import swen221.conway.model.Board;
import swen221.conway.model.Rule;
import swen221.conway.model.Simulation;
import swen221.conway.view.BoardFrame;

public class CellDecayGameOfLife {
	/**
	 * The standard rule set for Conway's "Game of Life".
	 */
	public static final Rule[] CellDecayRules = { new UnderpopulationAgeingRule(),
			new HappinessAgeingRule(), new ContinueGenerationRule(),
			new OverpopulationAgeingRule() };

	/**
	 * The entry point for the GameOfLife application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Board board = new Board(50, 50);
		Simulation sim = new Simulation(board, CellDecayRules);
		new BoardFrame(sim);
	}
}
