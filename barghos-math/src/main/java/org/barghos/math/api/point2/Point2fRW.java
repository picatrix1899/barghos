package org.barghos.math.api.point2;

import org.barghos.core.api.tuple2.Tup2fRW;
import org.barghos.math.api.vector2.Vec2fRW;

/**
 * This interface grants read and write access to any 2-dimensional float point.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Point2fRW extends Point2fR, Point2fW, Tup2fRW
{
	Vec2fRW asVector();
	Vec2fRW asVectorReference();
}
