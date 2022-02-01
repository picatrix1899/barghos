package org.barghos.math.api.point2;

import org.barghos.core.api.tuple2.Tup2fW;
import org.barghos.math.api.vector2.Vec2fW;

/**
 * This interface grants writeonly access to any 2-dimensional float point.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only writes data to the parameter.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Point2fW extends Tup2fW
{
	Vec2fW asWriteonlyVector();
	Vec2fW asWriteonlyVectorReference();
}
