package org.barghos.math.api.point;

import org.barghos.core.api.tuple2.Tup2fBase;
import org.barghos.math.api.vector.Vec2fBase;

/**
 * This interface represents any modifiable 2-dimensional float point.
 * 
 * @author picatrix1899
 */
public interface Point2fBase extends Point2fR, Tup2fBase
{
	// MISSING_DOC
	Vec2fBase asVector();
}
