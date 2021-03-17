package swen221.cell.decay.rule;

import swen221.conway.model.Rule;
import swen221.conway.util.ConwayAbstractRule;

/**
 * This should implements a over-population rule:
 * 
 * "Any live cell with more than three live neighbors gets older, as if by
 * over-population
 * 
 * @author menzieleon
 *
 */
public class OverpopulationAgeingRule extends ConwayAbstractRule {

	@Override
	public int apply(int x, int y, int neighbours) {
		if (neighbours > 3) {
			// Get the state increase and return it
			return board.getCellState(x, y) + 1;
		} else {
			// This rule was not applied in this case
			return Rule.NOT_APPLICABLE;
		}
	}

}
