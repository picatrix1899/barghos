package org.barghos.math.api.point2;

import org.barghos.core.api.tuple2.Tup2dRW;
import org.barghos.math.api.vector2.Vec2dRW;

/**
 * This interface grants read and write access to any 2-dimensional double point.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Point2dRW extends Point2dR, Point2dW, Tup2dRW
{
	Vec2dRW asVector();
	Vec2dRW asVectorReference();
}
