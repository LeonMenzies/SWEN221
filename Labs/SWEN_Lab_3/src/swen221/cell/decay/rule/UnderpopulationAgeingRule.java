package swen221.cell.decay.rule;

import swen221.conway.model.Rule;
import swen221.conway.util.ConwayAbstractRule;

/**
 * This should implements a under-population rule:
 * 
 * "Any live cell with fewer than two live neighbors gets older, as if caused by
 * under-population"
 * 
 * @author menzieleon
 *
 */
public class UnderpopulationAgeingRule extends ConwayAbstractRule {

	@Override
	public int apply(int x, int y, int neighbours) {
		if (neighbours < 2) {
			// Get the state increase and return it
			return board.getCellState(x, y) + 1;
		} else {
			// This rule was not applied in this case
			return Rule.NOT_APPLICABLE;
		}
	}

}
