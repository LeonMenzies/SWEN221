// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a SWEN221 assignment.
// You may not distribute it in any other way without permission.
package swen221.conway.rules;

import swen221.conway.model.Rule;
import swen221.conway.util.ConwayAbstractRule;

/**
 * This should implement Conway's rule for underproduction:
 * 
 * "Any life cell with fewer than two live neighbors die, as if caused by
 * under-population"
 * 
 * @author menzieleon
 *
 */
public class ConwaysUnderpopulationRule extends ConwayAbstractRule {

	@Override
	public int apply(int x, int y, int neighbours) {
		if (neighbours < 2) {
			// This rule was applied in this case
			return ConwayAbstractRule.DEAD;
		} else {
			// This rule was not applied in this case
			return Rule.NOT_APPLICABLE;
		}
	}
}
