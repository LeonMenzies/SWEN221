package swen221.cell.decay.rule;

import swen221.conway.model.Rule;
import swen221.conway.util.ConwayAbstractRule;

/**
 * This should implements a over-population rule:
 * 
 * "Any live cell with two live neighbors continues in stasis to the next
 * generation"
 * 
 * @author menzieleon
 *
 */
public class ContinueGenerationRule extends ConwayAbstractRule {

	@Override
	public int apply(int x, int y, int neighbours) {
		if (neighbours == 2) {
			// return the current state as it doesn't change
			return board.getCellState(x, y);
		} else {
			// This rule was not applied in this case
			return Rule.NOT_APPLICABLE;
		}
	}

}
