package swen221.cell.decay.rule;

import swen221.conway.model.Rule;
import swen221.conway.util.ConwayAbstractRule;

/**
 * This should implements a happiness rule:
 * 
 * "Any live cell with exactly three live neighbors gets younger, as if by
 * happiness"
 * 
 * @author menzieleon
 *
 */
public class HappinessAgeingRule extends ConwayAbstractRule {

	@Override
	public int apply(int x, int y, int neighbours) {
		if (neighbours == 3) {
			// Get the state decrease and return it
			return board.getCellState(x, y) - 1;
		} else {
			// This rule was not applied in this case
			return Rule.NOT_APPLICABLE;
		}
	}

}
