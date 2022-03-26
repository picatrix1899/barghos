package org.barghos.math.api.point;

import org.barghos.core.api.tuple2.Tup2dBase;
import org.barghos.math.api.vector.Vec2dBase;

/**
 * This interface represents any modifiable 2-dimensional double point.
 * 
 * @author picatrix1899
 */
public interface Point2dBase extends Point2dR, Tup2dBase
{
	// MISSING_DOC
	Vec2dBase asVector();
}
